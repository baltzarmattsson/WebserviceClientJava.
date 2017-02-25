/**
 * GetMetaEmployees2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMetaEmployees2Response  implements java.io.Serializable {
    private java.lang.String[][] getMetaEmployees2Result;

    public GetMetaEmployees2Response() {
    }

    public GetMetaEmployees2Response(
           java.lang.String[][] getMetaEmployees2Result) {
           this.getMetaEmployees2Result = getMetaEmployees2Result;
    }


    /**
     * Gets the getMetaEmployees2Result value for this GetMetaEmployees2Response.
     * 
     * @return getMetaEmployees2Result
     */
    public java.lang.String[][] getGetMetaEmployees2Result() {
        return getMetaEmployees2Result;
    }


    /**
     * Sets the getMetaEmployees2Result value for this GetMetaEmployees2Response.
     * 
     * @param getMetaEmployees2Result
     */
    public void setGetMetaEmployees2Result(java.lang.String[][] getMetaEmployees2Result) {
        this.getMetaEmployees2Result = getMetaEmployees2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMetaEmployees2Response)) return false;
        GetMetaEmployees2Response other = (GetMetaEmployees2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMetaEmployees2Result==null && other.getGetMetaEmployees2Result()==null) || 
             (this.getMetaEmployees2Result!=null &&
              java.util.Arrays.equals(this.getMetaEmployees2Result, other.getGetMetaEmployees2Result())));
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
        if (getGetMetaEmployees2Result() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetMetaEmployees2Result());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetMetaEmployees2Result(), i);
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
        new org.apache.axis.description.TypeDesc(GetMetaEmployees2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMetaEmployees2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMetaEmployees2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMetaEmployees2Result"));
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
