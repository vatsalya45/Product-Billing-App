package com.vatsalya.connection_to_db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection  {

	private static Connection con = null;
	private DBConnection() {}
	
	static {
		
		try {
			Class.forName(DBInfo.DB_DRIVER);
			con =  DriverManager.getConnection(DBInfo.DB_URL,DBInfo.DB_USER_NAME,DBInfo.DB_PASSWORD);
			
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public static Connection getCon() {
		
		return con;
	}
	
}
