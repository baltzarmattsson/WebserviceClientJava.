/**
 * GetAllObjectsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllObjectsResponse  implements java.io.Serializable {
    private java.lang.Object[] getAllObjectsResult;

    public GetAllObjectsResponse() {
    }

    public GetAllObjectsResponse(
           java.lang.Object[] getAllObjectsResult) {
           this.getAllObjectsResult = getAllObjectsResult;
    }


    /**
     * Gets the getAllObjectsResult value for this GetAllObjectsResponse.
     * 
     * @return getAllObjectsResult
     */
    public java.lang.Object[] getGetAllObjectsResult() {
        return getAllObjectsResult;
    }


    /**
     * Sets the getAllObjectsResult value for this GetAllObjectsResponse.
     * 
     * @param getAllObjectsResult
     */
    public void setGetAllObjectsResult(java.lang.Object[] getAllObjectsResult) {
        this.getAllObjectsResult = getAllObjectsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllObjectsResponse)) return false;
        GetAllObjectsResponse other = (GetAllObjectsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllObjectsResult==null && other.getGetAllObjectsResult()==null) || 
             (this.getAllObjectsResult!=null &&
              java.util.Arrays.equals(this.getAllObjectsResult, other.getGetAllObjectsResult())));
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
        if (getGetAllObjectsResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetAllObjectsResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetAllObjectsResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetAllObjectsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllObjectsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllObjectsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllObjectsResult"));
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
