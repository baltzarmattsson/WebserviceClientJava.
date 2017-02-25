/**
 * GetErpQueriesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetErpQueriesResponse  implements java.io.Serializable {
    private java.lang.String[] getErpQueriesResult;

    public GetErpQueriesResponse() {
    }

    public GetErpQueriesResponse(
           java.lang.String[] getErpQueriesResult) {
           this.getErpQueriesResult = getErpQueriesResult;
    }


    /**
     * Gets the getErpQueriesResult value for this GetErpQueriesResponse.
     * 
     * @return getErpQueriesResult
     */
    public java.lang.String[] getGetErpQueriesResult() {
        return getErpQueriesResult;
    }


    /**
     * Sets the getErpQueriesResult value for this GetErpQueriesResponse.
     * 
     * @param getErpQueriesResult
     */
    public void setGetErpQueriesResult(java.lang.String[] getErpQueriesResult) {
        this.getErpQueriesResult = getErpQueriesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetErpQueriesResponse)) return false;
        GetErpQueriesResponse other = (GetErpQueriesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getErpQueriesResult==null && other.getGetErpQueriesResult()==null) || 
             (this.getErpQueriesResult!=null &&
              java.util.Arrays.equals(this.getErpQueriesResult, other.getGetErpQueriesResult())));
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
        if (getGetErpQueriesResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetErpQueriesResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetErpQueriesResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetErpQueriesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetErpQueriesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getErpQueriesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetErpQueriesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "string"));
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
