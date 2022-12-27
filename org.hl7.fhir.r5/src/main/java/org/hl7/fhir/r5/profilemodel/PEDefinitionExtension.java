package org.hl7.fhir.r5.profilemodel;

import java.util.List;

import org.hl7.fhir.r5.model.CanonicalType;
import org.hl7.fhir.r5.model.ElementDefinition;
import org.hl7.fhir.r5.model.ElementDefinition.SlicingRules;
import org.hl7.fhir.r5.model.ElementDefinition.TypeRefComponent;
import org.hl7.fhir.r5.model.StructureDefinition;

public class PEDefinitionExtension extends PEDefinition {

  private StructureDefinition extension;
  private ElementDefinition sliceDefinition;
  private ElementDefinition eed;
  private ElementDefinition ved;

  public PEDefinitionExtension(PEBuilder builder, String name, 
      StructureDefinition baseStructure, ElementDefinition baseDefinition, 
      StructureDefinition profileStructure, ElementDefinition profileDefinition,
      ElementDefinition sliceDefinition, StructureDefinition extension) {
    super(builder, name, baseStructure, baseDefinition, profileStructure, profileDefinition);
    this.sliceDefinition = sliceDefinition;
    this.extension= extension;
    eed = extension.getSnapshot().getElementByPath("Extension.extension");
    ved = extension.getSnapshot().getElementByPath("Extension.value[x]"); 
  }

  @Override
  public void listTypes(List<PEType> types) {
    if (ved.isRequired() || eed.isProhibited()) {
      for (TypeRefComponent t : ved.getType()) {
        if (t.hasProfile()) {
          for (CanonicalType u : t.getProfile()) {
            types.add(builder.makeType(t, u));
          }
        } else {
          types.add(builder.makeType(t.getWorkingCode()));
        }
      }
    } else {
      types.add(builder.makeType("Extension"));
    }
  }

  @Override
  protected void makeChildren(String typeUrl, List<PEDefinition> children) {
    if (ved.isRequired() || eed.isProhibited()) {
      children.addAll(builder.listChildren(extension, ved, extension, ved, typeUrl));
    } else {
      if (eed.getSlicing().getRules() != SlicingRules.CLOSED) {
        children.addAll(builder.listChildren(extension, eed, extension, eed, "http://hl7.org/fhir/StructureDefinition/Extension", "value[x]", "url"));
      }      
      children.addAll(builder.listSlices(extension, eed, extension, eed));
    }
  }

  @Override
  public String fhirpath() {
    if (ved.isRequired() || eed.isProhibited()) {
      return "extension('"+extension.getUrl()+"').value";
    } else {
      return "extension('"+extension.getUrl()+"').extension";      
    }
  }

}