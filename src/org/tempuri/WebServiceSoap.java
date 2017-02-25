/**
 * WebServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.tempuri;

public interface WebServiceSoap extends java.rmi.Remote {
    public java.lang.String[][] getEmployees() throws java.rmi.RemoteException;
    public java.lang.String[][] getRelatives() throws java.rmi.RemoteException;
    public java.lang.String[][] getEmployeeAbsence() throws java.rmi.RemoteException;
    public java.lang.String[][] getSickestEmployee() throws java.rmi.RemoteException;
    public java.lang.String[][] getKeys() throws java.rmi.RemoteException;
    public java.lang.String[][] getIndexes() throws java.rmi.RemoteException;
    public java.lang.String[][] getConstraints() throws java.rmi.RemoteException;
    public java.lang.String[][] getTables() throws java.rmi.RemoteException;
    public java.lang.String[][] getTables2() throws java.rmi.RemoteException;
    public java.lang.String[][] getMetaEmployees() throws java.rmi.RemoteException;
    public java.lang.String[][] getMetaEmployees2() throws java.rmi.RemoteException;
    public java.lang.Object[] get(java.lang.String tablename) throws java.rmi.RemoteException;
    public java.lang.Object[][] getList(java.lang.String tablename, boolean withColumnHeaders) throws java.rmi.RemoteException;
    public java.lang.Object[] getColumnNames(java.lang.String tablename) throws java.rmi.RemoteException;
    public java.lang.String getFileContent(java.lang.String filepath) throws java.rmi.RemoteException;
    public java.lang.String[] getTableNames() throws java.rmi.RemoteException;
    public java.lang.String[] getErpQueries() throws java.rmi.RemoteException;
}
