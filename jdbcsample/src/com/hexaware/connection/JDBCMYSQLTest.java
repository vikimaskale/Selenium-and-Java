package com.hexaware.connection;

import com.hexaware.connection.*;
import java.sql.*;
 
/**
 * This class is used to create a JDBC 
 * connection with MySql DB.
 * @author w3schools
 */
public class JDBCMYSQLTest {
	//JDBC and database properties.
	private static final String dbURL = "jdbc:mysql://localhost:3306/sampledb";
	private static final String username = "root";
	private static final String password = "root";
 
	public static Connection getConnection(){
		Connection conn=null;
		try {
		    conn = DriverManager.getConnection(dbURL, username, password);
		    if (conn != null) {
		        System.out.println("Connected");
		    }else {
		    	System.out.println("connection failed");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
		return conn;
	}	
	
}



