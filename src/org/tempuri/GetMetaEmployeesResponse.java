/**
 * GetMetaEmployeesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetMetaEmployeesResponse  implements java.io.Serializable {
    private java.lang.String[][] getMetaEmployeesResult;

    public GetMetaEmployeesResponse() {
    }

    public GetMetaEmployeesResponse(
           java.lang.String[][] getMetaEmployeesResult) {
           this.getMetaEmployeesResult = getMetaEmployeesResult;
    }


    /**
     * Gets the getMetaEmployeesResult value for this GetMetaEmployeesResponse.
     * 
     * @return getMetaEmployeesResult
     */
    public java.lang.String[][] getGetMetaEmployeesResult() {
        return getMetaEmployeesResult;
    }


    /**
     * Sets the getMetaEmployeesResult value for this GetMetaEmployeesResponse.
     * 
     * @param getMetaEmployeesResult
     */
    public void setGetMetaEmployeesResult(java.lang.String[][] getMetaEmployeesResult) {
        this.getMetaEmployeesResult = getMetaEmployeesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMetaEmployeesResponse)) return false;
        GetMetaEmployeesResponse other = (GetMetaEmployeesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMetaEmployeesResult==null && other.getGetMetaEmployeesResult()==null) || 
             (this.getMetaEmployeesResult!=null &&
              java.util.Arrays.equals(this.getMetaEmployeesResult, other.getGetMetaEmployeesResult())));
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
        if (getGetMetaEmployeesResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetMetaEmployeesResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetMetaEmployeesResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetMetaEmployeesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetMetaEmployeesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMetaEmployeesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetMetaEmployeesResult"));
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
