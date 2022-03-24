package com.cybage.JDBCUtility;

import java.sql.Connection;
import java.sql.DriverManager;

public class jdbcUtility {
	private static Connection connection=null;
	
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//2.establish connection
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","Password@14");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return connection;
	}

}
