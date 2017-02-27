/**
 * GetERPMethodBasedOnDescriptionStringResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetERPMethodBasedOnDescriptionStringResponse  implements java.io.Serializable {
    private java.lang.String[][] getERPMethodBasedOnDescriptionStringResult;

    public GetERPMethodBasedOnDescriptionStringResponse() {
    }

    public GetERPMethodBasedOnDescriptionStringResponse(
           java.lang.String[][] getERPMethodBasedOnDescriptionStringResult) {
           this.getERPMethodBasedOnDescriptionStringResult = getERPMethodBasedOnDescriptionStringResult;
    }


    /**
     * Gets the getERPMethodBasedOnDescriptionStringResult value for this GetERPMethodBasedOnDescriptionStringResponse.
     * 
     * @return getERPMethodBasedOnDescriptionStringResult
     */
    public java.lang.String[][] getGetERPMethodBasedOnDescriptionStringResult() {
        return getERPMethodBasedOnDescriptionStringResult;
    }


    /**
     * Sets the getERPMethodBasedOnDescriptionStringResult value for this GetERPMethodBasedOnDescriptionStringResponse.
     * 
     * @param getERPMethodBasedOnDescriptionStringResult
     */
    public void setGetERPMethodBasedOnDescriptionStringResult(java.lang.String[][] getERPMethodBasedOnDescriptionStringResult) {
        this.getERPMethodBasedOnDescriptionStringResult = getERPMethodBasedOnDescriptionStringResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetERPMethodBasedOnDescriptionStringResponse)) return false;
        GetERPMethodBasedOnDescriptionStringResponse other = (GetERPMethodBasedOnDescriptionStringResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getERPMethodBasedOnDescriptionStringResult==null && other.getGetERPMethodBasedOnDescriptionStringResult()==null) || 
             (this.getERPMethodBasedOnDescriptionStringResult!=null &&
              java.util.Arrays.equals(this.getERPMethodBasedOnDescriptionStringResult, other.getGetERPMethodBasedOnDescriptionStringResult())));
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
        if (getGetERPMethodBasedOnDescriptionStringResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetERPMethodBasedOnDescriptionStringResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetERPMethodBasedOnDescriptionStringResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetERPMethodBasedOnDescriptionStringResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetERPMethodBasedOnDescriptionStringResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getERPMethodBasedOnDescriptionStringResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetERPMethodBasedOnDescriptionStringResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "ArrayOfString"));
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
