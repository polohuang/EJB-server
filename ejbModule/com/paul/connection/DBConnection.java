package com.paul.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection conn = null;
	static final String URL = "jdbc:oracle:thin:@localhost:1521/xe";
	static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	static final String USER = "Paul";
	static final String PASSWORD = "qwer1234";
	
	public static Connection getConnection() {
		try {
			Class.forName(DRIVER).newInstance();
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
}
