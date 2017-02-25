/**
 * GetAllBuildingsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetAllBuildingsResponse  implements java.io.Serializable {
    private org.tempuri.Building[] getAllBuildingsResult;

    public GetAllBuildingsResponse() {
    }

    public GetAllBuildingsResponse(
           org.tempuri.Building[] getAllBuildingsResult) {
           this.getAllBuildingsResult = getAllBuildingsResult;
    }


    /**
     * Gets the getAllBuildingsResult value for this GetAllBuildingsResponse.
     * 
     * @return getAllBuildingsResult
     */
    public org.tempuri.Building[] getGetAllBuildingsResult() {
        return getAllBuildingsResult;
    }


    /**
     * Sets the getAllBuildingsResult value for this GetAllBuildingsResponse.
     * 
     * @param getAllBuildingsResult
     */
    public void setGetAllBuildingsResult(org.tempuri.Building[] getAllBuildingsResult) {
        this.getAllBuildingsResult = getAllBuildingsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAllBuildingsResponse)) return false;
        GetAllBuildingsResponse other = (GetAllBuildingsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getAllBuildingsResult==null && other.getGetAllBuildingsResult()==null) || 
             (this.getAllBuildingsResult!=null &&
              java.util.Arrays.equals(this.getAllBuildingsResult, other.getGetAllBuildingsResult())));
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
        if (getGetAllBuildingsResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetAllBuildingsResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetAllBuildingsResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetAllBuildingsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetAllBuildingsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getAllBuildingsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetAllBuildingsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", "Building"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://tempuri.org/", "Building"));
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
