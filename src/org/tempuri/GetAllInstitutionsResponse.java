/**
 * GetAllInstitutionsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllInstitutionsResponse  implements java.io.Serializable {
    private org.tempuri.Institution[] getAllInstitutionsResult;

    public GetAllInstitutionsResponse() {
    }

    public GetAllInstitutionsResponse(
           org.tempuri.Institution[] getAllInstitutionsResult) {
           this.getAllInstitutionsResult = getAllInstitutionsResult;
    }


    /**
     * Gets the getAllInstitutionsResult value for this GetAllInstitutionsResponse.
     * 
     * @return getAllInstitutionsResult
     */
    public org.tempuri.Institution[] getGetAllInstitutionsResult() {
        return getAllInstitutionsResult;
    }


    /**
     * Sets the getAllInstitutionsResult value for this GetAllInstitutionsResponse.
     * 
     * @param getAllInstitutionsResult
     */
    public void setGetAllInstitutionsResult(org.tempuri.Institution[] getAllInstitutionsResult) {
        this.getAllInstitutionsResult = getAllInstitutionsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllInstitutionsResponse)) return false;
        GetAllInstitutionsResponse other = (GetAllInstitutionsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllInstitutionsResult==null && other.getGetAllInstitutionsResult()==null) || 
             (this.getAllInstitutionsResult!=null &&
              java.util.Arrays.equals(this.getAllInstitutionsResult, other.getGetAllInstitutionsResult())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getGetAllInstitutionsResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetAllInstitutionsResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetAllInstitutionsResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetAllInstitutionsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllInstitutionsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllInstitutionsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllInstitutionsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Institution"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "Institution"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
