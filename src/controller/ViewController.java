package controller;
import java.rmi.RemoteException;
import org.tempuri.WebServiceSoapProxy;

public class ViewController {

	public static WebServiceSoapProxy proxyInstance = new WebServiceSoapProxy();

	public static Object[] GetInfoFromDatabaseTable(String tableName) throws RemoteException {
		return proxyInstance.getList(tableName, true);
	}
	
	public static Object[] GetInfoFromERPQuery(String erpQueryString) throws RemoteException {
		return proxyInstance.getERPMethodBasedOnDescriptionString(erpQueryString);
	}


	public static String GetFileContent(String filePath) throws RemoteException {
		return proxyInstance.getFileContent(filePath);
	}

	public static String[] GetTableNamesForWS() throws RemoteException {
		return proxyInstance.getTableNames();
	}


	public static String[] GetErpQueries() throws RemoteException {
		return proxyInstance.getErpQueries();
	}
	
}
