package org.hl7.fhir.r5.model;


/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, \
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this \
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, \
     this list of conditions and the following disclaimer in the documentation \
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\" AND \
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED \
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. \
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, \
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT \
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR \
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, \
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) \
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE \
  POSSIBILITY OF SUCH DAMAGE.
  */

// Generated on Thu, Mar 23, 2023 19:59+1100 for FHIR v5.0.0

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.utilities.Utilities;
import org.hl7.fhir.r5.model.Enumerations.*;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.ICompositeType;
import ca.uhn.fhir.model.api.annotation.ResourceDef;
import ca.uhn.fhir.model.api.annotation.SearchParamDefinition;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import ca.uhn.fhir.model.api.annotation.Child;
import ca.uhn.fhir.model.api.annotation.ChildOrder;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.api.annotation.Block;

/**
 * The CoverageEligibilityRequest provides patient and insurance coverage information to an insurer for them to respond, in the form of an CoverageEligibilityResponse, with information regarding whether the stated coverage is valid and in-force and optionally to provide the insurance details of the policy.
 */
@ResourceDef(name="CoverageEligibilityRequest", profile="http://hl7.org/fhir/StructureDefinition/CoverageEligibilityRequest")
public class CoverageEligibilityRequest extends DomainResource {

    public enum EligibilityRequestPurpose {
        /**
         * The prior authorization requirements for the listed, or discovered if specified, converages for the categories of service and/or specifed biling codes are requested.
         */
        AUTHREQUIREMENTS, 
        /**
         * The plan benefits and optionally benefits consumed  for the listed, or discovered if specified, converages are requested.
         */
        BENEFITS, 
        /**
         * The insurer is requested to report on any coverages which they are aware of in addition to any specifed.
         */
        DISCOVERY, 
        /**
         * A check that the specified coverages are in-force is requested.
         */
        VALIDATION, 
        /**
         * added to help the parsers with the generic types
         */
        NULL;
        public static EligibilityRequestPurpose fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("auth-requirements".equals(codeString))
          return AUTHREQUIREMENTS;
        if ("benefits".equals(codeString))
          return BENEFITS;
        if ("discovery".equals(codeString))
          return DISCOVERY;
        if ("validation".equals(codeString))
          return VALIDATION;
        if (Configuration.isAcceptInvalidEnums())
          return null;
        else
          throw new FHIRException("Unknown EligibilityRequestPurpose code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case AUTHREQUIREMENTS: return "auth-requirements";
            case BENEFITS: return "benefits";
            case DISCOVERY: return "discovery";
            case VALIDATION: return "validation";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getSystem() {
          switch (this) {
            case AUTHREQUIREMENTS: return "http://hl7.org/fhir/eligibilityrequest-purpose";
            case BENEFITS: return "http://hl7.org/fhir/eligibilityrequest-purpose";
            case DISCOVERY: return "http://hl7.org/fhir/eligibilityrequest-purpose";
            case VALIDATION: return "http://hl7.org/fhir/eligibilityrequest-purpose";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDefinition() {
          switch (this) {
            case AUTHREQUIREMENTS: return "The prior authorization requirements for the listed, or discovered if specified, converages for the categories of service and/or specifed biling codes are requested.";
            case BENEFITS: return "The plan benefits and optionally benefits consumed  for the listed, or discovered if specified, converages are requested.";
            case DISCOVERY: return "The insurer is requested to report on any coverages which they are aware of in addition to any specifed.";
            case VALIDATION: return "A check that the specified coverages are in-force is requested.";
            case NULL: return null;
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case AUTHREQUIREMENTS: return "Coverage auth-requirements";
            case BENEFITS: return "Coverage benefits";
            case DISCOVERY: return "Coverage Discovery";
            case VALIDATION: return "Coverage Validation";
            case NULL: return null;
            default: return "?";
          }
        }
    }

  public static class EligibilityRequestPurposeEnumFactory implements EnumFactory<EligibilityRequestPurpose> {
    public EligibilityRequestPurpose fromCode(String codeString) throws IllegalArgumentException {
      if (codeString == null || "".equals(codeString))
            if (codeString == null || "".equals(codeString))
                return null;
        if ("auth-requirements".equals(codeString))
          return EligibilityRequestPurpose.AUTHREQUIREMENTS;
        if ("benefits".equals(codeString))
          return EligibilityRequestPurpose.BENEFITS;
        if ("discovery".equals(codeString))
          return EligibilityRequestPurpose.DISCOVERY;
        if ("validation".equals(codeString))
          return EligibilityRequestPurpose.VALIDATION;
        throw new IllegalArgumentException("Unknown EligibilityRequestPurpose code '"+codeString+"'");
        }
        public Enumeration<EligibilityRequestPurpose> fromType(PrimitiveType<?> code) throws FHIRException {
          if (code == null)
            return null;
          if (code.isEmpty())
            return new Enumeration<EligibilityRequestPurpose>(this, EligibilityRequestPurpose.NULL, code);
          String codeString = ((PrimitiveType) code).asStringValue();
          if (codeString == null || "".equals(codeString))
            return new Enumeration<EligibilityRequestPurpose>(this, EligibilityRequestPurpose.NULL, code);
        if ("auth-requirements".equals(codeString))
          return new Enumeration<EligibilityRequestPurpose>(this, EligibilityRequestPurpose.AUTHREQUIREMENTS, code);
        if ("benefits".equals(codeString))
          return new Enumeration<EligibilityRequestPurpose>(this, EligibilityRequestPurpose.BENEFITS, code);
        if ("discovery".equals(codeString))
          return new Enumeration<EligibilityRequestPurpose>(this, EligibilityRequestPurpose.DISCOVERY, code);
        if ("validation".equals(codeString))
          return new Enumeration<EligibilityRequestPurpose>(this, EligibilityRequestPurpose.VALIDATION, code);
        throw new FHIRException("Unknown EligibilityRequestPurpose code '"+codeString+"'");
        }
    public String toCode(EligibilityRequestPurpose code) {
      if (code == EligibilityRequestPurpose.AUTHREQUIREMENTS)
        return "auth-requirements";
      if (code == EligibilityRequestPurpose.BENEFITS)
        return "benefits";
      if (code == EligibilityRequestPurpose.DISCOVERY)
        return "discovery";
      if (code == EligibilityRequestPurpose.VALIDATION)
        return "validation";
      return "?";
      }
    public String toSystem(EligibilityRequestPurpose code) {
      return code.getSystem();
      }
    }

    @Block()
    public static class CoverageEligibilityRequestEventComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A coded event such as when a service is expected or a card printed.
         */
        @Child(name = "type", type = {CodeableConcept.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Specific event", formalDefinition="A coded event such as when a service is expected or a card printed." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/datestype")
        protected CodeableConcept type;

        /**
         * A date or period in the past or future indicating when the event occurred or is expectd to occur.
         */
        @Child(name = "when", type = {DateTimeType.class, Period.class}, order=2, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Occurance date or period", formalDefinition="A date or period in the past or future indicating when the event occurred or is expectd to occur." )
        protected DataType when;

        private static final long serialVersionUID = -634897375L;

    /**
     * Constructor
     */
      public CoverageEligibilityRequestEventComponent() {
        super();
      }

    /**
     * Constructor
     */
      public CoverageEligibilityRequestEventComponent(CodeableConcept type, DataType when) {
        super();
        this.setType(type);
        this.setWhen(when);
      }

        /**
         * @return {@link #type} (A coded event such as when a service is expected or a card printed.)
         */
        public CodeableConcept getType() { 
          if (this.type == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create CoverageEligibilityRequestEventComponent.type");
            else if (Configuration.doAutoCreate())
              this.type = new CodeableConcept(); // cc
          return this.type;
        }

        public boolean hasType() { 
          return this.type != null && !this.type.isEmpty();
        }

        /**
         * @param value {@link #type} (A coded event such as when a service is expected or a card printed.)
         */
        public CoverageEligibilityRequestEventComponent setType(CodeableConcept value) { 
          this.type = value;
          return this;
        }

        /**
         * @return {@link #when} (A date or period in the past or future indicating when the event occurred or is expectd to occur.)
         */
        public DataType getWhen() { 
          return this.when;
        }

        /**
         * @return {@link #when} (A date or period in the past or future indicating when the event occurred or is expectd to occur.)
         */
        public DateTimeType getWhenDateTimeType() throws FHIRException { 
          if (this.when == null)
            this.when = new DateTimeType();
          if (!(this.when instanceof DateTimeType))
            throw new FHIRException("Type mismatch: the type DateTimeType was expected, but "+this.when.getClass().getName()+" was encountered");
          return (DateTimeType) this.when;
        }

        public boolean hasWhenDateTimeType() { 
          return this != null && this.when instanceof DateTimeType;
        }

        /**
         * @return {@link #when} (A date or period in the past or future indicating when the event occurred or is expectd to occur.)
         */
        public Period getWhenPeriod() throws FHIRException { 
          if (this.when == null)
            this.when = new Period();
          if (!(this.when instanceof Period))
            throw new FHIRException("Type mismatch: the type Period was expected, but "+this.when.getClass().getName()+" was encountered");
          return (Period) this.when;
        }

        public boolean hasWhenPeriod() { 
          return this != null && this.when instanceof Period;
        }

        public boolean hasWhen() { 
          return this.when != null && !this.when.isEmpty();
        }

        /**
         * @param value {@link #when} (A date or period in the past or future indicating when the event occurred or is expectd to occur.)
         */
        public CoverageEligibilityRequestEventComponent setWhen(DataType value) { 
          if (value != null && !(value instanceof DateTimeType || value instanceof Period))
            throw new FHIRException("Not the right type for CoverageEligibilityRequest.event.when[x]: "+value.fhirType());
          this.when = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("type", "CodeableConcept", "A coded event such as when a service is expected or a card printed.", 0, 1, type));
          children.add(new Property("when[x]", "dateTime|Period", "A date or period in the past or future indicating when the event occurred or is expectd to occur.", 0, 1, when));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 3575610: /*type*/  return new Property("type", "CodeableConcept", "A coded event such as when a service is expected or a card printed.", 0, 1, type);
          case 1312831238: /*when[x]*/  return new Property("when[x]", "dateTime|Period", "A date or period in the past or future indicating when the event occurred or is expectd to occur.", 0, 1, when);
          case 3648314: /*when*/  return new Property("when[x]", "dateTime|Period", "A date or period in the past or future indicating when the event occurred or is expectd to occur.", 0, 1, when);
          case -1785502475: /*whenDateTime*/  return new Property("when[x]", "dateTime", "A date or period in the past or future indicating when the event occurred or is expectd to occur.", 0, 1, when);
          case 251476379: /*whenPeriod*/  return new Property("when[x]", "Period", "A date or period in the past or future indicating when the event occurred or is expectd to occur.", 0, 1, when);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return this.type == null ? new Base[0] : new Base[] {this.type}; // CodeableConcept
        case 3648314: /*when*/ return this.when == null ? new Base[0] : new Base[] {this.when}; // DataType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 3575610: // type
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 3648314: // when
          this.when = TypeConvertor.castToType(value); // DataType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("type")) {
          this.type = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("when[x]")) {
          this.when = TypeConvertor.castToType(value); // DataType
        } else
          return super.setProperty(name, value);
        return value;
      }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
        if (name.equals("type")) {
          this.type = null;
        } else if (name.equals("when[x]")) {
          this.when = null;
        } else
          super.removeChild(name, value);
        
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610:  return getType();
        case 1312831238:  return getWhen();
        case 3648314:  return getWhen();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 3575610: /*type*/ return new String[] {"CodeableConcept"};
        case 3648314: /*when*/ return new String[] {"dateTime", "Period"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("type")) {
          this.type = new CodeableConcept();
          return this.type;
        }
        else if (name.equals("whenDateTime")) {
          this.when = new DateTimeType();
          return this.when;
        }
        else if (name.equals("whenPeriod")) {
          this.when = new Period();
          return this.when;
        }
        else
          return super.addChild(name);
      }

      public CoverageEligibilityRequestEventComponent copy() {
        CoverageEligibilityRequestEventComponent dst = new CoverageEligibilityRequestEventComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(CoverageEligibilityRequestEventComponent dst) {
        super.copyValues(dst);
        dst.type = type == null ? null : type.copy();
        dst.when = when == null ? null : when.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof CoverageEligibilityRequestEventComponent))
          return false;
        CoverageEligibilityRequestEventComponent o = (CoverageEligibilityRequestEventComponent) other_;
        return compareDeep(type, o.type, true) && compareDeep(when, o.when, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof CoverageEligibilityRequestEventComponent))
          return false;
        CoverageEligibilityRequestEventComponent o = (CoverageEligibilityRequestEventComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(type, when);
      }

  public String fhirType() {
    return "CoverageEligibilityRequest.event";

  }

  }

    @Block()
    public static class SupportingInformationComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A number to uniquely identify supporting information entries.
         */
        @Child(name = "sequence", type = {PositiveIntType.class}, order=1, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Information instance identifier", formalDefinition="A number to uniquely identify supporting information entries." )
        protected PositiveIntType sequence;

        /**
         * Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.
         */
        @Child(name = "information", type = {Reference.class}, order=2, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Data to be provided", formalDefinition="Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data." )
        protected Reference information;

        /**
         * The supporting materials are applicable for all detail items, product/servce categories and specific billing codes.
         */
        @Child(name = "appliesToAll", type = {BooleanType.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Applies to all items", formalDefinition="The supporting materials are applicable for all detail items, product/servce categories and specific billing codes." )
        protected BooleanType appliesToAll;

        private static final long serialVersionUID = -1430960090L;

    /**
     * Constructor
     */
      public SupportingInformationComponent() {
        super();
      }

    /**
     * Constructor
     */
      public SupportingInformationComponent(int sequence, Reference information) {
        super();
        this.setSequence(sequence);
        this.setInformation(information);
      }

        /**
         * @return {@link #sequence} (A number to uniquely identify supporting information entries.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
         */
        public PositiveIntType getSequenceElement() { 
          if (this.sequence == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SupportingInformationComponent.sequence");
            else if (Configuration.doAutoCreate())
              this.sequence = new PositiveIntType(); // bb
          return this.sequence;
        }

        public boolean hasSequenceElement() { 
          return this.sequence != null && !this.sequence.isEmpty();
        }

        public boolean hasSequence() { 
          return this.sequence != null && !this.sequence.isEmpty();
        }

        /**
         * @param value {@link #sequence} (A number to uniquely identify supporting information entries.). This is the underlying object with id, value and extensions. The accessor "getSequence" gives direct access to the value
         */
        public SupportingInformationComponent setSequenceElement(PositiveIntType value) { 
          this.sequence = value;
          return this;
        }

        /**
         * @return A number to uniquely identify supporting information entries.
         */
        public int getSequence() { 
          return this.sequence == null || this.sequence.isEmpty() ? 0 : this.sequence.getValue();
        }

        /**
         * @param value A number to uniquely identify supporting information entries.
         */
        public SupportingInformationComponent setSequence(int value) { 
            if (this.sequence == null)
              this.sequence = new PositiveIntType();
            this.sequence.setValue(value);
          return this;
        }

        /**
         * @return {@link #information} (Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.)
         */
        public Reference getInformation() { 
          if (this.information == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SupportingInformationComponent.information");
            else if (Configuration.doAutoCreate())
              this.information = new Reference(); // cc
          return this.information;
        }

        public boolean hasInformation() { 
          return this.information != null && !this.information.isEmpty();
        }

        /**
         * @param value {@link #information} (Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.)
         */
        public SupportingInformationComponent setInformation(Reference value) { 
          this.information = value;
          return this;
        }

        /**
         * @return {@link #appliesToAll} (The supporting materials are applicable for all detail items, product/servce categories and specific billing codes.). This is the underlying object with id, value and extensions. The accessor "getAppliesToAll" gives direct access to the value
         */
        public BooleanType getAppliesToAllElement() { 
          if (this.appliesToAll == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create SupportingInformationComponent.appliesToAll");
            else if (Configuration.doAutoCreate())
              this.appliesToAll = new BooleanType(); // bb
          return this.appliesToAll;
        }

        public boolean hasAppliesToAllElement() { 
          return this.appliesToAll != null && !this.appliesToAll.isEmpty();
        }

        public boolean hasAppliesToAll() { 
          return this.appliesToAll != null && !this.appliesToAll.isEmpty();
        }

        /**
         * @param value {@link #appliesToAll} (The supporting materials are applicable for all detail items, product/servce categories and specific billing codes.). This is the underlying object with id, value and extensions. The accessor "getAppliesToAll" gives direct access to the value
         */
        public SupportingInformationComponent setAppliesToAllElement(BooleanType value) { 
          this.appliesToAll = value;
          return this;
        }

        /**
         * @return The supporting materials are applicable for all detail items, product/servce categories and specific billing codes.
         */
        public boolean getAppliesToAll() { 
          return this.appliesToAll == null || this.appliesToAll.isEmpty() ? false : this.appliesToAll.getValue();
        }

        /**
         * @param value The supporting materials are applicable for all detail items, product/servce categories and specific billing codes.
         */
        public SupportingInformationComponent setAppliesToAll(boolean value) { 
            if (this.appliesToAll == null)
              this.appliesToAll = new BooleanType();
            this.appliesToAll.setValue(value);
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("sequence", "positiveInt", "A number to uniquely identify supporting information entries.", 0, 1, sequence));
          children.add(new Property("information", "Reference(Any)", "Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.", 0, 1, information));
          children.add(new Property("appliesToAll", "boolean", "The supporting materials are applicable for all detail items, product/servce categories and specific billing codes.", 0, 1, appliesToAll));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 1349547969: /*sequence*/  return new Property("sequence", "positiveInt", "A number to uniquely identify supporting information entries.", 0, 1, sequence);
          case 1968600364: /*information*/  return new Property("information", "Reference(Any)", "Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data.", 0, 1, information);
          case -1096846342: /*appliesToAll*/  return new Property("appliesToAll", "boolean", "The supporting materials are applicable for all detail items, product/servce categories and specific billing codes.", 0, 1, appliesToAll);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 1349547969: /*sequence*/ return this.sequence == null ? new Base[0] : new Base[] {this.sequence}; // PositiveIntType
        case 1968600364: /*information*/ return this.information == null ? new Base[0] : new Base[] {this.information}; // Reference
        case -1096846342: /*appliesToAll*/ return this.appliesToAll == null ? new Base[0] : new Base[] {this.appliesToAll}; // BooleanType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 1349547969: // sequence
          this.sequence = TypeConvertor.castToPositiveInt(value); // PositiveIntType
          return value;
        case 1968600364: // information
          this.information = TypeConvertor.castToReference(value); // Reference
          return value;
        case -1096846342: // appliesToAll
          this.appliesToAll = TypeConvertor.castToBoolean(value); // BooleanType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("sequence")) {
          this.sequence = TypeConvertor.castToPositiveInt(value); // PositiveIntType
        } else if (name.equals("information")) {
          this.information = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("appliesToAll")) {
          this.appliesToAll = TypeConvertor.castToBoolean(value); // BooleanType
        } else
          return super.setProperty(name, value);
        return value;
      }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
        if (name.equals("sequence")) {
          this.sequence = null;
        } else if (name.equals("information")) {
          this.information = null;
        } else if (name.equals("appliesToAll")) {
          this.appliesToAll = null;
        } else
          super.removeChild(name, value);
        
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 1349547969:  return getSequenceElement();
        case 1968600364:  return getInformation();
        case -1096846342:  return getAppliesToAllElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 1349547969: /*sequence*/ return new String[] {"positiveInt"};
        case 1968600364: /*information*/ return new String[] {"Reference"};
        case -1096846342: /*appliesToAll*/ return new String[] {"boolean"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("sequence")) {
          throw new FHIRException("Cannot call addChild on a singleton property CoverageEligibilityRequest.supportingInfo.sequence");
        }
        else if (name.equals("information")) {
          this.information = new Reference();
          return this.information;
        }
        else if (name.equals("appliesToAll")) {
          throw new FHIRException("Cannot call addChild on a singleton property CoverageEligibilityRequest.supportingInfo.appliesToAll");
        }
        else
          return super.addChild(name);
      }

      public SupportingInformationComponent copy() {
        SupportingInformationComponent dst = new SupportingInformationComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(SupportingInformationComponent dst) {
        super.copyValues(dst);
        dst.sequence = sequence == null ? null : sequence.copy();
        dst.information = information == null ? null : information.copy();
        dst.appliesToAll = appliesToAll == null ? null : appliesToAll.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof SupportingInformationComponent))
          return false;
        SupportingInformationComponent o = (SupportingInformationComponent) other_;
        return compareDeep(sequence, o.sequence, true) && compareDeep(information, o.information, true)
           && compareDeep(appliesToAll, o.appliesToAll, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof SupportingInformationComponent))
          return false;
        SupportingInformationComponent o = (SupportingInformationComponent) other_;
        return compareValues(sequence, o.sequence, true) && compareValues(appliesToAll, o.appliesToAll, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(sequence, information, appliesToAll
          );
      }

  public String fhirType() {
    return "CoverageEligibilityRequest.supportingInfo";

  }

  }

    @Block()
    public static class InsuranceComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * A flag to indicate that this Coverage is to be used for evaluation of this request when set to true.
         */
        @Child(name = "focal", type = {BooleanType.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Applicable coverage", formalDefinition="A flag to indicate that this Coverage is to be used for evaluation of this request when set to true." )
        protected BooleanType focal;

        /**
         * Reference to the insurance card level information contained in the Coverage resource. The coverage issuing insurer will use these details to locate the patient's actual coverage within the insurer's information system.
         */
        @Child(name = "coverage", type = {Coverage.class}, order=2, min=1, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Insurance information", formalDefinition="Reference to the insurance card level information contained in the Coverage resource. The coverage issuing insurer will use these details to locate the patient's actual coverage within the insurer's information system." )
        protected Reference coverage;

        /**
         * A business agreement number established between the provider and the insurer for special business processing purposes.
         */
        @Child(name = "businessArrangement", type = {StringType.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Additional provider contract number", formalDefinition="A business agreement number established between the provider and the insurer for special business processing purposes." )
        protected StringType businessArrangement;

        private static final long serialVersionUID = -1656150261L;

    /**
     * Constructor
     */
      public InsuranceComponent() {
        super();
      }

    /**
     * Constructor
     */
      public InsuranceComponent(Reference coverage) {
        super();
        this.setCoverage(coverage);
      }

        /**
         * @return {@link #focal} (A flag to indicate that this Coverage is to be used for evaluation of this request when set to true.). This is the underlying object with id, value and extensions. The accessor "getFocal" gives direct access to the value
         */
        public BooleanType getFocalElement() { 
          if (this.focal == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create InsuranceComponent.focal");
            else if (Configuration.doAutoCreate())
              this.focal = new BooleanType(); // bb
          return this.focal;
        }

        public boolean hasFocalElement() { 
          return this.focal != null && !this.focal.isEmpty();
        }

        public boolean hasFocal() { 
          return this.focal != null && !this.focal.isEmpty();
        }

        /**
         * @param value {@link #focal} (A flag to indicate that this Coverage is to be used for evaluation of this request when set to true.). This is the underlying object with id, value and extensions. The accessor "getFocal" gives direct access to the value
         */
        public InsuranceComponent setFocalElement(BooleanType value) { 
          this.focal = value;
          return this;
        }

        /**
         * @return A flag to indicate that this Coverage is to be used for evaluation of this request when set to true.
         */
        public boolean getFocal() { 
          return this.focal == null || this.focal.isEmpty() ? false : this.focal.getValue();
        }

        /**
         * @param value A flag to indicate that this Coverage is to be used for evaluation of this request when set to true.
         */
        public InsuranceComponent setFocal(boolean value) { 
            if (this.focal == null)
              this.focal = new BooleanType();
            this.focal.setValue(value);
          return this;
        }

        /**
         * @return {@link #coverage} (Reference to the insurance card level information contained in the Coverage resource. The coverage issuing insurer will use these details to locate the patient's actual coverage within the insurer's information system.)
         */
        public Reference getCoverage() { 
          if (this.coverage == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create InsuranceComponent.coverage");
            else if (Configuration.doAutoCreate())
              this.coverage = new Reference(); // cc
          return this.coverage;
        }

        public boolean hasCoverage() { 
          return this.coverage != null && !this.coverage.isEmpty();
        }

        /**
         * @param value {@link #coverage} (Reference to the insurance card level information contained in the Coverage resource. The coverage issuing insurer will use these details to locate the patient's actual coverage within the insurer's information system.)
         */
        public InsuranceComponent setCoverage(Reference value) { 
          this.coverage = value;
          return this;
        }

        /**
         * @return {@link #businessArrangement} (A business agreement number established between the provider and the insurer for special business processing purposes.). This is the underlying object with id, value and extensions. The accessor "getBusinessArrangement" gives direct access to the value
         */
        public StringType getBusinessArrangementElement() { 
          if (this.businessArrangement == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create InsuranceComponent.businessArrangement");
            else if (Configuration.doAutoCreate())
              this.businessArrangement = new StringType(); // bb
          return this.businessArrangement;
        }

        public boolean hasBusinessArrangementElement() { 
          return this.businessArrangement != null && !this.businessArrangement.isEmpty();
        }

        public boolean hasBusinessArrangement() { 
          return this.businessArrangement != null && !this.businessArrangement.isEmpty();
        }

        /**
         * @param value {@link #businessArrangement} (A business agreement number established between the provider and the insurer for special business processing purposes.). This is the underlying object with id, value and extensions. The accessor "getBusinessArrangement" gives direct access to the value
         */
        public InsuranceComponent setBusinessArrangementElement(StringType value) { 
          this.businessArrangement = value;
          return this;
        }

        /**
         * @return A business agreement number established between the provider and the insurer for special business processing purposes.
         */
        public String getBusinessArrangement() { 
          return this.businessArrangement == null ? null : this.businessArrangement.getValue();
        }

        /**
         * @param value A business agreement number established between the provider and the insurer for special business processing purposes.
         */
        public InsuranceComponent setBusinessArrangement(String value) { 
          if (Utilities.noString(value))
            this.businessArrangement = null;
          else {
            if (this.businessArrangement == null)
              this.businessArrangement = new StringType();
            this.businessArrangement.setValue(value);
          }
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("focal", "boolean", "A flag to indicate that this Coverage is to be used for evaluation of this request when set to true.", 0, 1, focal));
          children.add(new Property("coverage", "Reference(Coverage)", "Reference to the insurance card level information contained in the Coverage resource. The coverage issuing insurer will use these details to locate the patient's actual coverage within the insurer's information system.", 0, 1, coverage));
          children.add(new Property("businessArrangement", "string", "A business agreement number established between the provider and the insurer for special business processing purposes.", 0, 1, businessArrangement));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case 97604197: /*focal*/  return new Property("focal", "boolean", "A flag to indicate that this Coverage is to be used for evaluation of this request when set to true.", 0, 1, focal);
          case -351767064: /*coverage*/  return new Property("coverage", "Reference(Coverage)", "Reference to the insurance card level information contained in the Coverage resource. The coverage issuing insurer will use these details to locate the patient's actual coverage within the insurer's information system.", 0, 1, coverage);
          case 259920682: /*businessArrangement*/  return new Property("businessArrangement", "string", "A business agreement number established between the provider and the insurer for special business processing purposes.", 0, 1, businessArrangement);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 97604197: /*focal*/ return this.focal == null ? new Base[0] : new Base[] {this.focal}; // BooleanType
        case -351767064: /*coverage*/ return this.coverage == null ? new Base[0] : new Base[] {this.coverage}; // Reference
        case 259920682: /*businessArrangement*/ return this.businessArrangement == null ? new Base[0] : new Base[] {this.businessArrangement}; // StringType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 97604197: // focal
          this.focal = TypeConvertor.castToBoolean(value); // BooleanType
          return value;
        case -351767064: // coverage
          this.coverage = TypeConvertor.castToReference(value); // Reference
          return value;
        case 259920682: // businessArrangement
          this.businessArrangement = TypeConvertor.castToString(value); // StringType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("focal")) {
          this.focal = TypeConvertor.castToBoolean(value); // BooleanType
        } else if (name.equals("coverage")) {
          this.coverage = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("businessArrangement")) {
          this.businessArrangement = TypeConvertor.castToString(value); // StringType
        } else
          return super.setProperty(name, value);
        return value;
      }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
        if (name.equals("focal")) {
          this.focal = null;
        } else if (name.equals("coverage")) {
          this.coverage = null;
        } else if (name.equals("businessArrangement")) {
          this.businessArrangement = null;
        } else
          super.removeChild(name, value);
        
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 97604197:  return getFocalElement();
        case -351767064:  return getCoverage();
        case 259920682:  return getBusinessArrangementElement();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 97604197: /*focal*/ return new String[] {"boolean"};
        case -351767064: /*coverage*/ return new String[] {"Reference"};
        case 259920682: /*businessArrangement*/ return new String[] {"string"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("focal")) {
          throw new FHIRException("Cannot call addChild on a singleton property CoverageEligibilityRequest.insurance.focal");
        }
        else if (name.equals("coverage")) {
          this.coverage = new Reference();
          return this.coverage;
        }
        else if (name.equals("businessArrangement")) {
          throw new FHIRException("Cannot call addChild on a singleton property CoverageEligibilityRequest.insurance.businessArrangement");
        }
        else
          return super.addChild(name);
      }

      public InsuranceComponent copy() {
        InsuranceComponent dst = new InsuranceComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(InsuranceComponent dst) {
        super.copyValues(dst);
        dst.focal = focal == null ? null : focal.copy();
        dst.coverage = coverage == null ? null : coverage.copy();
        dst.businessArrangement = businessArrangement == null ? null : businessArrangement.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof InsuranceComponent))
          return false;
        InsuranceComponent o = (InsuranceComponent) other_;
        return compareDeep(focal, o.focal, true) && compareDeep(coverage, o.coverage, true) && compareDeep(businessArrangement, o.businessArrangement, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof InsuranceComponent))
          return false;
        InsuranceComponent o = (InsuranceComponent) other_;
        return compareValues(focal, o.focal, true) && compareValues(businessArrangement, o.businessArrangement, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(focal, coverage, businessArrangement
          );
      }

  public String fhirType() {
    return "CoverageEligibilityRequest.insurance";

  }

  }

    @Block()
    public static class DetailsComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * Exceptions, special conditions and supporting information applicable for this service or product line.
         */
        @Child(name = "supportingInfoSequence", type = {PositiveIntType.class}, order=1, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Applicable exception or supporting information", formalDefinition="Exceptions, special conditions and supporting information applicable for this service or product line." )
        protected List<PositiveIntType> supportingInfoSequence;

        /**
         * Code to identify the general type of benefits under which products and services are provided.
         */
        @Child(name = "category", type = {CodeableConcept.class}, order=2, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Benefit classification", formalDefinition="Code to identify the general type of benefits under which products and services are provided." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/ex-benefitcategory")
        protected CodeableConcept category;

        /**
         * This contains the product, service, drug or other billing code for the item.
         */
        @Child(name = "productOrService", type = {CodeableConcept.class}, order=3, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Billing, service, product, or drug code", formalDefinition="This contains the product, service, drug or other billing code for the item." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/service-uscls")
        protected CodeableConcept productOrService;

        /**
         * Item typification or modifiers codes to convey additional context for the product or service.
         */
        @Child(name = "modifier", type = {CodeableConcept.class}, order=4, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Product or service billing modifiers", formalDefinition="Item typification or modifiers codes to convey additional context for the product or service." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/claim-modifiers")
        protected List<CodeableConcept> modifier;

        /**
         * The practitioner who is responsible for the product or service to be rendered to the patient.
         */
        @Child(name = "provider", type = {Practitioner.class, PractitionerRole.class}, order=5, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Perfoming practitioner", formalDefinition="The practitioner who is responsible for the product or service to be rendered to the patient." )
        protected Reference provider;

        /**
         * The number of repetitions of a service or product.
         */
        @Child(name = "quantity", type = {Quantity.class}, order=6, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Count of products or services", formalDefinition="The number of repetitions of a service or product." )
        protected Quantity quantity;

        /**
         * The amount charged to the patient by the provider for a single unit.
         */
        @Child(name = "unitPrice", type = {Money.class}, order=7, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Fee, charge or cost per item", formalDefinition="The amount charged to the patient by the provider for a single unit." )
        protected Money unitPrice;

        /**
         * Facility where the services will be provided.
         */
        @Child(name = "facility", type = {Location.class, Organization.class}, order=8, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Servicing facility", formalDefinition="Facility where the services will be provided." )
        protected Reference facility;

        /**
         * Patient diagnosis for which care is sought.
         */
        @Child(name = "diagnosis", type = {}, order=9, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Applicable diagnosis", formalDefinition="Patient diagnosis for which care is sought." )
        protected List<DiagnosisComponent> diagnosis;

        /**
         * The plan/proposal/order describing the proposed service in detail.
         */
        @Child(name = "detail", type = {Reference.class}, order=10, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
        @Description(shortDefinition="Product or service details", formalDefinition="The plan/proposal/order describing the proposed service in detail." )
        protected List<Reference> detail;

        private static final long serialVersionUID = 1615052611L;

    /**
     * Constructor
     */
      public DetailsComponent() {
        super();
      }

        /**
         * @return {@link #supportingInfoSequence} (Exceptions, special conditions and supporting information applicable for this service or product line.)
         */
        public List<PositiveIntType> getSupportingInfoSequence() { 
          if (this.supportingInfoSequence == null)
            this.supportingInfoSequence = new ArrayList<PositiveIntType>();
          return this.supportingInfoSequence;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public DetailsComponent setSupportingInfoSequence(List<PositiveIntType> theSupportingInfoSequence) { 
          this.supportingInfoSequence = theSupportingInfoSequence;
          return this;
        }

        public boolean hasSupportingInfoSequence() { 
          if (this.supportingInfoSequence == null)
            return false;
          for (PositiveIntType item : this.supportingInfoSequence)
            if (!item.isEmpty())
              return true;
          return false;
        }

        /**
         * @return {@link #supportingInfoSequence} (Exceptions, special conditions and supporting information applicable for this service or product line.)
         */
        public PositiveIntType addSupportingInfoSequenceElement() {//2 
          PositiveIntType t = new PositiveIntType();
          if (this.supportingInfoSequence == null)
            this.supportingInfoSequence = new ArrayList<PositiveIntType>();
          this.supportingInfoSequence.add(t);
          return t;
        }

        /**
         * @param value {@link #supportingInfoSequence} (Exceptions, special conditions and supporting information applicable for this service or product line.)
         */
        public DetailsComponent addSupportingInfoSequence(int value) { //1
          PositiveIntType t = new PositiveIntType();
          t.setValue(value);
          if (this.supportingInfoSequence == null)
            this.supportingInfoSequence = new ArrayList<PositiveIntType>();
          this.supportingInfoSequence.add(t);
          return this;
        }

        /**
         * @param value {@link #supportingInfoSequence} (Exceptions, special conditions and supporting information applicable for this service or product line.)
         */
        public boolean hasSupportingInfoSequence(int value) { 
          if (this.supportingInfoSequence == null)
            return false;
          for (PositiveIntType v : this.supportingInfoSequence)
            if (v.getValue().equals(value)) // positiveInt
              return true;
          return false;
        }

        /**
         * @return {@link #category} (Code to identify the general type of benefits under which products and services are provided.)
         */
        public CodeableConcept getCategory() { 
          if (this.category == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DetailsComponent.category");
            else if (Configuration.doAutoCreate())
              this.category = new CodeableConcept(); // cc
          return this.category;
        }

        public boolean hasCategory() { 
          return this.category != null && !this.category.isEmpty();
        }

        /**
         * @param value {@link #category} (Code to identify the general type of benefits under which products and services are provided.)
         */
        public DetailsComponent setCategory(CodeableConcept value) { 
          this.category = value;
          return this;
        }

        /**
         * @return {@link #productOrService} (This contains the product, service, drug or other billing code for the item.)
         */
        public CodeableConcept getProductOrService() { 
          if (this.productOrService == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DetailsComponent.productOrService");
            else if (Configuration.doAutoCreate())
              this.productOrService = new CodeableConcept(); // cc
          return this.productOrService;
        }

        public boolean hasProductOrService() { 
          return this.productOrService != null && !this.productOrService.isEmpty();
        }

        /**
         * @param value {@link #productOrService} (This contains the product, service, drug or other billing code for the item.)
         */
        public DetailsComponent setProductOrService(CodeableConcept value) { 
          this.productOrService = value;
          return this;
        }

        /**
         * @return {@link #modifier} (Item typification or modifiers codes to convey additional context for the product or service.)
         */
        public List<CodeableConcept> getModifier() { 
          if (this.modifier == null)
            this.modifier = new ArrayList<CodeableConcept>();
          return this.modifier;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public DetailsComponent setModifier(List<CodeableConcept> theModifier) { 
          this.modifier = theModifier;
          return this;
        }

        public boolean hasModifier() { 
          if (this.modifier == null)
            return false;
          for (CodeableConcept item : this.modifier)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public CodeableConcept addModifier() { //3
          CodeableConcept t = new CodeableConcept();
          if (this.modifier == null)
            this.modifier = new ArrayList<CodeableConcept>();
          this.modifier.add(t);
          return t;
        }

        public DetailsComponent addModifier(CodeableConcept t) { //3
          if (t == null)
            return this;
          if (this.modifier == null)
            this.modifier = new ArrayList<CodeableConcept>();
          this.modifier.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #modifier}, creating it if it does not already exist {3}
         */
        public CodeableConcept getModifierFirstRep() { 
          if (getModifier().isEmpty()) {
            addModifier();
          }
          return getModifier().get(0);
        }

        /**
         * @return {@link #provider} (The practitioner who is responsible for the product or service to be rendered to the patient.)
         */
        public Reference getProvider() { 
          if (this.provider == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DetailsComponent.provider");
            else if (Configuration.doAutoCreate())
              this.provider = new Reference(); // cc
          return this.provider;
        }

        public boolean hasProvider() { 
          return this.provider != null && !this.provider.isEmpty();
        }

        /**
         * @param value {@link #provider} (The practitioner who is responsible for the product or service to be rendered to the patient.)
         */
        public DetailsComponent setProvider(Reference value) { 
          this.provider = value;
          return this;
        }

        /**
         * @return {@link #quantity} (The number of repetitions of a service or product.)
         */
        public Quantity getQuantity() { 
          if (this.quantity == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DetailsComponent.quantity");
            else if (Configuration.doAutoCreate())
              this.quantity = new Quantity(); // cc
          return this.quantity;
        }

        public boolean hasQuantity() { 
          return this.quantity != null && !this.quantity.isEmpty();
        }

        /**
         * @param value {@link #quantity} (The number of repetitions of a service or product.)
         */
        public DetailsComponent setQuantity(Quantity value) { 
          this.quantity = value;
          return this;
        }

        /**
         * @return {@link #unitPrice} (The amount charged to the patient by the provider for a single unit.)
         */
        public Money getUnitPrice() { 
          if (this.unitPrice == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DetailsComponent.unitPrice");
            else if (Configuration.doAutoCreate())
              this.unitPrice = new Money(); // cc
          return this.unitPrice;
        }

        public boolean hasUnitPrice() { 
          return this.unitPrice != null && !this.unitPrice.isEmpty();
        }

        /**
         * @param value {@link #unitPrice} (The amount charged to the patient by the provider for a single unit.)
         */
        public DetailsComponent setUnitPrice(Money value) { 
          this.unitPrice = value;
          return this;
        }

        /**
         * @return {@link #facility} (Facility where the services will be provided.)
         */
        public Reference getFacility() { 
          if (this.facility == null)
            if (Configuration.errorOnAutoCreate())
              throw new Error("Attempt to auto-create DetailsComponent.facility");
            else if (Configuration.doAutoCreate())
              this.facility = new Reference(); // cc
          return this.facility;
        }

        public boolean hasFacility() { 
          return this.facility != null && !this.facility.isEmpty();
        }

        /**
         * @param value {@link #facility} (Facility where the services will be provided.)
         */
        public DetailsComponent setFacility(Reference value) { 
          this.facility = value;
          return this;
        }

        /**
         * @return {@link #diagnosis} (Patient diagnosis for which care is sought.)
         */
        public List<DiagnosisComponent> getDiagnosis() { 
          if (this.diagnosis == null)
            this.diagnosis = new ArrayList<DiagnosisComponent>();
          return this.diagnosis;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public DetailsComponent setDiagnosis(List<DiagnosisComponent> theDiagnosis) { 
          this.diagnosis = theDiagnosis;
          return this;
        }

        public boolean hasDiagnosis() { 
          if (this.diagnosis == null)
            return false;
          for (DiagnosisComponent item : this.diagnosis)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public DiagnosisComponent addDiagnosis() { //3
          DiagnosisComponent t = new DiagnosisComponent();
          if (this.diagnosis == null)
            this.diagnosis = new ArrayList<DiagnosisComponent>();
          this.diagnosis.add(t);
          return t;
        }

        public DetailsComponent addDiagnosis(DiagnosisComponent t) { //3
          if (t == null)
            return this;
          if (this.diagnosis == null)
            this.diagnosis = new ArrayList<DiagnosisComponent>();
          this.diagnosis.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #diagnosis}, creating it if it does not already exist {3}
         */
        public DiagnosisComponent getDiagnosisFirstRep() { 
          if (getDiagnosis().isEmpty()) {
            addDiagnosis();
          }
          return getDiagnosis().get(0);
        }

        /**
         * @return {@link #detail} (The plan/proposal/order describing the proposed service in detail.)
         */
        public List<Reference> getDetail() { 
          if (this.detail == null)
            this.detail = new ArrayList<Reference>();
          return this.detail;
        }

        /**
         * @return Returns a reference to <code>this</code> for easy method chaining
         */
        public DetailsComponent setDetail(List<Reference> theDetail) { 
          this.detail = theDetail;
          return this;
        }

        public boolean hasDetail() { 
          if (this.detail == null)
            return false;
          for (Reference item : this.detail)
            if (!item.isEmpty())
              return true;
          return false;
        }

        public Reference addDetail() { //3
          Reference t = new Reference();
          if (this.detail == null)
            this.detail = new ArrayList<Reference>();
          this.detail.add(t);
          return t;
        }

        public DetailsComponent addDetail(Reference t) { //3
          if (t == null)
            return this;
          if (this.detail == null)
            this.detail = new ArrayList<Reference>();
          this.detail.add(t);
          return this;
        }

        /**
         * @return The first repetition of repeating field {@link #detail}, creating it if it does not already exist {3}
         */
        public Reference getDetailFirstRep() { 
          if (getDetail().isEmpty()) {
            addDetail();
          }
          return getDetail().get(0);
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("supportingInfoSequence", "positiveInt", "Exceptions, special conditions and supporting information applicable for this service or product line.", 0, java.lang.Integer.MAX_VALUE, supportingInfoSequence));
          children.add(new Property("category", "CodeableConcept", "Code to identify the general type of benefits under which products and services are provided.", 0, 1, category));
          children.add(new Property("productOrService", "CodeableConcept", "This contains the product, service, drug or other billing code for the item.", 0, 1, productOrService));
          children.add(new Property("modifier", "CodeableConcept", "Item typification or modifiers codes to convey additional context for the product or service.", 0, java.lang.Integer.MAX_VALUE, modifier));
          children.add(new Property("provider", "Reference(Practitioner|PractitionerRole)", "The practitioner who is responsible for the product or service to be rendered to the patient.", 0, 1, provider));
          children.add(new Property("quantity", "Quantity", "The number of repetitions of a service or product.", 0, 1, quantity));
          children.add(new Property("unitPrice", "Money", "The amount charged to the patient by the provider for a single unit.", 0, 1, unitPrice));
          children.add(new Property("facility", "Reference(Location|Organization)", "Facility where the services will be provided.", 0, 1, facility));
          children.add(new Property("diagnosis", "", "Patient diagnosis for which care is sought.", 0, java.lang.Integer.MAX_VALUE, diagnosis));
          children.add(new Property("detail", "Reference(Any)", "The plan/proposal/order describing the proposed service in detail.", 0, java.lang.Integer.MAX_VALUE, detail));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -595860510: /*supportingInfoSequence*/  return new Property("supportingInfoSequence", "positiveInt", "Exceptions, special conditions and supporting information applicable for this service or product line.", 0, java.lang.Integer.MAX_VALUE, supportingInfoSequence);
          case 50511102: /*category*/  return new Property("category", "CodeableConcept", "Code to identify the general type of benefits under which products and services are provided.", 0, 1, category);
          case 1957227299: /*productOrService*/  return new Property("productOrService", "CodeableConcept", "This contains the product, service, drug or other billing code for the item.", 0, 1, productOrService);
          case -615513385: /*modifier*/  return new Property("modifier", "CodeableConcept", "Item typification or modifiers codes to convey additional context for the product or service.", 0, java.lang.Integer.MAX_VALUE, modifier);
          case -987494927: /*provider*/  return new Property("provider", "Reference(Practitioner|PractitionerRole)", "The practitioner who is responsible for the product or service to be rendered to the patient.", 0, 1, provider);
          case -1285004149: /*quantity*/  return new Property("quantity", "Quantity", "The number of repetitions of a service or product.", 0, 1, quantity);
          case -486196699: /*unitPrice*/  return new Property("unitPrice", "Money", "The amount charged to the patient by the provider for a single unit.", 0, 1, unitPrice);
          case 501116579: /*facility*/  return new Property("facility", "Reference(Location|Organization)", "Facility where the services will be provided.", 0, 1, facility);
          case 1196993265: /*diagnosis*/  return new Property("diagnosis", "", "Patient diagnosis for which care is sought.", 0, java.lang.Integer.MAX_VALUE, diagnosis);
          case -1335224239: /*detail*/  return new Property("detail", "Reference(Any)", "The plan/proposal/order describing the proposed service in detail.", 0, java.lang.Integer.MAX_VALUE, detail);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -595860510: /*supportingInfoSequence*/ return this.supportingInfoSequence == null ? new Base[0] : this.supportingInfoSequence.toArray(new Base[this.supportingInfoSequence.size()]); // PositiveIntType
        case 50511102: /*category*/ return this.category == null ? new Base[0] : new Base[] {this.category}; // CodeableConcept
        case 1957227299: /*productOrService*/ return this.productOrService == null ? new Base[0] : new Base[] {this.productOrService}; // CodeableConcept
        case -615513385: /*modifier*/ return this.modifier == null ? new Base[0] : this.modifier.toArray(new Base[this.modifier.size()]); // CodeableConcept
        case -987494927: /*provider*/ return this.provider == null ? new Base[0] : new Base[] {this.provider}; // Reference
        case -1285004149: /*quantity*/ return this.quantity == null ? new Base[0] : new Base[] {this.quantity}; // Quantity
        case -486196699: /*unitPrice*/ return this.unitPrice == null ? new Base[0] : new Base[] {this.unitPrice}; // Money
        case 501116579: /*facility*/ return this.facility == null ? new Base[0] : new Base[] {this.facility}; // Reference
        case 1196993265: /*diagnosis*/ return this.diagnosis == null ? new Base[0] : this.diagnosis.toArray(new Base[this.diagnosis.size()]); // DiagnosisComponent
        case -1335224239: /*detail*/ return this.detail == null ? new Base[0] : this.detail.toArray(new Base[this.detail.size()]); // Reference
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -595860510: // supportingInfoSequence
          this.getSupportingInfoSequence().add(TypeConvertor.castToPositiveInt(value)); // PositiveIntType
          return value;
        case 50511102: // category
          this.category = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case 1957227299: // productOrService
          this.productOrService = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -615513385: // modifier
          this.getModifier().add(TypeConvertor.castToCodeableConcept(value)); // CodeableConcept
          return value;
        case -987494927: // provider
          this.provider = TypeConvertor.castToReference(value); // Reference
          return value;
        case -1285004149: // quantity
          this.quantity = TypeConvertor.castToQuantity(value); // Quantity
          return value;
        case -486196699: // unitPrice
          this.unitPrice = TypeConvertor.castToMoney(value); // Money
          return value;
        case 501116579: // facility
          this.facility = TypeConvertor.castToReference(value); // Reference
          return value;
        case 1196993265: // diagnosis
          this.getDiagnosis().add((DiagnosisComponent) value); // DiagnosisComponent
          return value;
        case -1335224239: // detail
          this.getDetail().add(TypeConvertor.castToReference(value)); // Reference
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("supportingInfoSequence")) {
          this.getSupportingInfoSequence().add(TypeConvertor.castToPositiveInt(value));
        } else if (name.equals("category")) {
          this.category = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("productOrService")) {
          this.productOrService = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("modifier")) {
          this.getModifier().add(TypeConvertor.castToCodeableConcept(value));
        } else if (name.equals("provider")) {
          this.provider = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("quantity")) {
          this.quantity = TypeConvertor.castToQuantity(value); // Quantity
        } else if (name.equals("unitPrice")) {
          this.unitPrice = TypeConvertor.castToMoney(value); // Money
        } else if (name.equals("facility")) {
          this.facility = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("diagnosis")) {
          this.getDiagnosis().add((DiagnosisComponent) value);
        } else if (name.equals("detail")) {
          this.getDetail().add(TypeConvertor.castToReference(value));
        } else
          return super.setProperty(name, value);
        return value;
      }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
        if (name.equals("supportingInfoSequence")) {
          this.getSupportingInfoSequence().remove(value);
        } else if (name.equals("category")) {
          this.category = null;
        } else if (name.equals("productOrService")) {
          this.productOrService = null;
        } else if (name.equals("modifier")) {
          this.getModifier().remove(value);
        } else if (name.equals("provider")) {
          this.provider = null;
        } else if (name.equals("quantity")) {
          this.quantity = null;
        } else if (name.equals("unitPrice")) {
          this.unitPrice = null;
        } else if (name.equals("facility")) {
          this.facility = null;
        } else if (name.equals("diagnosis")) {
          this.getDiagnosis().add((DiagnosisComponent) value);
        } else if (name.equals("detail")) {
          this.getDetail().remove(value);
        } else
          super.removeChild(name, value);
        
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -595860510:  return addSupportingInfoSequenceElement();
        case 50511102:  return getCategory();
        case 1957227299:  return getProductOrService();
        case -615513385:  return addModifier(); 
        case -987494927:  return getProvider();
        case -1285004149:  return getQuantity();
        case -486196699:  return getUnitPrice();
        case 501116579:  return getFacility();
        case 1196993265:  return addDiagnosis(); 
        case -1335224239:  return addDetail(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -595860510: /*supportingInfoSequence*/ return new String[] {"positiveInt"};
        case 50511102: /*category*/ return new String[] {"CodeableConcept"};
        case 1957227299: /*productOrService*/ return new String[] {"CodeableConcept"};
        case -615513385: /*modifier*/ return new String[] {"CodeableConcept"};
        case -987494927: /*provider*/ return new String[] {"Reference"};
        case -1285004149: /*quantity*/ return new String[] {"Quantity"};
        case -486196699: /*unitPrice*/ return new String[] {"Money"};
        case 501116579: /*facility*/ return new String[] {"Reference"};
        case 1196993265: /*diagnosis*/ return new String[] {};
        case -1335224239: /*detail*/ return new String[] {"Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("supportingInfoSequence")) {
          throw new FHIRException("Cannot call addChild on a singleton property CoverageEligibilityRequest.item.supportingInfoSequence");
        }
        else if (name.equals("category")) {
          this.category = new CodeableConcept();
          return this.category;
        }
        else if (name.equals("productOrService")) {
          this.productOrService = new CodeableConcept();
          return this.productOrService;
        }
        else if (name.equals("modifier")) {
          return addModifier();
        }
        else if (name.equals("provider")) {
          this.provider = new Reference();
          return this.provider;
        }
        else if (name.equals("quantity")) {
          this.quantity = new Quantity();
          return this.quantity;
        }
        else if (name.equals("unitPrice")) {
          this.unitPrice = new Money();
          return this.unitPrice;
        }
        else if (name.equals("facility")) {
          this.facility = new Reference();
          return this.facility;
        }
        else if (name.equals("diagnosis")) {
          return addDiagnosis();
        }
        else if (name.equals("detail")) {
          return addDetail();
        }
        else
          return super.addChild(name);
      }

      public DetailsComponent copy() {
        DetailsComponent dst = new DetailsComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(DetailsComponent dst) {
        super.copyValues(dst);
        if (supportingInfoSequence != null) {
          dst.supportingInfoSequence = new ArrayList<PositiveIntType>();
          for (PositiveIntType i : supportingInfoSequence)
            dst.supportingInfoSequence.add(i.copy());
        };
        dst.category = category == null ? null : category.copy();
        dst.productOrService = productOrService == null ? null : productOrService.copy();
        if (modifier != null) {
          dst.modifier = new ArrayList<CodeableConcept>();
          for (CodeableConcept i : modifier)
            dst.modifier.add(i.copy());
        };
        dst.provider = provider == null ? null : provider.copy();
        dst.quantity = quantity == null ? null : quantity.copy();
        dst.unitPrice = unitPrice == null ? null : unitPrice.copy();
        dst.facility = facility == null ? null : facility.copy();
        if (diagnosis != null) {
          dst.diagnosis = new ArrayList<DiagnosisComponent>();
          for (DiagnosisComponent i : diagnosis)
            dst.diagnosis.add(i.copy());
        };
        if (detail != null) {
          dst.detail = new ArrayList<Reference>();
          for (Reference i : detail)
            dst.detail.add(i.copy());
        };
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof DetailsComponent))
          return false;
        DetailsComponent o = (DetailsComponent) other_;
        return compareDeep(supportingInfoSequence, o.supportingInfoSequence, true) && compareDeep(category, o.category, true)
           && compareDeep(productOrService, o.productOrService, true) && compareDeep(modifier, o.modifier, true)
           && compareDeep(provider, o.provider, true) && compareDeep(quantity, o.quantity, true) && compareDeep(unitPrice, o.unitPrice, true)
           && compareDeep(facility, o.facility, true) && compareDeep(diagnosis, o.diagnosis, true) && compareDeep(detail, o.detail, true)
          ;
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof DetailsComponent))
          return false;
        DetailsComponent o = (DetailsComponent) other_;
        return compareValues(supportingInfoSequence, o.supportingInfoSequence, true);
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(supportingInfoSequence, category
          , productOrService, modifier, provider, quantity, unitPrice, facility, diagnosis
          , detail);
      }

  public String fhirType() {
    return "CoverageEligibilityRequest.item";

  }

  }

    @Block()
    public static class DiagnosisComponent extends BackboneElement implements IBaseBackboneElement {
        /**
         * The nature of illness or problem in a coded form or as a reference to an external defined Condition.
         */
        @Child(name = "diagnosis", type = {CodeableConcept.class, Condition.class}, order=1, min=0, max=1, modifier=false, summary=false)
        @Description(shortDefinition="Nature of illness or problem", formalDefinition="The nature of illness or problem in a coded form or as a reference to an external defined Condition." )
        @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/icd-10")
        protected DataType diagnosis;

        private static final long serialVersionUID = 947131409L;

    /**
     * Constructor
     */
      public DiagnosisComponent() {
        super();
      }

        /**
         * @return {@link #diagnosis} (The nature of illness or problem in a coded form or as a reference to an external defined Condition.)
         */
        public DataType getDiagnosis() { 
          return this.diagnosis;
        }

        /**
         * @return {@link #diagnosis} (The nature of illness or problem in a coded form or as a reference to an external defined Condition.)
         */
        public CodeableConcept getDiagnosisCodeableConcept() throws FHIRException { 
          if (this.diagnosis == null)
            this.diagnosis = new CodeableConcept();
          if (!(this.diagnosis instanceof CodeableConcept))
            throw new FHIRException("Type mismatch: the type CodeableConcept was expected, but "+this.diagnosis.getClass().getName()+" was encountered");
          return (CodeableConcept) this.diagnosis;
        }

        public boolean hasDiagnosisCodeableConcept() { 
          return this != null && this.diagnosis instanceof CodeableConcept;
        }

        /**
         * @return {@link #diagnosis} (The nature of illness or problem in a coded form or as a reference to an external defined Condition.)
         */
        public Reference getDiagnosisReference() throws FHIRException { 
          if (this.diagnosis == null)
            this.diagnosis = new Reference();
          if (!(this.diagnosis instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but "+this.diagnosis.getClass().getName()+" was encountered");
          return (Reference) this.diagnosis;
        }

        public boolean hasDiagnosisReference() { 
          return this != null && this.diagnosis instanceof Reference;
        }

        public boolean hasDiagnosis() { 
          return this.diagnosis != null && !this.diagnosis.isEmpty();
        }

        /**
         * @param value {@link #diagnosis} (The nature of illness or problem in a coded form or as a reference to an external defined Condition.)
         */
        public DiagnosisComponent setDiagnosis(DataType value) { 
          if (value != null && !(value instanceof CodeableConcept || value instanceof Reference))
            throw new FHIRException("Not the right type for CoverageEligibilityRequest.item.diagnosis.diagnosis[x]: "+value.fhirType());
          this.diagnosis = value;
          return this;
        }

        protected void listChildren(List<Property> children) {
          super.listChildren(children);
          children.add(new Property("diagnosis[x]", "CodeableConcept|Reference(Condition)", "The nature of illness or problem in a coded form or as a reference to an external defined Condition.", 0, 1, diagnosis));
        }

        @Override
        public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
          switch (_hash) {
          case -1487009809: /*diagnosis[x]*/  return new Property("diagnosis[x]", "CodeableConcept|Reference(Condition)", "The nature of illness or problem in a coded form or as a reference to an external defined Condition.", 0, 1, diagnosis);
          case 1196993265: /*diagnosis*/  return new Property("diagnosis[x]", "CodeableConcept|Reference(Condition)", "The nature of illness or problem in a coded form or as a reference to an external defined Condition.", 0, 1, diagnosis);
          case 277781616: /*diagnosisCodeableConcept*/  return new Property("diagnosis[x]", "CodeableConcept", "The nature of illness or problem in a coded form or as a reference to an external defined Condition.", 0, 1, diagnosis);
          case 2050454362: /*diagnosisReference*/  return new Property("diagnosis[x]", "Reference(Condition)", "The nature of illness or problem in a coded form or as a reference to an external defined Condition.", 0, 1, diagnosis);
          default: return super.getNamedProperty(_hash, _name, _checkValid);
          }

        }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case 1196993265: /*diagnosis*/ return this.diagnosis == null ? new Base[0] : new Base[] {this.diagnosis}; // DataType
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case 1196993265: // diagnosis
          this.diagnosis = TypeConvertor.castToType(value); // DataType
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("diagnosis[x]")) {
          this.diagnosis = TypeConvertor.castToType(value); // DataType
        } else
          return super.setProperty(name, value);
        return value;
      }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
        if (name.equals("diagnosis[x]")) {
          this.diagnosis = null;
        } else
          super.removeChild(name, value);
        
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1487009809:  return getDiagnosis();
        case 1196993265:  return getDiagnosis();
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case 1196993265: /*diagnosis*/ return new String[] {"CodeableConcept", "Reference"};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("diagnosisCodeableConcept")) {
          this.diagnosis = new CodeableConcept();
          return this.diagnosis;
        }
        else if (name.equals("diagnosisReference")) {
          this.diagnosis = new Reference();
          return this.diagnosis;
        }
        else
          return super.addChild(name);
      }

      public DiagnosisComponent copy() {
        DiagnosisComponent dst = new DiagnosisComponent();
        copyValues(dst);
        return dst;
      }

      public void copyValues(DiagnosisComponent dst) {
        super.copyValues(dst);
        dst.diagnosis = diagnosis == null ? null : diagnosis.copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof DiagnosisComponent))
          return false;
        DiagnosisComponent o = (DiagnosisComponent) other_;
        return compareDeep(diagnosis, o.diagnosis, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof DiagnosisComponent))
          return false;
        DiagnosisComponent o = (DiagnosisComponent) other_;
        return true;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(diagnosis);
      }

  public String fhirType() {
    return "CoverageEligibilityRequest.item.diagnosis";

  }

  }

    /**
     * A unique identifier assigned to this coverage eligiblity request.
     */
    @Child(name = "identifier", type = {Identifier.class}, order=0, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Business Identifier for coverage eligiblity request", formalDefinition="A unique identifier assigned to this coverage eligiblity request." )
    protected List<Identifier> identifier;

    /**
     * The status of the resource instance.
     */
    @Child(name = "status", type = {CodeType.class}, order=1, min=1, max=1, modifier=true, summary=true)
    @Description(shortDefinition="active | cancelled | draft | entered-in-error", formalDefinition="The status of the resource instance." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/fm-status")
    protected Enumeration<FinancialResourceStatusCodes> status;

    /**
     * When the requestor expects the processor to complete processing.
     */
    @Child(name = "priority", type = {CodeableConcept.class}, order=2, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Desired processing priority", formalDefinition="When the requestor expects the processor to complete processing." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/process-priority")
    protected CodeableConcept priority;

    /**
     * Code to specify whether requesting: prior authorization requirements for some service categories or billing codes; benefits for coverages specified or discovered; discovery and return of coverages for the patient; and/or validation that the specified coverage is in-force at the date/period specified or 'now' if not specified.
     */
    @Child(name = "purpose", type = {CodeType.class}, order=3, min=1, max=Child.MAX_UNLIMITED, modifier=false, summary=true)
    @Description(shortDefinition="auth-requirements | benefits | discovery | validation", formalDefinition="Code to specify whether requesting: prior authorization requirements for some service categories or billing codes; benefits for coverages specified or discovered; discovery and return of coverages for the patient; and/or validation that the specified coverage is in-force at the date/period specified or 'now' if not specified." )
    @ca.uhn.fhir.model.api.annotation.Binding(valueSet="http://hl7.org/fhir/ValueSet/eligibilityrequest-purpose")
    protected List<Enumeration<EligibilityRequestPurpose>> purpose;

    /**
     * The party who is the beneficiary of the supplied coverage and for whom eligibility is sought.
     */
    @Child(name = "patient", type = {Patient.class}, order=4, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Intended recipient of products and services", formalDefinition="The party who is the beneficiary of the supplied coverage and for whom eligibility is sought." )
    protected Reference patient;

    /**
     * Information code for an event with a corresponding date or period.
     */
    @Child(name = "event", type = {}, order=5, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Event information", formalDefinition="Information code for an event with a corresponding date or period." )
    protected List<CoverageEligibilityRequestEventComponent> event;

    /**
     * The date or dates when the enclosed suite of services were performed or completed.
     */
    @Child(name = "serviced", type = {DateType.class, Period.class}, order=6, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Estimated date or dates of service", formalDefinition="The date or dates when the enclosed suite of services were performed or completed." )
    protected DataType serviced;

    /**
     * The date when this resource was created.
     */
    @Child(name = "created", type = {DateTimeType.class}, order=7, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Creation date", formalDefinition="The date when this resource was created." )
    protected DateTimeType created;

    /**
     * Person who created the request.
     */
    @Child(name = "enterer", type = {Practitioner.class, PractitionerRole.class}, order=8, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Author", formalDefinition="Person who created the request." )
    protected Reference enterer;

    /**
     * The provider which is responsible for the request.
     */
    @Child(name = "provider", type = {Practitioner.class, PractitionerRole.class, Organization.class}, order=9, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Party responsible for the request", formalDefinition="The provider which is responsible for the request." )
    protected Reference provider;

    /**
     * The Insurer who issued the coverage in question and is the recipient of the request.
     */
    @Child(name = "insurer", type = {Organization.class}, order=10, min=1, max=1, modifier=false, summary=true)
    @Description(shortDefinition="Coverage issuer", formalDefinition="The Insurer who issued the coverage in question and is the recipient of the request." )
    protected Reference insurer;

    /**
     * Facility where the services are intended to be provided.
     */
    @Child(name = "facility", type = {Location.class}, order=11, min=0, max=1, modifier=false, summary=false)
    @Description(shortDefinition="Servicing facility", formalDefinition="Facility where the services are intended to be provided." )
    protected Reference facility;

    /**
     * Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.
     */
    @Child(name = "supportingInfo", type = {}, order=12, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Supporting information", formalDefinition="Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues." )
    protected List<SupportingInformationComponent> supportingInfo;

    /**
     * Financial instruments for reimbursement for the health care products and services.
     */
    @Child(name = "insurance", type = {}, order=13, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Patient insurance information", formalDefinition="Financial instruments for reimbursement for the health care products and services." )
    protected List<InsuranceComponent> insurance;

    /**
     * Service categories or billable services for which benefit details and/or an authorization prior to service delivery may be required by the payor.
     */
    @Child(name = "item", type = {}, order=14, min=0, max=Child.MAX_UNLIMITED, modifier=false, summary=false)
    @Description(shortDefinition="Item to be evaluated for eligibiity", formalDefinition="Service categories or billable services for which benefit details and/or an authorization prior to service delivery may be required by the payor." )
    protected List<DetailsComponent> item;

    private static final long serialVersionUID = 2008965302L;

  /**
   * Constructor
   */
    public CoverageEligibilityRequest() {
      super();
    }

  /**
   * Constructor
   */
    public CoverageEligibilityRequest(FinancialResourceStatusCodes status, EligibilityRequestPurpose purpose, Reference patient, Date created, Reference insurer) {
      super();
      this.setStatus(status);
      this.addPurpose(purpose);
      this.setPatient(patient);
      this.setCreated(created);
      this.setInsurer(insurer);
    }

    /**
     * @return {@link #identifier} (A unique identifier assigned to this coverage eligiblity request.)
     */
    public List<Identifier> getIdentifier() { 
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      return this.identifier;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public CoverageEligibilityRequest setIdentifier(List<Identifier> theIdentifier) { 
      this.identifier = theIdentifier;
      return this;
    }

    public boolean hasIdentifier() { 
      if (this.identifier == null)
        return false;
      for (Identifier item : this.identifier)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public Identifier addIdentifier() { //3
      Identifier t = new Identifier();
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return t;
    }

    public CoverageEligibilityRequest addIdentifier(Identifier t) { //3
      if (t == null)
        return this;
      if (this.identifier == null)
        this.identifier = new ArrayList<Identifier>();
      this.identifier.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #identifier}, creating it if it does not already exist {3}
     */
    public Identifier getIdentifierFirstRep() { 
      if (getIdentifier().isEmpty()) {
        addIdentifier();
      }
      return getIdentifier().get(0);
    }

    /**
     * @return {@link #status} (The status of the resource instance.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public Enumeration<FinancialResourceStatusCodes> getStatusElement() { 
      if (this.status == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create CoverageEligibilityRequest.status");
        else if (Configuration.doAutoCreate())
          this.status = new Enumeration<FinancialResourceStatusCodes>(new FinancialResourceStatusCodesEnumFactory()); // bb
      return this.status;
    }

    public boolean hasStatusElement() { 
      return this.status != null && !this.status.isEmpty();
    }

    public boolean hasStatus() { 
      return this.status != null && !this.status.isEmpty();
    }

    /**
     * @param value {@link #status} (The status of the resource instance.). This is the underlying object with id, value and extensions. The accessor "getStatus" gives direct access to the value
     */
    public CoverageEligibilityRequest setStatusElement(Enumeration<FinancialResourceStatusCodes> value) { 
      this.status = value;
      return this;
    }

    /**
     * @return The status of the resource instance.
     */
    public FinancialResourceStatusCodes getStatus() { 
      return this.status == null ? null : this.status.getValue();
    }

    /**
     * @param value The status of the resource instance.
     */
    public CoverageEligibilityRequest setStatus(FinancialResourceStatusCodes value) { 
        if (this.status == null)
          this.status = new Enumeration<FinancialResourceStatusCodes>(new FinancialResourceStatusCodesEnumFactory());
        this.status.setValue(value);
      return this;
    }

    /**
     * @return {@link #priority} (When the requestor expects the processor to complete processing.)
     */
    public CodeableConcept getPriority() { 
      if (this.priority == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create CoverageEligibilityRequest.priority");
        else if (Configuration.doAutoCreate())
          this.priority = new CodeableConcept(); // cc
      return this.priority;
    }

    public boolean hasPriority() { 
      return this.priority != null && !this.priority.isEmpty();
    }

    /**
     * @param value {@link #priority} (When the requestor expects the processor to complete processing.)
     */
    public CoverageEligibilityRequest setPriority(CodeableConcept value) { 
      this.priority = value;
      return this;
    }

    /**
     * @return {@link #purpose} (Code to specify whether requesting: prior authorization requirements for some service categories or billing codes; benefits for coverages specified or discovered; discovery and return of coverages for the patient; and/or validation that the specified coverage is in-force at the date/period specified or 'now' if not specified.)
     */
    public List<Enumeration<EligibilityRequestPurpose>> getPurpose() { 
      if (this.purpose == null)
        this.purpose = new ArrayList<Enumeration<EligibilityRequestPurpose>>();
      return this.purpose;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public CoverageEligibilityRequest setPurpose(List<Enumeration<EligibilityRequestPurpose>> thePurpose) { 
      this.purpose = thePurpose;
      return this;
    }

    public boolean hasPurpose() { 
      if (this.purpose == null)
        return false;
      for (Enumeration<EligibilityRequestPurpose> item : this.purpose)
        if (!item.isEmpty())
          return true;
      return false;
    }

    /**
     * @return {@link #purpose} (Code to specify whether requesting: prior authorization requirements for some service categories or billing codes; benefits for coverages specified or discovered; discovery and return of coverages for the patient; and/or validation that the specified coverage is in-force at the date/period specified or 'now' if not specified.)
     */
    public Enumeration<EligibilityRequestPurpose> addPurposeElement() {//2 
      Enumeration<EligibilityRequestPurpose> t = new Enumeration<EligibilityRequestPurpose>(new EligibilityRequestPurposeEnumFactory());
      if (this.purpose == null)
        this.purpose = new ArrayList<Enumeration<EligibilityRequestPurpose>>();
      this.purpose.add(t);
      return t;
    }

    /**
     * @param value {@link #purpose} (Code to specify whether requesting: prior authorization requirements for some service categories or billing codes; benefits for coverages specified or discovered; discovery and return of coverages for the patient; and/or validation that the specified coverage is in-force at the date/period specified or 'now' if not specified.)
     */
    public CoverageEligibilityRequest addPurpose(EligibilityRequestPurpose value) { //1
      Enumeration<EligibilityRequestPurpose> t = new Enumeration<EligibilityRequestPurpose>(new EligibilityRequestPurposeEnumFactory());
      t.setValue(value);
      if (this.purpose == null)
        this.purpose = new ArrayList<Enumeration<EligibilityRequestPurpose>>();
      this.purpose.add(t);
      return this;
    }

    /**
     * @param value {@link #purpose} (Code to specify whether requesting: prior authorization requirements for some service categories or billing codes; benefits for coverages specified or discovered; discovery and return of coverages for the patient; and/or validation that the specified coverage is in-force at the date/period specified or 'now' if not specified.)
     */
    public boolean hasPurpose(EligibilityRequestPurpose value) { 
      if (this.purpose == null)
        return false;
      for (Enumeration<EligibilityRequestPurpose> v : this.purpose)
        if (v.getValue().equals(value)) // code
          return true;
      return false;
    }

    /**
     * @return {@link #patient} (The party who is the beneficiary of the supplied coverage and for whom eligibility is sought.)
     */
    public Reference getPatient() { 
      if (this.patient == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create CoverageEligibilityRequest.patient");
        else if (Configuration.doAutoCreate())
          this.patient = new Reference(); // cc
      return this.patient;
    }

    public boolean hasPatient() { 
      return this.patient != null && !this.patient.isEmpty();
    }

    /**
     * @param value {@link #patient} (The party who is the beneficiary of the supplied coverage and for whom eligibility is sought.)
     */
    public CoverageEligibilityRequest setPatient(Reference value) { 
      this.patient = value;
      return this;
    }

    /**
     * @return {@link #event} (Information code for an event with a corresponding date or period.)
     */
    public List<CoverageEligibilityRequestEventComponent> getEvent() { 
      if (this.event == null)
        this.event = new ArrayList<CoverageEligibilityRequestEventComponent>();
      return this.event;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public CoverageEligibilityRequest setEvent(List<CoverageEligibilityRequestEventComponent> theEvent) { 
      this.event = theEvent;
      return this;
    }

    public boolean hasEvent() { 
      if (this.event == null)
        return false;
      for (CoverageEligibilityRequestEventComponent item : this.event)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public CoverageEligibilityRequestEventComponent addEvent() { //3
      CoverageEligibilityRequestEventComponent t = new CoverageEligibilityRequestEventComponent();
      if (this.event == null)
        this.event = new ArrayList<CoverageEligibilityRequestEventComponent>();
      this.event.add(t);
      return t;
    }

    public CoverageEligibilityRequest addEvent(CoverageEligibilityRequestEventComponent t) { //3
      if (t == null)
        return this;
      if (this.event == null)
        this.event = new ArrayList<CoverageEligibilityRequestEventComponent>();
      this.event.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #event}, creating it if it does not already exist {3}
     */
    public CoverageEligibilityRequestEventComponent getEventFirstRep() { 
      if (getEvent().isEmpty()) {
        addEvent();
      }
      return getEvent().get(0);
    }

    /**
     * @return {@link #serviced} (The date or dates when the enclosed suite of services were performed or completed.)
     */
    public DataType getServiced() { 
      return this.serviced;
    }

    /**
     * @return {@link #serviced} (The date or dates when the enclosed suite of services were performed or completed.)
     */
    public DateType getServicedDateType() throws FHIRException { 
      if (this.serviced == null)
        this.serviced = new DateType();
      if (!(this.serviced instanceof DateType))
        throw new FHIRException("Type mismatch: the type DateType was expected, but "+this.serviced.getClass().getName()+" was encountered");
      return (DateType) this.serviced;
    }

    public boolean hasServicedDateType() { 
      return this != null && this.serviced instanceof DateType;
    }

    /**
     * @return {@link #serviced} (The date or dates when the enclosed suite of services were performed or completed.)
     */
    public Period getServicedPeriod() throws FHIRException { 
      if (this.serviced == null)
        this.serviced = new Period();
      if (!(this.serviced instanceof Period))
        throw new FHIRException("Type mismatch: the type Period was expected, but "+this.serviced.getClass().getName()+" was encountered");
      return (Period) this.serviced;
    }

    public boolean hasServicedPeriod() { 
      return this != null && this.serviced instanceof Period;
    }

    public boolean hasServiced() { 
      return this.serviced != null && !this.serviced.isEmpty();
    }

    /**
     * @param value {@link #serviced} (The date or dates when the enclosed suite of services were performed or completed.)
     */
    public CoverageEligibilityRequest setServiced(DataType value) { 
      if (value != null && !(value instanceof DateType || value instanceof Period))
        throw new FHIRException("Not the right type for CoverageEligibilityRequest.serviced[x]: "+value.fhirType());
      this.serviced = value;
      return this;
    }

    /**
     * @return {@link #created} (The date when this resource was created.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public DateTimeType getCreatedElement() { 
      if (this.created == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create CoverageEligibilityRequest.created");
        else if (Configuration.doAutoCreate())
          this.created = new DateTimeType(); // bb
      return this.created;
    }

    public boolean hasCreatedElement() { 
      return this.created != null && !this.created.isEmpty();
    }

    public boolean hasCreated() { 
      return this.created != null && !this.created.isEmpty();
    }

    /**
     * @param value {@link #created} (The date when this resource was created.). This is the underlying object with id, value and extensions. The accessor "getCreated" gives direct access to the value
     */
    public CoverageEligibilityRequest setCreatedElement(DateTimeType value) { 
      this.created = value;
      return this;
    }

    /**
     * @return The date when this resource was created.
     */
    public Date getCreated() { 
      return this.created == null ? null : this.created.getValue();
    }

    /**
     * @param value The date when this resource was created.
     */
    public CoverageEligibilityRequest setCreated(Date value) { 
        if (this.created == null)
          this.created = new DateTimeType();
        this.created.setValue(value);
      return this;
    }

    /**
     * @return {@link #enterer} (Person who created the request.)
     */
    public Reference getEnterer() { 
      if (this.enterer == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create CoverageEligibilityRequest.enterer");
        else if (Configuration.doAutoCreate())
          this.enterer = new Reference(); // cc
      return this.enterer;
    }

    public boolean hasEnterer() { 
      return this.enterer != null && !this.enterer.isEmpty();
    }

    /**
     * @param value {@link #enterer} (Person who created the request.)
     */
    public CoverageEligibilityRequest setEnterer(Reference value) { 
      this.enterer = value;
      return this;
    }

    /**
     * @return {@link #provider} (The provider which is responsible for the request.)
     */
    public Reference getProvider() { 
      if (this.provider == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create CoverageEligibilityRequest.provider");
        else if (Configuration.doAutoCreate())
          this.provider = new Reference(); // cc
      return this.provider;
    }

    public boolean hasProvider() { 
      return this.provider != null && !this.provider.isEmpty();
    }

    /**
     * @param value {@link #provider} (The provider which is responsible for the request.)
     */
    public CoverageEligibilityRequest setProvider(Reference value) { 
      this.provider = value;
      return this;
    }

    /**
     * @return {@link #insurer} (The Insurer who issued the coverage in question and is the recipient of the request.)
     */
    public Reference getInsurer() { 
      if (this.insurer == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create CoverageEligibilityRequest.insurer");
        else if (Configuration.doAutoCreate())
          this.insurer = new Reference(); // cc
      return this.insurer;
    }

    public boolean hasInsurer() { 
      return this.insurer != null && !this.insurer.isEmpty();
    }

    /**
     * @param value {@link #insurer} (The Insurer who issued the coverage in question and is the recipient of the request.)
     */
    public CoverageEligibilityRequest setInsurer(Reference value) { 
      this.insurer = value;
      return this;
    }

    /**
     * @return {@link #facility} (Facility where the services are intended to be provided.)
     */
    public Reference getFacility() { 
      if (this.facility == null)
        if (Configuration.errorOnAutoCreate())
          throw new Error("Attempt to auto-create CoverageEligibilityRequest.facility");
        else if (Configuration.doAutoCreate())
          this.facility = new Reference(); // cc
      return this.facility;
    }

    public boolean hasFacility() { 
      return this.facility != null && !this.facility.isEmpty();
    }

    /**
     * @param value {@link #facility} (Facility where the services are intended to be provided.)
     */
    public CoverageEligibilityRequest setFacility(Reference value) { 
      this.facility = value;
      return this;
    }

    /**
     * @return {@link #supportingInfo} (Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.)
     */
    public List<SupportingInformationComponent> getSupportingInfo() { 
      if (this.supportingInfo == null)
        this.supportingInfo = new ArrayList<SupportingInformationComponent>();
      return this.supportingInfo;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public CoverageEligibilityRequest setSupportingInfo(List<SupportingInformationComponent> theSupportingInfo) { 
      this.supportingInfo = theSupportingInfo;
      return this;
    }

    public boolean hasSupportingInfo() { 
      if (this.supportingInfo == null)
        return false;
      for (SupportingInformationComponent item : this.supportingInfo)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public SupportingInformationComponent addSupportingInfo() { //3
      SupportingInformationComponent t = new SupportingInformationComponent();
      if (this.supportingInfo == null)
        this.supportingInfo = new ArrayList<SupportingInformationComponent>();
      this.supportingInfo.add(t);
      return t;
    }

    public CoverageEligibilityRequest addSupportingInfo(SupportingInformationComponent t) { //3
      if (t == null)
        return this;
      if (this.supportingInfo == null)
        this.supportingInfo = new ArrayList<SupportingInformationComponent>();
      this.supportingInfo.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #supportingInfo}, creating it if it does not already exist {3}
     */
    public SupportingInformationComponent getSupportingInfoFirstRep() { 
      if (getSupportingInfo().isEmpty()) {
        addSupportingInfo();
      }
      return getSupportingInfo().get(0);
    }

    /**
     * @return {@link #insurance} (Financial instruments for reimbursement for the health care products and services.)
     */
    public List<InsuranceComponent> getInsurance() { 
      if (this.insurance == null)
        this.insurance = new ArrayList<InsuranceComponent>();
      return this.insurance;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public CoverageEligibilityRequest setInsurance(List<InsuranceComponent> theInsurance) { 
      this.insurance = theInsurance;
      return this;
    }

    public boolean hasInsurance() { 
      if (this.insurance == null)
        return false;
      for (InsuranceComponent item : this.insurance)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public InsuranceComponent addInsurance() { //3
      InsuranceComponent t = new InsuranceComponent();
      if (this.insurance == null)
        this.insurance = new ArrayList<InsuranceComponent>();
      this.insurance.add(t);
      return t;
    }

    public CoverageEligibilityRequest addInsurance(InsuranceComponent t) { //3
      if (t == null)
        return this;
      if (this.insurance == null)
        this.insurance = new ArrayList<InsuranceComponent>();
      this.insurance.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #insurance}, creating it if it does not already exist {3}
     */
    public InsuranceComponent getInsuranceFirstRep() { 
      if (getInsurance().isEmpty()) {
        addInsurance();
      }
      return getInsurance().get(0);
    }

    /**
     * @return {@link #item} (Service categories or billable services for which benefit details and/or an authorization prior to service delivery may be required by the payor.)
     */
    public List<DetailsComponent> getItem() { 
      if (this.item == null)
        this.item = new ArrayList<DetailsComponent>();
      return this.item;
    }

    /**
     * @return Returns a reference to <code>this</code> for easy method chaining
     */
    public CoverageEligibilityRequest setItem(List<DetailsComponent> theItem) { 
      this.item = theItem;
      return this;
    }

    public boolean hasItem() { 
      if (this.item == null)
        return false;
      for (DetailsComponent item : this.item)
        if (!item.isEmpty())
          return true;
      return false;
    }

    public DetailsComponent addItem() { //3
      DetailsComponent t = new DetailsComponent();
      if (this.item == null)
        this.item = new ArrayList<DetailsComponent>();
      this.item.add(t);
      return t;
    }

    public CoverageEligibilityRequest addItem(DetailsComponent t) { //3
      if (t == null)
        return this;
      if (this.item == null)
        this.item = new ArrayList<DetailsComponent>();
      this.item.add(t);
      return this;
    }

    /**
     * @return The first repetition of repeating field {@link #item}, creating it if it does not already exist {3}
     */
    public DetailsComponent getItemFirstRep() { 
      if (getItem().isEmpty()) {
        addItem();
      }
      return getItem().get(0);
    }

      protected void listChildren(List<Property> children) {
        super.listChildren(children);
        children.add(new Property("identifier", "Identifier", "A unique identifier assigned to this coverage eligiblity request.", 0, java.lang.Integer.MAX_VALUE, identifier));
        children.add(new Property("status", "code", "The status of the resource instance.", 0, 1, status));
        children.add(new Property("priority", "CodeableConcept", "When the requestor expects the processor to complete processing.", 0, 1, priority));
        children.add(new Property("purpose", "code", "Code to specify whether requesting: prior authorization requirements for some service categories or billing codes; benefits for coverages specified or discovered; discovery and return of coverages for the patient; and/or validation that the specified coverage is in-force at the date/period specified or 'now' if not specified.", 0, java.lang.Integer.MAX_VALUE, purpose));
        children.add(new Property("patient", "Reference(Patient)", "The party who is the beneficiary of the supplied coverage and for whom eligibility is sought.", 0, 1, patient));
        children.add(new Property("event", "", "Information code for an event with a corresponding date or period.", 0, java.lang.Integer.MAX_VALUE, event));
        children.add(new Property("serviced[x]", "date|Period", "The date or dates when the enclosed suite of services were performed or completed.", 0, 1, serviced));
        children.add(new Property("created", "dateTime", "The date when this resource was created.", 0, 1, created));
        children.add(new Property("enterer", "Reference(Practitioner|PractitionerRole)", "Person who created the request.", 0, 1, enterer));
        children.add(new Property("provider", "Reference(Practitioner|PractitionerRole|Organization)", "The provider which is responsible for the request.", 0, 1, provider));
        children.add(new Property("insurer", "Reference(Organization)", "The Insurer who issued the coverage in question and is the recipient of the request.", 0, 1, insurer));
        children.add(new Property("facility", "Reference(Location)", "Facility where the services are intended to be provided.", 0, 1, facility));
        children.add(new Property("supportingInfo", "", "Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.", 0, java.lang.Integer.MAX_VALUE, supportingInfo));
        children.add(new Property("insurance", "", "Financial instruments for reimbursement for the health care products and services.", 0, java.lang.Integer.MAX_VALUE, insurance));
        children.add(new Property("item", "", "Service categories or billable services for which benefit details and/or an authorization prior to service delivery may be required by the payor.", 0, java.lang.Integer.MAX_VALUE, item));
      }

      @Override
      public Property getNamedProperty(int _hash, String _name, boolean _checkValid) throws FHIRException {
        switch (_hash) {
        case -1618432855: /*identifier*/  return new Property("identifier", "Identifier", "A unique identifier assigned to this coverage eligiblity request.", 0, java.lang.Integer.MAX_VALUE, identifier);
        case -892481550: /*status*/  return new Property("status", "code", "The status of the resource instance.", 0, 1, status);
        case -1165461084: /*priority*/  return new Property("priority", "CodeableConcept", "When the requestor expects the processor to complete processing.", 0, 1, priority);
        case -220463842: /*purpose*/  return new Property("purpose", "code", "Code to specify whether requesting: prior authorization requirements for some service categories or billing codes; benefits for coverages specified or discovered; discovery and return of coverages for the patient; and/or validation that the specified coverage is in-force at the date/period specified or 'now' if not specified.", 0, java.lang.Integer.MAX_VALUE, purpose);
        case -791418107: /*patient*/  return new Property("patient", "Reference(Patient)", "The party who is the beneficiary of the supplied coverage and for whom eligibility is sought.", 0, 1, patient);
        case 96891546: /*event*/  return new Property("event", "", "Information code for an event with a corresponding date or period.", 0, java.lang.Integer.MAX_VALUE, event);
        case -1927922223: /*serviced[x]*/  return new Property("serviced[x]", "date|Period", "The date or dates when the enclosed suite of services were performed or completed.", 0, 1, serviced);
        case 1379209295: /*serviced*/  return new Property("serviced[x]", "date|Period", "The date or dates when the enclosed suite of services were performed or completed.", 0, 1, serviced);
        case 363246749: /*servicedDate*/  return new Property("serviced[x]", "date", "The date or dates when the enclosed suite of services were performed or completed.", 0, 1, serviced);
        case 1534966512: /*servicedPeriod*/  return new Property("serviced[x]", "Period", "The date or dates when the enclosed suite of services were performed or completed.", 0, 1, serviced);
        case 1028554472: /*created*/  return new Property("created", "dateTime", "The date when this resource was created.", 0, 1, created);
        case -1591951995: /*enterer*/  return new Property("enterer", "Reference(Practitioner|PractitionerRole)", "Person who created the request.", 0, 1, enterer);
        case -987494927: /*provider*/  return new Property("provider", "Reference(Practitioner|PractitionerRole|Organization)", "The provider which is responsible for the request.", 0, 1, provider);
        case 1957615864: /*insurer*/  return new Property("insurer", "Reference(Organization)", "The Insurer who issued the coverage in question and is the recipient of the request.", 0, 1, insurer);
        case 501116579: /*facility*/  return new Property("facility", "Reference(Location)", "Facility where the services are intended to be provided.", 0, 1, facility);
        case 1922406657: /*supportingInfo*/  return new Property("supportingInfo", "", "Additional information codes regarding exceptions, special considerations, the condition, situation, prior or concurrent issues.", 0, java.lang.Integer.MAX_VALUE, supportingInfo);
        case 73049818: /*insurance*/  return new Property("insurance", "", "Financial instruments for reimbursement for the health care products and services.", 0, java.lang.Integer.MAX_VALUE, insurance);
        case 3242771: /*item*/  return new Property("item", "", "Service categories or billable services for which benefit details and/or an authorization prior to service delivery may be required by the payor.", 0, java.lang.Integer.MAX_VALUE, item);
        default: return super.getNamedProperty(_hash, _name, _checkValid);
        }

      }

      @Override
      public Base[] getProperty(int hash, String name, boolean checkValid) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return this.identifier == null ? new Base[0] : this.identifier.toArray(new Base[this.identifier.size()]); // Identifier
        case -892481550: /*status*/ return this.status == null ? new Base[0] : new Base[] {this.status}; // Enumeration<FinancialResourceStatusCodes>
        case -1165461084: /*priority*/ return this.priority == null ? new Base[0] : new Base[] {this.priority}; // CodeableConcept
        case -220463842: /*purpose*/ return this.purpose == null ? new Base[0] : this.purpose.toArray(new Base[this.purpose.size()]); // Enumeration<EligibilityRequestPurpose>
        case -791418107: /*patient*/ return this.patient == null ? new Base[0] : new Base[] {this.patient}; // Reference
        case 96891546: /*event*/ return this.event == null ? new Base[0] : this.event.toArray(new Base[this.event.size()]); // CoverageEligibilityRequestEventComponent
        case 1379209295: /*serviced*/ return this.serviced == null ? new Base[0] : new Base[] {this.serviced}; // DataType
        case 1028554472: /*created*/ return this.created == null ? new Base[0] : new Base[] {this.created}; // DateTimeType
        case -1591951995: /*enterer*/ return this.enterer == null ? new Base[0] : new Base[] {this.enterer}; // Reference
        case -987494927: /*provider*/ return this.provider == null ? new Base[0] : new Base[] {this.provider}; // Reference
        case 1957615864: /*insurer*/ return this.insurer == null ? new Base[0] : new Base[] {this.insurer}; // Reference
        case 501116579: /*facility*/ return this.facility == null ? new Base[0] : new Base[] {this.facility}; // Reference
        case 1922406657: /*supportingInfo*/ return this.supportingInfo == null ? new Base[0] : this.supportingInfo.toArray(new Base[this.supportingInfo.size()]); // SupportingInformationComponent
        case 73049818: /*insurance*/ return this.insurance == null ? new Base[0] : this.insurance.toArray(new Base[this.insurance.size()]); // InsuranceComponent
        case 3242771: /*item*/ return this.item == null ? new Base[0] : this.item.toArray(new Base[this.item.size()]); // DetailsComponent
        default: return super.getProperty(hash, name, checkValid);
        }

      }

      @Override
      public Base setProperty(int hash, String name, Base value) throws FHIRException {
        switch (hash) {
        case -1618432855: // identifier
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value)); // Identifier
          return value;
        case -892481550: // status
          value = new FinancialResourceStatusCodesEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<FinancialResourceStatusCodes>
          return value;
        case -1165461084: // priority
          this.priority = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
          return value;
        case -220463842: // purpose
          value = new EligibilityRequestPurposeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.getPurpose().add((Enumeration) value); // Enumeration<EligibilityRequestPurpose>
          return value;
        case -791418107: // patient
          this.patient = TypeConvertor.castToReference(value); // Reference
          return value;
        case 96891546: // event
          this.getEvent().add((CoverageEligibilityRequestEventComponent) value); // CoverageEligibilityRequestEventComponent
          return value;
        case 1379209295: // serviced
          this.serviced = TypeConvertor.castToType(value); // DataType
          return value;
        case 1028554472: // created
          this.created = TypeConvertor.castToDateTime(value); // DateTimeType
          return value;
        case -1591951995: // enterer
          this.enterer = TypeConvertor.castToReference(value); // Reference
          return value;
        case -987494927: // provider
          this.provider = TypeConvertor.castToReference(value); // Reference
          return value;
        case 1957615864: // insurer
          this.insurer = TypeConvertor.castToReference(value); // Reference
          return value;
        case 501116579: // facility
          this.facility = TypeConvertor.castToReference(value); // Reference
          return value;
        case 1922406657: // supportingInfo
          this.getSupportingInfo().add((SupportingInformationComponent) value); // SupportingInformationComponent
          return value;
        case 73049818: // insurance
          this.getInsurance().add((InsuranceComponent) value); // InsuranceComponent
          return value;
        case 3242771: // item
          this.getItem().add((DetailsComponent) value); // DetailsComponent
          return value;
        default: return super.setProperty(hash, name, value);
        }

      }

      @Override
      public Base setProperty(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().add(TypeConvertor.castToIdentifier(value));
        } else if (name.equals("status")) {
          value = new FinancialResourceStatusCodesEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<FinancialResourceStatusCodes>
        } else if (name.equals("priority")) {
          this.priority = TypeConvertor.castToCodeableConcept(value); // CodeableConcept
        } else if (name.equals("purpose")) {
          value = new EligibilityRequestPurposeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.getPurpose().add((Enumeration) value);
        } else if (name.equals("patient")) {
          this.patient = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("event")) {
          this.getEvent().add((CoverageEligibilityRequestEventComponent) value);
        } else if (name.equals("serviced[x]")) {
          this.serviced = TypeConvertor.castToType(value); // DataType
        } else if (name.equals("created")) {
          this.created = TypeConvertor.castToDateTime(value); // DateTimeType
        } else if (name.equals("enterer")) {
          this.enterer = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("provider")) {
          this.provider = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("insurer")) {
          this.insurer = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("facility")) {
          this.facility = TypeConvertor.castToReference(value); // Reference
        } else if (name.equals("supportingInfo")) {
          this.getSupportingInfo().add((SupportingInformationComponent) value);
        } else if (name.equals("insurance")) {
          this.getInsurance().add((InsuranceComponent) value);
        } else if (name.equals("item")) {
          this.getItem().add((DetailsComponent) value);
        } else
          return super.setProperty(name, value);
        return value;
      }

  @Override
  public void removeChild(String name, Base value) throws FHIRException {
        if (name.equals("identifier")) {
          this.getIdentifier().remove(value);
        } else if (name.equals("status")) {
          value = new FinancialResourceStatusCodesEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.status = (Enumeration) value; // Enumeration<FinancialResourceStatusCodes>
        } else if (name.equals("priority")) {
          this.priority = null;
        } else if (name.equals("purpose")) {
          value = new EligibilityRequestPurposeEnumFactory().fromType(TypeConvertor.castToCode(value));
          this.getPurpose().add((Enumeration) value);
        } else if (name.equals("patient")) {
          this.patient = null;
        } else if (name.equals("event")) {
          this.getEvent().add((CoverageEligibilityRequestEventComponent) value);
        } else if (name.equals("serviced[x]")) {
          this.serviced = null;
        } else if (name.equals("created")) {
          this.created = null;
        } else if (name.equals("enterer")) {
          this.enterer = null;
        } else if (name.equals("provider")) {
          this.provider = null;
        } else if (name.equals("insurer")) {
          this.insurer = null;
        } else if (name.equals("facility")) {
          this.facility = null;
        } else if (name.equals("supportingInfo")) {
          this.getSupportingInfo().add((SupportingInformationComponent) value);
        } else if (name.equals("insurance")) {
          this.getInsurance().add((InsuranceComponent) value);
        } else if (name.equals("item")) {
          this.getItem().add((DetailsComponent) value);
        } else
          super.removeChild(name, value);
        
      }

      @Override
      public Base makeProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855:  return addIdentifier(); 
        case -892481550:  return getStatusElement();
        case -1165461084:  return getPriority();
        case -220463842:  return addPurposeElement();
        case -791418107:  return getPatient();
        case 96891546:  return addEvent(); 
        case -1927922223:  return getServiced();
        case 1379209295:  return getServiced();
        case 1028554472:  return getCreatedElement();
        case -1591951995:  return getEnterer();
        case -987494927:  return getProvider();
        case 1957615864:  return getInsurer();
        case 501116579:  return getFacility();
        case 1922406657:  return addSupportingInfo(); 
        case 73049818:  return addInsurance(); 
        case 3242771:  return addItem(); 
        default: return super.makeProperty(hash, name);
        }

      }

      @Override
      public String[] getTypesForProperty(int hash, String name) throws FHIRException {
        switch (hash) {
        case -1618432855: /*identifier*/ return new String[] {"Identifier"};
        case -892481550: /*status*/ return new String[] {"code"};
        case -1165461084: /*priority*/ return new String[] {"CodeableConcept"};
        case -220463842: /*purpose*/ return new String[] {"code"};
        case -791418107: /*patient*/ return new String[] {"Reference"};
        case 96891546: /*event*/ return new String[] {};
        case 1379209295: /*serviced*/ return new String[] {"date", "Period"};
        case 1028554472: /*created*/ return new String[] {"dateTime"};
        case -1591951995: /*enterer*/ return new String[] {"Reference"};
        case -987494927: /*provider*/ return new String[] {"Reference"};
        case 1957615864: /*insurer*/ return new String[] {"Reference"};
        case 501116579: /*facility*/ return new String[] {"Reference"};
        case 1922406657: /*supportingInfo*/ return new String[] {};
        case 73049818: /*insurance*/ return new String[] {};
        case 3242771: /*item*/ return new String[] {};
        default: return super.getTypesForProperty(hash, name);
        }

      }

      @Override
      public Base addChild(String name) throws FHIRException {
        if (name.equals("identifier")) {
          return addIdentifier();
        }
        else if (name.equals("status")) {
          throw new FHIRException("Cannot call addChild on a singleton property CoverageEligibilityRequest.status");
        }
        else if (name.equals("priority")) {
          this.priority = new CodeableConcept();
          return this.priority;
        }
        else if (name.equals("purpose")) {
          throw new FHIRException("Cannot call addChild on a singleton property CoverageEligibilityRequest.purpose");
        }
        else if (name.equals("patient")) {
          this.patient = new Reference();
          return this.patient;
        }
        else if (name.equals("event")) {
          return addEvent();
        }
        else if (name.equals("servicedDate")) {
          this.serviced = new DateType();
          return this.serviced;
        }
        else if (name.equals("servicedPeriod")) {
          this.serviced = new Period();
          return this.serviced;
        }
        else if (name.equals("created")) {
          throw new FHIRException("Cannot call addChild on a singleton property CoverageEligibilityRequest.created");
        }
        else if (name.equals("enterer")) {
          this.enterer = new Reference();
          return this.enterer;
        }
        else if (name.equals("provider")) {
          this.provider = new Reference();
          return this.provider;
        }
        else if (name.equals("insurer")) {
          this.insurer = new Reference();
          return this.insurer;
        }
        else if (name.equals("facility")) {
          this.facility = new Reference();
          return this.facility;
        }
        else if (name.equals("supportingInfo")) {
          return addSupportingInfo();
        }
        else if (name.equals("insurance")) {
          return addInsurance();
        }
        else if (name.equals("item")) {
          return addItem();
        }
        else
          return super.addChild(name);
      }

  public String fhirType() {
    return "CoverageEligibilityRequest";

  }

      public CoverageEligibilityRequest copy() {
        CoverageEligibilityRequest dst = new CoverageEligibilityRequest();
        copyValues(dst);
        return dst;
      }

      public void copyValues(CoverageEligibilityRequest dst) {
        super.copyValues(dst);
        if (identifier != null) {
          dst.identifier = new ArrayList<Identifier>();
          for (Identifier i : identifier)
            dst.identifier.add(i.copy());
        };
        dst.status = status == null ? null : status.copy();
        dst.priority = priority == null ? null : priority.copy();
        if (purpose != null) {
          dst.purpose = new ArrayList<Enumeration<EligibilityRequestPurpose>>();
          for (Enumeration<EligibilityRequestPurpose> i : purpose)
            dst.purpose.add(i.copy());
        };
        dst.patient = patient == null ? null : patient.copy();
        if (event != null) {
          dst.event = new ArrayList<CoverageEligibilityRequestEventComponent>();
          for (CoverageEligibilityRequestEventComponent i : event)
            dst.event.add(i.copy());
        };
        dst.serviced = serviced == null ? null : serviced.copy();
        dst.created = created == null ? null : created.copy();
        dst.enterer = enterer == null ? null : enterer.copy();
        dst.provider = provider == null ? null : provider.copy();
        dst.insurer = insurer == null ? null : insurer.copy();
        dst.facility = facility == null ? null : facility.copy();
        if (supportingInfo != null) {
          dst.supportingInfo = new ArrayList<SupportingInformationComponent>();
          for (SupportingInformationComponent i : supportingInfo)
            dst.supportingInfo.add(i.copy());
        };
        if (insurance != null) {
          dst.insurance = new ArrayList<InsuranceComponent>();
          for (InsuranceComponent i : insurance)
            dst.insurance.add(i.copy());
        };
        if (item != null) {
          dst.item = new ArrayList<DetailsComponent>();
          for (DetailsComponent i : item)
            dst.item.add(i.copy());
        };
      }

      protected CoverageEligibilityRequest typedCopy() {
        return copy();
      }

      @Override
      public boolean equalsDeep(Base other_) {
        if (!super.equalsDeep(other_))
          return false;
        if (!(other_ instanceof CoverageEligibilityRequest))
          return false;
        CoverageEligibilityRequest o = (CoverageEligibilityRequest) other_;
        return compareDeep(identifier, o.identifier, true) && compareDeep(status, o.status, true) && compareDeep(priority, o.priority, true)
           && compareDeep(purpose, o.purpose, true) && compareDeep(patient, o.patient, true) && compareDeep(event, o.event, true)
           && compareDeep(serviced, o.serviced, true) && compareDeep(created, o.created, true) && compareDeep(enterer, o.enterer, true)
           && compareDeep(provider, o.provider, true) && compareDeep(insurer, o.insurer, true) && compareDeep(facility, o.facility, true)
           && compareDeep(supportingInfo, o.supportingInfo, true) && compareDeep(insurance, o.insurance, true)
           && compareDeep(item, o.item, true);
      }

      @Override
      public boolean equalsShallow(Base other_) {
        if (!super.equalsShallow(other_))
          return false;
        if (!(other_ instanceof CoverageEligibilityRequest))
          return false;
        CoverageEligibilityRequest o = (CoverageEligibilityRequest) other_;
        return compareValues(status, o.status, true) && compareValues(purpose, o.purpose, true) && compareValues(created, o.created, true)
          ;
      }

      public boolean isEmpty() {
        return super.isEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(identifier, status, priority
          , purpose, patient, event, serviced, created, enterer, provider, insurer, facility
          , supportingInfo, insurance, item);
      }

  @Override
  public ResourceType getResourceType() {
    return ResourceType.CoverageEligibilityRequest;
   }

 /**
   * Search parameter: <b>created</b>
   * <p>
   * Description: <b>The creation date for the EOB</b><br>
   * Type: <b>date</b><br>
   * Path: <b>CoverageEligibilityRequest.created</b><br>
   * </p>
   */
  @SearchParamDefinition(name="created", path="CoverageEligibilityRequest.created", description="The creation date for the EOB", type="date" )
  public static final String SP_CREATED = "created";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>created</b>
   * <p>
   * Description: <b>The creation date for the EOB</b><br>
   * Type: <b>date</b><br>
   * Path: <b>CoverageEligibilityRequest.created</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.DateClientParam CREATED = new ca.uhn.fhir.rest.gclient.DateClientParam(SP_CREATED);

 /**
   * Search parameter: <b>enterer</b>
   * <p>
   * Description: <b>The party who is responsible for the request</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>CoverageEligibilityRequest.enterer</b><br>
   * </p>
   */
  @SearchParamDefinition(name="enterer", path="CoverageEligibilityRequest.enterer", description="The party who is responsible for the request", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Practitioner") }, target={Practitioner.class, PractitionerRole.class } )
  public static final String SP_ENTERER = "enterer";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>enterer</b>
   * <p>
   * Description: <b>The party who is responsible for the request</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>CoverageEligibilityRequest.enterer</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam ENTERER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_ENTERER);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>CoverageEligibilityRequest:enterer</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_ENTERER = new ca.uhn.fhir.model.api.Include("CoverageEligibilityRequest:enterer").toLocked();

 /**
   * Search parameter: <b>facility</b>
   * <p>
   * Description: <b>Facility responsible for the goods and services</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>CoverageEligibilityRequest.facility</b><br>
   * </p>
   */
  @SearchParamDefinition(name="facility", path="CoverageEligibilityRequest.facility", description="Facility responsible for the goods and services", type="reference", target={Location.class } )
  public static final String SP_FACILITY = "facility";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>facility</b>
   * <p>
   * Description: <b>Facility responsible for the goods and services</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>CoverageEligibilityRequest.facility</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam FACILITY = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_FACILITY);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>CoverageEligibilityRequest:facility</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_FACILITY = new ca.uhn.fhir.model.api.Include("CoverageEligibilityRequest:facility").toLocked();

 /**
   * Search parameter: <b>provider</b>
   * <p>
   * Description: <b>The reference to the provider</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>CoverageEligibilityRequest.provider</b><br>
   * </p>
   */
  @SearchParamDefinition(name="provider", path="CoverageEligibilityRequest.provider", description="The reference to the provider", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Practitioner") }, target={Organization.class, Practitioner.class, PractitionerRole.class } )
  public static final String SP_PROVIDER = "provider";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>provider</b>
   * <p>
   * Description: <b>The reference to the provider</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>CoverageEligibilityRequest.provider</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PROVIDER = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PROVIDER);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>CoverageEligibilityRequest:provider</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PROVIDER = new ca.uhn.fhir.model.api.Include("CoverageEligibilityRequest:provider").toLocked();

 /**
   * Search parameter: <b>status</b>
   * <p>
   * Description: <b>The status of the EligibilityRequest</b><br>
   * Type: <b>token</b><br>
   * Path: <b>CoverageEligibilityRequest.status</b><br>
   * </p>
   */
  @SearchParamDefinition(name="status", path="CoverageEligibilityRequest.status", description="The status of the EligibilityRequest", type="token" )
  public static final String SP_STATUS = "status";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>status</b>
   * <p>
   * Description: <b>The status of the EligibilityRequest</b><br>
   * Type: <b>token</b><br>
   * Path: <b>CoverageEligibilityRequest.status</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam STATUS = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_STATUS);

 /**
   * Search parameter: <b>identifier</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Account](account.html): Account number
* [AdverseEvent](adverseevent.html): Business identifier for the event
* [AllergyIntolerance](allergyintolerance.html): External ids for this item
* [Appointment](appointment.html): An Identifier of the Appointment
* [AppointmentResponse](appointmentresponse.html): An Identifier in this appointment response
* [Basic](basic.html): Business identifier
* [BodyStructure](bodystructure.html): Bodystructure identifier
* [CarePlan](careplan.html): External Ids for this plan
* [CareTeam](careteam.html): External Ids for this team
* [ChargeItem](chargeitem.html): Business Identifier for item
* [Claim](claim.html): The primary identifier of the financial resource
* [ClaimResponse](claimresponse.html): The identity of the ClaimResponse
* [ClinicalImpression](clinicalimpression.html): Business identifier
* [Communication](communication.html): Unique identifier
* [CommunicationRequest](communicationrequest.html): Unique identifier
* [Composition](composition.html): Version-independent identifier for the Composition
* [Condition](condition.html): A unique identifier of the condition record
* [Consent](consent.html): Identifier for this record (external references)
* [Contract](contract.html): The identity of the contract
* [Coverage](coverage.html): The primary identifier of the insured and the coverage
* [CoverageEligibilityRequest](coverageeligibilityrequest.html): The business identifier of the Eligibility
* [CoverageEligibilityResponse](coverageeligibilityresponse.html): The business identifier
* [DetectedIssue](detectedissue.html): Unique id for the detected issue
* [DeviceRequest](devicerequest.html): Business identifier for request/order
* [DeviceUsage](deviceusage.html): Search by identifier
* [DiagnosticReport](diagnosticreport.html): An identifier for the report
* [DocumentReference](documentreference.html): Identifier of the attachment binary
* [Encounter](encounter.html): Identifier(s) by which this encounter is known
* [EnrollmentRequest](enrollmentrequest.html): The business identifier of the Enrollment
* [EpisodeOfCare](episodeofcare.html): Business Identifier(s) relevant for this EpisodeOfCare
* [ExplanationOfBenefit](explanationofbenefit.html): The business identifier of the Explanation of Benefit
* [FamilyMemberHistory](familymemberhistory.html): A search by a record identifier
* [Flag](flag.html): Business identifier
* [Goal](goal.html): External Ids for this goal
* [GuidanceResponse](guidanceresponse.html): The identifier of the guidance response
* [ImagingSelection](imagingselection.html): Identifiers for the imaging selection
* [ImagingStudy](imagingstudy.html): Identifiers for the Study, such as DICOM Study Instance UID
* [Immunization](immunization.html): Business identifier
* [ImmunizationEvaluation](immunizationevaluation.html): ID of the evaluation
* [ImmunizationRecommendation](immunizationrecommendation.html): Business identifier
* [Invoice](invoice.html): Business Identifier for item
* [List](list.html): Business identifier
* [MeasureReport](measurereport.html): External identifier of the measure report to be returned
* [Medication](medication.html): Returns medications with this external identifier
* [MedicationAdministration](medicationadministration.html): Return administrations with this external identifier
* [MedicationDispense](medicationdispense.html): Returns dispenses with this external identifier
* [MedicationRequest](medicationrequest.html): Return prescriptions with this external identifier
* [MedicationStatement](medicationstatement.html): Return statements with this external identifier
* [MolecularSequence](molecularsequence.html): The unique identity for a particular sequence
* [NutritionIntake](nutritionintake.html): Return statements with this external identifier
* [NutritionOrder](nutritionorder.html): Return nutrition orders with this external identifier
* [Observation](observation.html): The unique id for a particular observation
* [Person](person.html): A person Identifier
* [Procedure](procedure.html): A unique identifier for a procedure
* [QuestionnaireResponse](questionnaireresponse.html): The unique identifier for the questionnaire response
* [RelatedPerson](relatedperson.html): An Identifier of the RelatedPerson
* [RequestOrchestration](requestorchestration.html): External identifiers for the request orchestration
* [ResearchSubject](researchsubject.html): Business Identifier for research subject in a study
* [RiskAssessment](riskassessment.html): Unique identifier for the assessment
* [ServiceRequest](servicerequest.html): Identifiers assigned to this order
* [Specimen](specimen.html): The unique identifier associated with the specimen
* [SupplyDelivery](supplydelivery.html): External identifier
* [SupplyRequest](supplyrequest.html): Business Identifier for SupplyRequest
* [Task](task.html): Search for a task instance by its business identifier
* [VisionPrescription](visionprescription.html): Return prescriptions with this external identifier
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Account.identifier | AdverseEvent.identifier | AllergyIntolerance.identifier | Appointment.identifier | AppointmentResponse.identifier | Basic.identifier | BodyStructure.identifier | CarePlan.identifier | CareTeam.identifier | ChargeItem.identifier | Claim.identifier | ClaimResponse.identifier | ClinicalImpression.identifier | Communication.identifier | CommunicationRequest.identifier | Composition.identifier | Condition.identifier | Consent.identifier | Contract.identifier | Coverage.identifier | CoverageEligibilityRequest.identifier | CoverageEligibilityResponse.identifier | DetectedIssue.identifier | DeviceRequest.identifier | DeviceUsage.identifier | DiagnosticReport.identifier | DocumentReference.identifier | Encounter.identifier | EnrollmentRequest.identifier | EpisodeOfCare.identifier | ExplanationOfBenefit.identifier | FamilyMemberHistory.identifier | Flag.identifier | Goal.identifier | GuidanceResponse.identifier | ImagingSelection.identifier | ImagingStudy.identifier | Immunization.identifier | ImmunizationEvaluation.identifier | ImmunizationRecommendation.identifier | Invoice.identifier | List.identifier | MeasureReport.identifier | Medication.identifier | MedicationAdministration.identifier | MedicationDispense.identifier | MedicationRequest.identifier | MedicationStatement.identifier | MolecularSequence.identifier | NutritionIntake.identifier | NutritionOrder.identifier | Observation.identifier | Person.identifier | Procedure.identifier | QuestionnaireResponse.identifier | RelatedPerson.identifier | RequestOrchestration.identifier | ResearchSubject.identifier | RiskAssessment.identifier | ServiceRequest.identifier | Specimen.identifier | SupplyDelivery.identifier | SupplyRequest.identifier | Task.identifier | VisionPrescription.identifier</b><br>
   * </p>
   */
  @SearchParamDefinition(name="identifier", path="Account.identifier | AdverseEvent.identifier | AllergyIntolerance.identifier | Appointment.identifier | AppointmentResponse.identifier | Basic.identifier | BodyStructure.identifier | CarePlan.identifier | CareTeam.identifier | ChargeItem.identifier | Claim.identifier | ClaimResponse.identifier | ClinicalImpression.identifier | Communication.identifier | CommunicationRequest.identifier | Composition.identifier | Condition.identifier | Consent.identifier | Contract.identifier | Coverage.identifier | CoverageEligibilityRequest.identifier | CoverageEligibilityResponse.identifier | DetectedIssue.identifier | DeviceRequest.identifier | DeviceUsage.identifier | DiagnosticReport.identifier | DocumentReference.identifier | Encounter.identifier | EnrollmentRequest.identifier | EpisodeOfCare.identifier | ExplanationOfBenefit.identifier | FamilyMemberHistory.identifier | Flag.identifier | Goal.identifier | GuidanceResponse.identifier | ImagingSelection.identifier | ImagingStudy.identifier | Immunization.identifier | ImmunizationEvaluation.identifier | ImmunizationRecommendation.identifier | Invoice.identifier | List.identifier | MeasureReport.identifier | Medication.identifier | MedicationAdministration.identifier | MedicationDispense.identifier | MedicationRequest.identifier | MedicationStatement.identifier | MolecularSequence.identifier | NutritionIntake.identifier | NutritionOrder.identifier | Observation.identifier | Person.identifier | Procedure.identifier | QuestionnaireResponse.identifier | RelatedPerson.identifier | RequestOrchestration.identifier | ResearchSubject.identifier | RiskAssessment.identifier | ServiceRequest.identifier | Specimen.identifier | SupplyDelivery.identifier | SupplyRequest.identifier | Task.identifier | VisionPrescription.identifier", description="Multiple Resources: \r\n\r\n* [Account](account.html): Account number\r\n* [AdverseEvent](adverseevent.html): Business identifier for the event\r\n* [AllergyIntolerance](allergyintolerance.html): External ids for this item\r\n* [Appointment](appointment.html): An Identifier of the Appointment\r\n* [AppointmentResponse](appointmentresponse.html): An Identifier in this appointment response\r\n* [Basic](basic.html): Business identifier\r\n* [BodyStructure](bodystructure.html): Bodystructure identifier\r\n* [CarePlan](careplan.html): External Ids for this plan\r\n* [CareTeam](careteam.html): External Ids for this team\r\n* [ChargeItem](chargeitem.html): Business Identifier for item\r\n* [Claim](claim.html): The primary identifier of the financial resource\r\n* [ClaimResponse](claimresponse.html): The identity of the ClaimResponse\r\n* [ClinicalImpression](clinicalimpression.html): Business identifier\r\n* [Communication](communication.html): Unique identifier\r\n* [CommunicationRequest](communicationrequest.html): Unique identifier\r\n* [Composition](composition.html): Version-independent identifier for the Composition\r\n* [Condition](condition.html): A unique identifier of the condition record\r\n* [Consent](consent.html): Identifier for this record (external references)\r\n* [Contract](contract.html): The identity of the contract\r\n* [Coverage](coverage.html): The primary identifier of the insured and the coverage\r\n* [CoverageEligibilityRequest](coverageeligibilityrequest.html): The business identifier of the Eligibility\r\n* [CoverageEligibilityResponse](coverageeligibilityresponse.html): The business identifier\r\n* [DetectedIssue](detectedissue.html): Unique id for the detected issue\r\n* [DeviceRequest](devicerequest.html): Business identifier for request/order\r\n* [DeviceUsage](deviceusage.html): Search by identifier\r\n* [DiagnosticReport](diagnosticreport.html): An identifier for the report\r\n* [DocumentReference](documentreference.html): Identifier of the attachment binary\r\n* [Encounter](encounter.html): Identifier(s) by which this encounter is known\r\n* [EnrollmentRequest](enrollmentrequest.html): The business identifier of the Enrollment\r\n* [EpisodeOfCare](episodeofcare.html): Business Identifier(s) relevant for this EpisodeOfCare\r\n* [ExplanationOfBenefit](explanationofbenefit.html): The business identifier of the Explanation of Benefit\r\n* [FamilyMemberHistory](familymemberhistory.html): A search by a record identifier\r\n* [Flag](flag.html): Business identifier\r\n* [Goal](goal.html): External Ids for this goal\r\n* [GuidanceResponse](guidanceresponse.html): The identifier of the guidance response\r\n* [ImagingSelection](imagingselection.html): Identifiers for the imaging selection\r\n* [ImagingStudy](imagingstudy.html): Identifiers for the Study, such as DICOM Study Instance UID\r\n* [Immunization](immunization.html): Business identifier\r\n* [ImmunizationEvaluation](immunizationevaluation.html): ID of the evaluation\r\n* [ImmunizationRecommendation](immunizationrecommendation.html): Business identifier\r\n* [Invoice](invoice.html): Business Identifier for item\r\n* [List](list.html): Business identifier\r\n* [MeasureReport](measurereport.html): External identifier of the measure report to be returned\r\n* [Medication](medication.html): Returns medications with this external identifier\r\n* [MedicationAdministration](medicationadministration.html): Return administrations with this external identifier\r\n* [MedicationDispense](medicationdispense.html): Returns dispenses with this external identifier\r\n* [MedicationRequest](medicationrequest.html): Return prescriptions with this external identifier\r\n* [MedicationStatement](medicationstatement.html): Return statements with this external identifier\r\n* [MolecularSequence](molecularsequence.html): The unique identity for a particular sequence\r\n* [NutritionIntake](nutritionintake.html): Return statements with this external identifier\r\n* [NutritionOrder](nutritionorder.html): Return nutrition orders with this external identifier\r\n* [Observation](observation.html): The unique id for a particular observation\r\n* [Person](person.html): A person Identifier\r\n* [Procedure](procedure.html): A unique identifier for a procedure\r\n* [QuestionnaireResponse](questionnaireresponse.html): The unique identifier for the questionnaire response\r\n* [RelatedPerson](relatedperson.html): An Identifier of the RelatedPerson\r\n* [RequestOrchestration](requestorchestration.html): External identifiers for the request orchestration\r\n* [ResearchSubject](researchsubject.html): Business Identifier for research subject in a study\r\n* [RiskAssessment](riskassessment.html): Unique identifier for the assessment\r\n* [ServiceRequest](servicerequest.html): Identifiers assigned to this order\r\n* [Specimen](specimen.html): The unique identifier associated with the specimen\r\n* [SupplyDelivery](supplydelivery.html): External identifier\r\n* [SupplyRequest](supplyrequest.html): Business Identifier for SupplyRequest\r\n* [Task](task.html): Search for a task instance by its business identifier\r\n* [VisionPrescription](visionprescription.html): Return prescriptions with this external identifier\r\n", type="token" )
  public static final String SP_IDENTIFIER = "identifier";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Account](account.html): Account number
* [AdverseEvent](adverseevent.html): Business identifier for the event
* [AllergyIntolerance](allergyintolerance.html): External ids for this item
* [Appointment](appointment.html): An Identifier of the Appointment
* [AppointmentResponse](appointmentresponse.html): An Identifier in this appointment response
* [Basic](basic.html): Business identifier
* [BodyStructure](bodystructure.html): Bodystructure identifier
* [CarePlan](careplan.html): External Ids for this plan
* [CareTeam](careteam.html): External Ids for this team
* [ChargeItem](chargeitem.html): Business Identifier for item
* [Claim](claim.html): The primary identifier of the financial resource
* [ClaimResponse](claimresponse.html): The identity of the ClaimResponse
* [ClinicalImpression](clinicalimpression.html): Business identifier
* [Communication](communication.html): Unique identifier
* [CommunicationRequest](communicationrequest.html): Unique identifier
* [Composition](composition.html): Version-independent identifier for the Composition
* [Condition](condition.html): A unique identifier of the condition record
* [Consent](consent.html): Identifier for this record (external references)
* [Contract](contract.html): The identity of the contract
* [Coverage](coverage.html): The primary identifier of the insured and the coverage
* [CoverageEligibilityRequest](coverageeligibilityrequest.html): The business identifier of the Eligibility
* [CoverageEligibilityResponse](coverageeligibilityresponse.html): The business identifier
* [DetectedIssue](detectedissue.html): Unique id for the detected issue
* [DeviceRequest](devicerequest.html): Business identifier for request/order
* [DeviceUsage](deviceusage.html): Search by identifier
* [DiagnosticReport](diagnosticreport.html): An identifier for the report
* [DocumentReference](documentreference.html): Identifier of the attachment binary
* [Encounter](encounter.html): Identifier(s) by which this encounter is known
* [EnrollmentRequest](enrollmentrequest.html): The business identifier of the Enrollment
* [EpisodeOfCare](episodeofcare.html): Business Identifier(s) relevant for this EpisodeOfCare
* [ExplanationOfBenefit](explanationofbenefit.html): The business identifier of the Explanation of Benefit
* [FamilyMemberHistory](familymemberhistory.html): A search by a record identifier
* [Flag](flag.html): Business identifier
* [Goal](goal.html): External Ids for this goal
* [GuidanceResponse](guidanceresponse.html): The identifier of the guidance response
* [ImagingSelection](imagingselection.html): Identifiers for the imaging selection
* [ImagingStudy](imagingstudy.html): Identifiers for the Study, such as DICOM Study Instance UID
* [Immunization](immunization.html): Business identifier
* [ImmunizationEvaluation](immunizationevaluation.html): ID of the evaluation
* [ImmunizationRecommendation](immunizationrecommendation.html): Business identifier
* [Invoice](invoice.html): Business Identifier for item
* [List](list.html): Business identifier
* [MeasureReport](measurereport.html): External identifier of the measure report to be returned
* [Medication](medication.html): Returns medications with this external identifier
* [MedicationAdministration](medicationadministration.html): Return administrations with this external identifier
* [MedicationDispense](medicationdispense.html): Returns dispenses with this external identifier
* [MedicationRequest](medicationrequest.html): Return prescriptions with this external identifier
* [MedicationStatement](medicationstatement.html): Return statements with this external identifier
* [MolecularSequence](molecularsequence.html): The unique identity for a particular sequence
* [NutritionIntake](nutritionintake.html): Return statements with this external identifier
* [NutritionOrder](nutritionorder.html): Return nutrition orders with this external identifier
* [Observation](observation.html): The unique id for a particular observation
* [Person](person.html): A person Identifier
* [Procedure](procedure.html): A unique identifier for a procedure
* [QuestionnaireResponse](questionnaireresponse.html): The unique identifier for the questionnaire response
* [RelatedPerson](relatedperson.html): An Identifier of the RelatedPerson
* [RequestOrchestration](requestorchestration.html): External identifiers for the request orchestration
* [ResearchSubject](researchsubject.html): Business Identifier for research subject in a study
* [RiskAssessment](riskassessment.html): Unique identifier for the assessment
* [ServiceRequest](servicerequest.html): Identifiers assigned to this order
* [Specimen](specimen.html): The unique identifier associated with the specimen
* [SupplyDelivery](supplydelivery.html): External identifier
* [SupplyRequest](supplyrequest.html): Business Identifier for SupplyRequest
* [Task](task.html): Search for a task instance by its business identifier
* [VisionPrescription](visionprescription.html): Return prescriptions with this external identifier
</b><br>
   * Type: <b>token</b><br>
   * Path: <b>Account.identifier | AdverseEvent.identifier | AllergyIntolerance.identifier | Appointment.identifier | AppointmentResponse.identifier | Basic.identifier | BodyStructure.identifier | CarePlan.identifier | CareTeam.identifier | ChargeItem.identifier | Claim.identifier | ClaimResponse.identifier | ClinicalImpression.identifier | Communication.identifier | CommunicationRequest.identifier | Composition.identifier | Condition.identifier | Consent.identifier | Contract.identifier | Coverage.identifier | CoverageEligibilityRequest.identifier | CoverageEligibilityResponse.identifier | DetectedIssue.identifier | DeviceRequest.identifier | DeviceUsage.identifier | DiagnosticReport.identifier | DocumentReference.identifier | Encounter.identifier | EnrollmentRequest.identifier | EpisodeOfCare.identifier | ExplanationOfBenefit.identifier | FamilyMemberHistory.identifier | Flag.identifier | Goal.identifier | GuidanceResponse.identifier | ImagingSelection.identifier | ImagingStudy.identifier | Immunization.identifier | ImmunizationEvaluation.identifier | ImmunizationRecommendation.identifier | Invoice.identifier | List.identifier | MeasureReport.identifier | Medication.identifier | MedicationAdministration.identifier | MedicationDispense.identifier | MedicationRequest.identifier | MedicationStatement.identifier | MolecularSequence.identifier | NutritionIntake.identifier | NutritionOrder.identifier | Observation.identifier | Person.identifier | Procedure.identifier | QuestionnaireResponse.identifier | RelatedPerson.identifier | RequestOrchestration.identifier | ResearchSubject.identifier | RiskAssessment.identifier | ServiceRequest.identifier | Specimen.identifier | SupplyDelivery.identifier | SupplyRequest.identifier | Task.identifier | VisionPrescription.identifier</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.TokenClientParam IDENTIFIER = new ca.uhn.fhir.rest.gclient.TokenClientParam(SP_IDENTIFIER);

 /**
   * Search parameter: <b>patient</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Account](account.html): The entity that caused the expenses
* [AdverseEvent](adverseevent.html): Subject impacted by event
* [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for
* [Appointment](appointment.html): One of the individuals of the appointment is this patient
* [AppointmentResponse](appointmentresponse.html): This Response is for this Patient
* [AuditEvent](auditevent.html): Where the activity involved patient data
* [Basic](basic.html): Identifies the focus of this resource
* [BodyStructure](bodystructure.html): Who this is about
* [CarePlan](careplan.html): Who the care plan is for
* [CareTeam](careteam.html): Who care team is for
* [ChargeItem](chargeitem.html): Individual service was done for/to
* [Claim](claim.html): Patient receiving the products or services
* [ClaimResponse](claimresponse.html): The subject of care
* [ClinicalImpression](clinicalimpression.html): Patient assessed
* [Communication](communication.html): Focus of message
* [CommunicationRequest](communicationrequest.html): Focus of message
* [Composition](composition.html): Who and/or what the composition is about
* [Condition](condition.html): Who has the condition?
* [Consent](consent.html): Who the consent applies to
* [Contract](contract.html): The identity of the subject of the contract (if a patient)
* [Coverage](coverage.html): Retrieve coverages for a patient
* [CoverageEligibilityRequest](coverageeligibilityrequest.html): The reference to the patient
* [CoverageEligibilityResponse](coverageeligibilityresponse.html): The reference to the patient
* [DetectedIssue](detectedissue.html): Associated patient
* [DeviceRequest](devicerequest.html): Individual the service is ordered for
* [DeviceUsage](deviceusage.html): Search by patient who used / uses the device
* [DiagnosticReport](diagnosticreport.html): The subject of the report if a patient
* [DocumentReference](documentreference.html): Who/what is the subject of the document
* [Encounter](encounter.html): The patient present at the encounter
* [EnrollmentRequest](enrollmentrequest.html): The party to be enrolled
* [EpisodeOfCare](episodeofcare.html): The patient who is the focus of this episode of care
* [ExplanationOfBenefit](explanationofbenefit.html): The reference to the patient
* [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to list family member history items for
* [Flag](flag.html): The identity of a subject to list flags for
* [Goal](goal.html): Who this goal is intended for
* [GuidanceResponse](guidanceresponse.html): The identity of a patient to search for guidance response results
* [ImagingSelection](imagingselection.html): Who the study is about
* [ImagingStudy](imagingstudy.html): Who the study is about
* [Immunization](immunization.html): The patient for the vaccination record
* [ImmunizationEvaluation](immunizationevaluation.html): The patient being evaluated
* [ImmunizationRecommendation](immunizationrecommendation.html): Who this profile is for
* [Invoice](invoice.html): Recipient(s) of goods and services
* [List](list.html): If all resources have the same subject
* [MeasureReport](measurereport.html): The identity of a patient to search for individual measure report results for
* [MedicationAdministration](medicationadministration.html): The identity of a patient to list administrations  for
* [MedicationDispense](medicationdispense.html): The identity of a patient to list dispenses  for
* [MedicationRequest](medicationrequest.html): Returns prescriptions for a specific patient
* [MedicationStatement](medicationstatement.html): Returns statements for a specific patient.
* [MolecularSequence](molecularsequence.html): The subject that the sequence is about
* [NutritionIntake](nutritionintake.html): Returns statements for a specific patient.
* [NutritionOrder](nutritionorder.html): The identity of the individual or set of individuals who requires the diet, formula or nutritional supplement
* [Observation](observation.html): The subject that the observation is about (if patient)
* [Person](person.html): The Person links to this Patient
* [Procedure](procedure.html): Search by subject - a patient
* [Provenance](provenance.html): Where the activity involved patient data
* [QuestionnaireResponse](questionnaireresponse.html): The patient that is the subject of the questionnaire response
* [RelatedPerson](relatedperson.html): The patient this related person is related to
* [RequestOrchestration](requestorchestration.html): The identity of a patient to search for request orchestrations
* [ResearchSubject](researchsubject.html): Who or what is part of study
* [RiskAssessment](riskassessment.html): Who/what does assessment apply to?
* [ServiceRequest](servicerequest.html): Search by subject - a patient
* [Specimen](specimen.html): The patient the specimen comes from
* [SupplyDelivery](supplydelivery.html): Patient for whom the item is supplied
* [SupplyRequest](supplyrequest.html): The patient or subject for whom the supply is destined
* [Task](task.html): Search by patient
* [VisionPrescription](visionprescription.html): The identity of a patient to list dispenses for
</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Account.subject.where(resolve() is Patient) | AdverseEvent.subject.where(resolve() is Patient) | AllergyIntolerance.patient | Appointment.participant.actor.where(resolve() is Patient) | Appointment.subject.where(resolve() is Patient) | AppointmentResponse.actor.where(resolve() is Patient) | AuditEvent.patient | Basic.subject.where(resolve() is Patient) | BodyStructure.patient | CarePlan.subject.where(resolve() is Patient) | CareTeam.subject.where(resolve() is Patient) | ChargeItem.subject.where(resolve() is Patient) | Claim.patient | ClaimResponse.patient | ClinicalImpression.subject.where(resolve() is Patient) | Communication.subject.where(resolve() is Patient) | CommunicationRequest.subject.where(resolve() is Patient) | Composition.subject.where(resolve() is Patient) | Condition.subject.where(resolve() is Patient) | Consent.subject.where(resolve() is Patient) | Contract.subject.where(resolve() is Patient) | Coverage.beneficiary | CoverageEligibilityRequest.patient | CoverageEligibilityResponse.patient | DetectedIssue.subject.where(resolve() is Patient) | DeviceRequest.subject.where(resolve() is Patient) | DeviceUsage.patient | DiagnosticReport.subject.where(resolve() is Patient) | DocumentReference.subject.where(resolve() is Patient) | Encounter.subject.where(resolve() is Patient) | EnrollmentRequest.candidate | EpisodeOfCare.patient | ExplanationOfBenefit.patient | FamilyMemberHistory.patient | Flag.subject.where(resolve() is Patient) | Goal.subject.where(resolve() is Patient) | GuidanceResponse.subject.where(resolve() is Patient) | ImagingSelection.subject.where(resolve() is Patient) | ImagingStudy.subject.where(resolve() is Patient) | Immunization.patient | ImmunizationEvaluation.patient | ImmunizationRecommendation.patient | Invoice.subject.where(resolve() is Patient) | List.subject.where(resolve() is Patient) | MeasureReport.subject.where(resolve() is Patient) | MedicationAdministration.subject.where(resolve() is Patient) | MedicationDispense.subject.where(resolve() is Patient) | MedicationRequest.subject.where(resolve() is Patient) | MedicationStatement.subject.where(resolve() is Patient) | MolecularSequence.subject.where(resolve() is Patient) | NutritionIntake.subject.where(resolve() is Patient) | NutritionOrder.subject.where(resolve() is Patient) | Observation.subject.where(resolve() is Patient) | Person.link.target.where(resolve() is Patient) | Procedure.subject.where(resolve() is Patient) | Provenance.patient | QuestionnaireResponse.subject.where(resolve() is Patient) | RelatedPerson.patient | RequestOrchestration.subject.where(resolve() is Patient) | ResearchSubject.subject.where(resolve() is Patient) | RiskAssessment.subject.where(resolve() is Patient) | ServiceRequest.subject.where(resolve() is Patient) | Specimen.subject.where(resolve() is Patient) | SupplyDelivery.patient | SupplyRequest.deliverFor | Task.for.where(resolve() is Patient) | VisionPrescription.patient</b><br>
   * </p>
   */
  @SearchParamDefinition(name="patient", path="Account.subject.where(resolve() is Patient) | AdverseEvent.subject.where(resolve() is Patient) | AllergyIntolerance.patient | Appointment.participant.actor.where(resolve() is Patient) | Appointment.subject.where(resolve() is Patient) | AppointmentResponse.actor.where(resolve() is Patient) | AuditEvent.patient | Basic.subject.where(resolve() is Patient) | BodyStructure.patient | CarePlan.subject.where(resolve() is Patient) | CareTeam.subject.where(resolve() is Patient) | ChargeItem.subject.where(resolve() is Patient) | Claim.patient | ClaimResponse.patient | ClinicalImpression.subject.where(resolve() is Patient) | Communication.subject.where(resolve() is Patient) | CommunicationRequest.subject.where(resolve() is Patient) | Composition.subject.where(resolve() is Patient) | Condition.subject.where(resolve() is Patient) | Consent.subject.where(resolve() is Patient) | Contract.subject.where(resolve() is Patient) | Coverage.beneficiary | CoverageEligibilityRequest.patient | CoverageEligibilityResponse.patient | DetectedIssue.subject.where(resolve() is Patient) | DeviceRequest.subject.where(resolve() is Patient) | DeviceUsage.patient | DiagnosticReport.subject.where(resolve() is Patient) | DocumentReference.subject.where(resolve() is Patient) | Encounter.subject.where(resolve() is Patient) | EnrollmentRequest.candidate | EpisodeOfCare.patient | ExplanationOfBenefit.patient | FamilyMemberHistory.patient | Flag.subject.where(resolve() is Patient) | Goal.subject.where(resolve() is Patient) | GuidanceResponse.subject.where(resolve() is Patient) | ImagingSelection.subject.where(resolve() is Patient) | ImagingStudy.subject.where(resolve() is Patient) | Immunization.patient | ImmunizationEvaluation.patient | ImmunizationRecommendation.patient | Invoice.subject.where(resolve() is Patient) | List.subject.where(resolve() is Patient) | MeasureReport.subject.where(resolve() is Patient) | MedicationAdministration.subject.where(resolve() is Patient) | MedicationDispense.subject.where(resolve() is Patient) | MedicationRequest.subject.where(resolve() is Patient) | MedicationStatement.subject.where(resolve() is Patient) | MolecularSequence.subject.where(resolve() is Patient) | NutritionIntake.subject.where(resolve() is Patient) | NutritionOrder.subject.where(resolve() is Patient) | Observation.subject.where(resolve() is Patient) | Person.link.target.where(resolve() is Patient) | Procedure.subject.where(resolve() is Patient) | Provenance.patient | QuestionnaireResponse.subject.where(resolve() is Patient) | RelatedPerson.patient | RequestOrchestration.subject.where(resolve() is Patient) | ResearchSubject.subject.where(resolve() is Patient) | RiskAssessment.subject.where(resolve() is Patient) | ServiceRequest.subject.where(resolve() is Patient) | Specimen.subject.where(resolve() is Patient) | SupplyDelivery.patient | SupplyRequest.deliverFor | Task.for.where(resolve() is Patient) | VisionPrescription.patient", description="Multiple Resources: \r\n\r\n* [Account](account.html): The entity that caused the expenses\r\n* [AdverseEvent](adverseevent.html): Subject impacted by event\r\n* [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for\r\n* [Appointment](appointment.html): One of the individuals of the appointment is this patient\r\n* [AppointmentResponse](appointmentresponse.html): This Response is for this Patient\r\n* [AuditEvent](auditevent.html): Where the activity involved patient data\r\n* [Basic](basic.html): Identifies the focus of this resource\r\n* [BodyStructure](bodystructure.html): Who this is about\r\n* [CarePlan](careplan.html): Who the care plan is for\r\n* [CareTeam](careteam.html): Who care team is for\r\n* [ChargeItem](chargeitem.html): Individual service was done for/to\r\n* [Claim](claim.html): Patient receiving the products or services\r\n* [ClaimResponse](claimresponse.html): The subject of care\r\n* [ClinicalImpression](clinicalimpression.html): Patient assessed\r\n* [Communication](communication.html): Focus of message\r\n* [CommunicationRequest](communicationrequest.html): Focus of message\r\n* [Composition](composition.html): Who and/or what the composition is about\r\n* [Condition](condition.html): Who has the condition?\r\n* [Consent](consent.html): Who the consent applies to\r\n* [Contract](contract.html): The identity of the subject of the contract (if a patient)\r\n* [Coverage](coverage.html): Retrieve coverages for a patient\r\n* [CoverageEligibilityRequest](coverageeligibilityrequest.html): The reference to the patient\r\n* [CoverageEligibilityResponse](coverageeligibilityresponse.html): The reference to the patient\r\n* [DetectedIssue](detectedissue.html): Associated patient\r\n* [DeviceRequest](devicerequest.html): Individual the service is ordered for\r\n* [DeviceUsage](deviceusage.html): Search by patient who used / uses the device\r\n* [DiagnosticReport](diagnosticreport.html): The subject of the report if a patient\r\n* [DocumentReference](documentreference.html): Who/what is the subject of the document\r\n* [Encounter](encounter.html): The patient present at the encounter\r\n* [EnrollmentRequest](enrollmentrequest.html): The party to be enrolled\r\n* [EpisodeOfCare](episodeofcare.html): The patient who is the focus of this episode of care\r\n* [ExplanationOfBenefit](explanationofbenefit.html): The reference to the patient\r\n* [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to list family member history items for\r\n* [Flag](flag.html): The identity of a subject to list flags for\r\n* [Goal](goal.html): Who this goal is intended for\r\n* [GuidanceResponse](guidanceresponse.html): The identity of a patient to search for guidance response results\r\n* [ImagingSelection](imagingselection.html): Who the study is about\r\n* [ImagingStudy](imagingstudy.html): Who the study is about\r\n* [Immunization](immunization.html): The patient for the vaccination record\r\n* [ImmunizationEvaluation](immunizationevaluation.html): The patient being evaluated\r\n* [ImmunizationRecommendation](immunizationrecommendation.html): Who this profile is for\r\n* [Invoice](invoice.html): Recipient(s) of goods and services\r\n* [List](list.html): If all resources have the same subject\r\n* [MeasureReport](measurereport.html): The identity of a patient to search for individual measure report results for\r\n* [MedicationAdministration](medicationadministration.html): The identity of a patient to list administrations  for\r\n* [MedicationDispense](medicationdispense.html): The identity of a patient to list dispenses  for\r\n* [MedicationRequest](medicationrequest.html): Returns prescriptions for a specific patient\r\n* [MedicationStatement](medicationstatement.html): Returns statements for a specific patient.\r\n* [MolecularSequence](molecularsequence.html): The subject that the sequence is about\r\n* [NutritionIntake](nutritionintake.html): Returns statements for a specific patient.\r\n* [NutritionOrder](nutritionorder.html): The identity of the individual or set of individuals who requires the diet, formula or nutritional supplement\r\n* [Observation](observation.html): The subject that the observation is about (if patient)\r\n* [Person](person.html): The Person links to this Patient\r\n* [Procedure](procedure.html): Search by subject - a patient\r\n* [Provenance](provenance.html): Where the activity involved patient data\r\n* [QuestionnaireResponse](questionnaireresponse.html): The patient that is the subject of the questionnaire response\r\n* [RelatedPerson](relatedperson.html): The patient this related person is related to\r\n* [RequestOrchestration](requestorchestration.html): The identity of a patient to search for request orchestrations\r\n* [ResearchSubject](researchsubject.html): Who or what is part of study\r\n* [RiskAssessment](riskassessment.html): Who/what does assessment apply to?\r\n* [ServiceRequest](servicerequest.html): Search by subject - a patient\r\n* [Specimen](specimen.html): The patient the specimen comes from\r\n* [SupplyDelivery](supplydelivery.html): Patient for whom the item is supplied\r\n* [SupplyRequest](supplyrequest.html): The patient or subject for whom the supply is destined\r\n* [Task](task.html): Search by patient\r\n* [VisionPrescription](visionprescription.html): The identity of a patient to list dispenses for\r\n", type="reference", providesMembershipIn={ @ca.uhn.fhir.model.api.annotation.Compartment(name="Base FHIR compartment definition for Patient") }, target={Patient.class } )
  public static final String SP_PATIENT = "patient";
 /**
   * <b>Fluent Client</b> search parameter constant for <b>patient</b>
   * <p>
   * Description: <b>Multiple Resources: 

* [Account](account.html): The entity that caused the expenses
* [AdverseEvent](adverseevent.html): Subject impacted by event
* [AllergyIntolerance](allergyintolerance.html): Who the sensitivity is for
* [Appointment](appointment.html): One of the individuals of the appointment is this patient
* [AppointmentResponse](appointmentresponse.html): This Response is for this Patient
* [AuditEvent](auditevent.html): Where the activity involved patient data
* [Basic](basic.html): Identifies the focus of this resource
* [BodyStructure](bodystructure.html): Who this is about
* [CarePlan](careplan.html): Who the care plan is for
* [CareTeam](careteam.html): Who care team is for
* [ChargeItem](chargeitem.html): Individual service was done for/to
* [Claim](claim.html): Patient receiving the products or services
* [ClaimResponse](claimresponse.html): The subject of care
* [ClinicalImpression](clinicalimpression.html): Patient assessed
* [Communication](communication.html): Focus of message
* [CommunicationRequest](communicationrequest.html): Focus of message
* [Composition](composition.html): Who and/or what the composition is about
* [Condition](condition.html): Who has the condition?
* [Consent](consent.html): Who the consent applies to
* [Contract](contract.html): The identity of the subject of the contract (if a patient)
* [Coverage](coverage.html): Retrieve coverages for a patient
* [CoverageEligibilityRequest](coverageeligibilityrequest.html): The reference to the patient
* [CoverageEligibilityResponse](coverageeligibilityresponse.html): The reference to the patient
* [DetectedIssue](detectedissue.html): Associated patient
* [DeviceRequest](devicerequest.html): Individual the service is ordered for
* [DeviceUsage](deviceusage.html): Search by patient who used / uses the device
* [DiagnosticReport](diagnosticreport.html): The subject of the report if a patient
* [DocumentReference](documentreference.html): Who/what is the subject of the document
* [Encounter](encounter.html): The patient present at the encounter
* [EnrollmentRequest](enrollmentrequest.html): The party to be enrolled
* [EpisodeOfCare](episodeofcare.html): The patient who is the focus of this episode of care
* [ExplanationOfBenefit](explanationofbenefit.html): The reference to the patient
* [FamilyMemberHistory](familymemberhistory.html): The identity of a subject to list family member history items for
* [Flag](flag.html): The identity of a subject to list flags for
* [Goal](goal.html): Who this goal is intended for
* [GuidanceResponse](guidanceresponse.html): The identity of a patient to search for guidance response results
* [ImagingSelection](imagingselection.html): Who the study is about
* [ImagingStudy](imagingstudy.html): Who the study is about
* [Immunization](immunization.html): The patient for the vaccination record
* [ImmunizationEvaluation](immunizationevaluation.html): The patient being evaluated
* [ImmunizationRecommendation](immunizationrecommendation.html): Who this profile is for
* [Invoice](invoice.html): Recipient(s) of goods and services
* [List](list.html): If all resources have the same subject
* [MeasureReport](measurereport.html): The identity of a patient to search for individual measure report results for
* [MedicationAdministration](medicationadministration.html): The identity of a patient to list administrations  for
* [MedicationDispense](medicationdispense.html): The identity of a patient to list dispenses  for
* [MedicationRequest](medicationrequest.html): Returns prescriptions for a specific patient
* [MedicationStatement](medicationstatement.html): Returns statements for a specific patient.
* [MolecularSequence](molecularsequence.html): The subject that the sequence is about
* [NutritionIntake](nutritionintake.html): Returns statements for a specific patient.
* [NutritionOrder](nutritionorder.html): The identity of the individual or set of individuals who requires the diet, formula or nutritional supplement
* [Observation](observation.html): The subject that the observation is about (if patient)
* [Person](person.html): The Person links to this Patient
* [Procedure](procedure.html): Search by subject - a patient
* [Provenance](provenance.html): Where the activity involved patient data
* [QuestionnaireResponse](questionnaireresponse.html): The patient that is the subject of the questionnaire response
* [RelatedPerson](relatedperson.html): The patient this related person is related to
* [RequestOrchestration](requestorchestration.html): The identity of a patient to search for request orchestrations
* [ResearchSubject](researchsubject.html): Who or what is part of study
* [RiskAssessment](riskassessment.html): Who/what does assessment apply to?
* [ServiceRequest](servicerequest.html): Search by subject - a patient
* [Specimen](specimen.html): The patient the specimen comes from
* [SupplyDelivery](supplydelivery.html): Patient for whom the item is supplied
* [SupplyRequest](supplyrequest.html): The patient or subject for whom the supply is destined
* [Task](task.html): Search by patient
* [VisionPrescription](visionprescription.html): The identity of a patient to list dispenses for
</b><br>
   * Type: <b>reference</b><br>
   * Path: <b>Account.subject.where(resolve() is Patient) | AdverseEvent.subject.where(resolve() is Patient) | AllergyIntolerance.patient | Appointment.participant.actor.where(resolve() is Patient) | Appointment.subject.where(resolve() is Patient) | AppointmentResponse.actor.where(resolve() is Patient) | AuditEvent.patient | Basic.subject.where(resolve() is Patient) | BodyStructure.patient | CarePlan.subject.where(resolve() is Patient) | CareTeam.subject.where(resolve() is Patient) | ChargeItem.subject.where(resolve() is Patient) | Claim.patient | ClaimResponse.patient | ClinicalImpression.subject.where(resolve() is Patient) | Communication.subject.where(resolve() is Patient) | CommunicationRequest.subject.where(resolve() is Patient) | Composition.subject.where(resolve() is Patient) | Condition.subject.where(resolve() is Patient) | Consent.subject.where(resolve() is Patient) | Contract.subject.where(resolve() is Patient) | Coverage.beneficiary | CoverageEligibilityRequest.patient | CoverageEligibilityResponse.patient | DetectedIssue.subject.where(resolve() is Patient) | DeviceRequest.subject.where(resolve() is Patient) | DeviceUsage.patient | DiagnosticReport.subject.where(resolve() is Patient) | DocumentReference.subject.where(resolve() is Patient) | Encounter.subject.where(resolve() is Patient) | EnrollmentRequest.candidate | EpisodeOfCare.patient | ExplanationOfBenefit.patient | FamilyMemberHistory.patient | Flag.subject.where(resolve() is Patient) | Goal.subject.where(resolve() is Patient) | GuidanceResponse.subject.where(resolve() is Patient) | ImagingSelection.subject.where(resolve() is Patient) | ImagingStudy.subject.where(resolve() is Patient) | Immunization.patient | ImmunizationEvaluation.patient | ImmunizationRecommendation.patient | Invoice.subject.where(resolve() is Patient) | List.subject.where(resolve() is Patient) | MeasureReport.subject.where(resolve() is Patient) | MedicationAdministration.subject.where(resolve() is Patient) | MedicationDispense.subject.where(resolve() is Patient) | MedicationRequest.subject.where(resolve() is Patient) | MedicationStatement.subject.where(resolve() is Patient) | MolecularSequence.subject.where(resolve() is Patient) | NutritionIntake.subject.where(resolve() is Patient) | NutritionOrder.subject.where(resolve() is Patient) | Observation.subject.where(resolve() is Patient) | Person.link.target.where(resolve() is Patient) | Procedure.subject.where(resolve() is Patient) | Provenance.patient | QuestionnaireResponse.subject.where(resolve() is Patient) | RelatedPerson.patient | RequestOrchestration.subject.where(resolve() is Patient) | ResearchSubject.subject.where(resolve() is Patient) | RiskAssessment.subject.where(resolve() is Patient) | ServiceRequest.subject.where(resolve() is Patient) | Specimen.subject.where(resolve() is Patient) | SupplyDelivery.patient | SupplyRequest.deliverFor | Task.for.where(resolve() is Patient) | VisionPrescription.patient</b><br>
   * </p>
   */
  public static final ca.uhn.fhir.rest.gclient.ReferenceClientParam PATIENT = new ca.uhn.fhir.rest.gclient.ReferenceClientParam(SP_PATIENT);

/**
   * Constant for fluent queries to be used to add include statements. Specifies
   * the path value of "<b>CoverageEligibilityRequest:patient</b>".
   */
  public static final ca.uhn.fhir.model.api.Include INCLUDE_PATIENT = new ca.uhn.fhir.model.api.Include("CoverageEligibilityRequest:patient").toLocked();


}

