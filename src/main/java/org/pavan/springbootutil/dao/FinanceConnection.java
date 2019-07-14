package org.pavan.springbootutil.dao;



public class FinanceConnection {
	static FinanceConnection connection=new FinanceConnection();

	public static Object getConnection(String databaseName) {
		Object databaseObj = null;
		if (databaseName.equals("oracle")) {
			databaseObj=connection.getOracleConnection();
		} else if (databaseName.equals("mongo")) {
			databaseObj=connection.getMongoConnection();

		} else if (databaseName.equals("xls")) {
			databaseObj=connection.getXLSConnection();
		}else
		if (databaseName.equals("postgre")) {
			//databaseObj=connection.getOracleWithoutHibernateConnection();
		}
		if (databaseName.equals("oraclewithouthibernate")) {
			//databaseObj=connection.getOracleWithoutHibernateConnection();
		}
		
		return databaseObj;
	}

	private Object getXLSConnection() {
		return null;
	}

	private Object getMongoConnection() {
		return null;
	}

	private Object getOracleConnection() {
		
		return null;
	}

}
