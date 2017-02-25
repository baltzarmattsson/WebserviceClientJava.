/**
 * GetTables2Response.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public class GetTables2Response  implements java.io.Serializable {
    private java.lang.String[][] getTables2Result;

    public GetTables2Response() {
    }

    public GetTables2Response(
           java.lang.String[][] getTables2Result) {
           this.getTables2Result = getTables2Result;
    }


    /**
     * Gets the getTables2Result value for this GetTables2Response.
     * 
     * @return getTables2Result
     */
    public java.lang.String[][] getGetTables2Result() {
        return getTables2Result;
    }


    /**
     * Sets the getTables2Result value for this GetTables2Response.
     * 
     * @param getTables2Result
     */
    public void setGetTables2Result(java.lang.String[][] getTables2Result) {
        this.getTables2Result = getTables2Result;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTables2Response)) return false;
        GetTables2Response other = (GetTables2Response) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getTables2Result==null && other.getGetTables2Result()==null) || 
             (this.getTables2Result!=null &&
              java.util.Arrays.equals(this.getTables2Result, other.getGetTables2Result())));
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
        if (getGetTables2Result() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetTables2Result());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetTables2Result(), i);
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
        new org.apache.axis.description.TypeDesc(GetTables2Response.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://tempuri.org/", ">GetTables2Response"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getTables2Result");
        elemField.setXmlName(new javax.xml.namespace.QName("http://tempuri.org/", "GetTables2Result"));
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
