import java.lang.reflect.Proxy;
import java.rmi.RemoteException;

import javax.swing.JFileChooser;
import javax.swing.plaf.FileChooserUI;

import org.tempuri.Booking;
import org.tempuri.GetAllBookingsResponse;
import org.tempuri.Room;
import org.tempuri.WebServiceSoapProxy;

public class WebServiceController {

	public static WebServiceSoapProxy proxyInstance = new WebServiceSoapProxy();
	
	public enum WS_TABLE {
		BOOKING, BUILDING, INSTITUTION, PERSON, RESOURCE, ROOM
	}
	public enum ERP_QUERY {
		EMPLOYEES, EMPLOYEE_ABSENCE, RELATIVES, MOST_SICK_EMPLOYEE, ALL_KEYS, ALL_INDEXES, ALL_TBL_CONSTRAINTS, ALL_TABLES_V1, ALL_TABLES_V2,
		META_EMPLOYEES_V1, META_EMPLOYESS_V2
	}
	
	public static WS_TABLE ConvertWSTableNameToEnum(String tableName) throws Exception {
		switch (tableName) {
		case "Building":
			return WS_TABLE.BUILDING;
		case "Booking":
			return WS_TABLE.BOOKING;
		case "Person":
			return WS_TABLE.PERSON;
		case "Institution":
			return WS_TABLE.INSTITUTION;
		case "Resource":
			return WS_TABLE.RESOURCE;
		case "Room":
			return WS_TABLE.ROOM;
		default:
			return null;
		}
	}

	
	public static Object[] GetInfoFromDatabaseTable(String tableName) throws Exception {

		WS_TABLE table = WebServiceController.ConvertWSTableNameToEnum(tableName);

		if (table != null) {
			switch (table) {
			case BOOKING:
				return proxyInstance.getList("Booking", true);
			case BUILDING:
				return proxyInstance.getList("Building", true);
			case INSTITUTION:
				return proxyInstance.getList("Institution", true);
			case PERSON:
				return proxyInstance.getList("Person", true);
			case RESOURCE:
				return proxyInstance.getList("Resource", true);
			case ROOM:
				return proxyInstance.getList("Room", true);
			default:
				return null;
			}
		} 
		return null;
	}
	
	public static Object[] GetInfoFromERPQuery(String erpQueryString) throws RemoteException {
		
		ERP_QUERY erpQuery = WebServiceController.ConvertErpQueryToEnum(erpQueryString);

		if (erpQuery != null) {
			switch (erpQuery) {
			case ALL_INDEXES:
				return proxyInstance.getIndexes();
			case ALL_KEYS:
				return proxyInstance.getKeys();
			case ALL_TABLES_V1:
				return proxyInstance.getTables();
			case ALL_TABLES_V2:
				return proxyInstance.getTables2();
			case ALL_TBL_CONSTRAINTS:
				return proxyInstance.getConstraints();
			case EMPLOYEES:
				return proxyInstance.getEmployees();
			case EMPLOYEE_ABSENCE:
				return proxyInstance.getEmployeeAbsence();
			case META_EMPLOYEES_V1:
				return proxyInstance.getMetaEmployees();
			case META_EMPLOYESS_V2:
				return proxyInstance.getMetaEmployees2();
			case MOST_SICK_EMPLOYEE:
				return proxyInstance.getSickestEmployee();
			case RELATIVES:
				return proxyInstance.getRelatives();

			default:
				return null;
			}
		}
		return null;
	}
	
	private static ERP_QUERY ConvertErpQueryToEnum(String erpQueryString) {
		
		switch (erpQueryString) {
		case "Personal":
			return ERP_QUERY.EMPLOYEES;
		case "Personalanhörig":
			return ERP_QUERY.RELATIVES;
		case "Personalfrånvaro 2004":
			return ERP_QUERY.EMPLOYEE_ABSENCE;
		case "Personal med flest antal sjukdagar":
			return ERP_QUERY.MOST_SICK_EMPLOYEE;
		case "METADATA - Nycklar":
			return ERP_QUERY.ALL_KEYS;
		case "METADATA - Indexes":
			return ERP_QUERY.ALL_INDEXES;
		case "METADATA - Constraints ":
			return ERP_QUERY.ALL_TBL_CONSTRAINTS;
		case "METADATA - Tabeller":
			return ERP_QUERY.ALL_TABLES_V1;
		case "METADATA - Tabeller2":
			return ERP_QUERY.ALL_TABLES_V2;
		case "METADATA - Kolumner":
			return ERP_QUERY.META_EMPLOYEES_V1;
		case "METADATA - Kolumner2":
			return ERP_QUERY.META_EMPLOYESS_V2;
		default:
			return null;
		}
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
