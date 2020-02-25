package com.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

private static final String url = "jdbc:mysql://localhost:3306/crud";
	
	private static final String driver = "com.mysql.jdbc.Driver";
	
	private static final String username = "root";
	
	private static final String password = "";
	
	private static Connection connection = null; 
	
	public static Connection openConnection() {
		
		if(connection != null){
			return connection;
		}
		else{
			
			try {
				
				Class.forName(driver);
				 
				connection = DriverManager.getConnection(url, username, password);
				
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			return connection;
		}
	}
}
