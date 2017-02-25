/**
 * GetColumnNamesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetColumnNamesResponse  implements java.io.Serializable {
    private java.lang.Object[] getColumnNamesResult;

    public GetColumnNamesResponse() {
    }

    public GetColumnNamesResponse(
           java.lang.Object[] getColumnNamesResult) {
           this.getColumnNamesResult = getColumnNamesResult;
    }


    /**
     * Gets the getColumnNamesResult value for this GetColumnNamesResponse.
     * 
     * @return getColumnNamesResult
     */
    public java.lang.Object[] getGetColumnNamesResult() {
        return getColumnNamesResult;
    }


    /**
     * Sets the getColumnNamesResult value for this GetColumnNamesResponse.
     * 
     * @param getColumnNamesResult
     */
    public void setGetColumnNamesResult(java.lang.Object[] getColumnNamesResult) {
        this.getColumnNamesResult = getColumnNamesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetColumnNamesResponse)) return false;
        GetColumnNamesResponse other = (GetColumnNamesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getColumnNamesResult==null && other.getGetColumnNamesResult()==null) || 
             (this.getColumnNamesResult!=null &&
              java.util.Arrays.equals(this.getColumnNamesResult, other.getGetColumnNamesResult())));
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
        if (getGetColumnNamesResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetColumnNamesResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetColumnNamesResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetColumnNamesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetColumnNamesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getColumnNamesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetColumnNamesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "anyType"));
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
