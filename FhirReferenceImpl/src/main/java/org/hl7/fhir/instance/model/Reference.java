package org.hl7.fhir.instance.model;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Tue, Oct 21, 2014 07:07+1100 for FHIR v0.3.0

import java.util.*;

/**
 * A reference from one resource to another.
 */
public class Reference extends Type {

    /**
     * A reference to a location at which the other resource is found. The reference may a relative reference, in which case it is relative to the service base URL, or an absolute URL that resolves to the location where the resource is found. The reference may be version specific or not. If the reference is not to a FHIR RESTful server, then it should be assumed to be version specific. Internal fragment references (start with '#') refer to contained resources.
     */
    protected StringType reference;

    /**
     * Plain text narrative that identifies the resource in addition to the resource reference.
     */
    protected StringType display;

    private static final long serialVersionUID = 22777321L;

    public Reference() {
      super();
    }

    /**
     * @return {@link #reference} (A reference to a location at which the other resource is found. The reference may a relative reference, in which case it is relative to the service base URL, or an absolute URL that resolves to the location where the resource is found. The reference may be version specific or not. If the reference is not to a FHIR RESTful server, then it should be assumed to be version specific. Internal fragment references (start with '#') refer to contained resources.). This is the underlying object with id, value and extensions. The accessor "getReference" gives direct access to the value
     */
    public StringType getReferenceElement() { 
      return this.reference;
    }

    /**
     * @param value {@link #reference} (A reference to a location at which the other resource is found. The reference may a relative reference, in which case it is relative to the service base URL, or an absolute URL that resolves to the location where the resource is found. The reference may be version specific or not. If the reference is not to a FHIR RESTful server, then it should be assumed to be version specific. Internal fragment references (start with '#') refer to contained resources.). This is the underlying object with id, value and extensions. The accessor "getReference" gives direct access to the value
     */
    public Reference setReferenceElement(StringType value) { 
      this.reference = value;
      return this;
    }

    /**
     * @return A reference to a location at which the other resource is found. The reference may a relative reference, in which case it is relative to the service base URL, or an absolute URL that resolves to the location where the resource is found. The reference may be version specific or not. If the reference is not to a FHIR RESTful server, then it should be assumed to be version specific. Internal fragment references (start with '#') refer to contained resources.
     */
    public String getReference() { 
      return this.reference == null ? null : this.reference.getValue();
    }

    /**
     * @param value A reference to a location at which the other resource is found. The reference may a relative reference, in which case it is relative to the service base URL, or an absolute URL that resolves to the location where the resource is found. The reference may be version specific or not. If the reference is not to a FHIR RESTful server, then it should be assumed to be version specific. Internal fragment references (start with '#') refer to contained resources.
     */
    public Reference setReference(String value) { 
      if (value == null)
        this.reference = null;
      else {
        if (this.reference == null)
          this.reference = new StringType();
        this.reference.setValue(value);
      }
      return this;
    }

    /**
     * @return {@link #display} (Plain text narrative that identifies the resource in addition to the resource reference.). This is the underlying object with id, value and extensions. The accessor "getDisplay" gives direct access to the value
     */
    public StringType getDisplayElement() { 
      return this.display;
    }

    /**
     * @param value {@link #display} (Plain text narrative that identifies the resource in addition to the resource reference.). This is the underlying object with id, value and extensions. The accessor "getDisplay" gives direct access to the value
     */
    public Reference setDisplayElement(StringType value) { 
      this.display = value;
      return this;
    }

    /**
     * @return Plain text narrative that identifies the resource in addition to the resource reference.
     */
    public String getDisplay() { 
      return this.display == null ? null : this.display.getValue();
    }

    /**
     * @param value Plain text narrative that identifies the resource in addition to the resource reference.
     */
    public Reference setDisplay(String value) { 
      if (value == null)
        this.display = null;
      else {
        if (this.display == null)
          this.display = new StringType();
        this.display.setValue(value);
      }
      return this;
    }

      protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("reference", "string", "A reference to a location at which the other resource is found. The reference may a relative reference, in which case it is relative to the service base URL, or an absolute URL that resolves to the location where the resource is found. The reference may be version specific or not. If the reference is not to a FHIR RESTful server, then it should be assumed to be version specific. Internal fragment references (start with '#') refer to contained resources.", 0, java.lang.Integer.MAX_VALUE, reference));
        childrenList.add(new Property("display", "string", "Plain text narrative that identifies the resource in addition to the resource reference.", 0, java.lang.Integer.MAX_VALUE, display));
      }

      public Reference copy() {
        Reference dst = new Reference();
        dst.reference = reference == null ? null : reference.copy();
        dst.display = display == null ? null : display.copy();
        return dst;
      }

      protected Reference typedCopy() {
        return copy();
      }


}

