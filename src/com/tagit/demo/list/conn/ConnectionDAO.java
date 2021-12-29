package com.tagit.demo.list.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDAO {
	private static Connection con;
	private ConnectionDAO() {
	}
	public static Connection getConnection() {
	if(con == null) {
	System.out.println("Connection Created");
	try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
	try {
	con =
	DriverManager.getConnection
	("jdbc:oracle:thin:@localhost:1521:orcl","system","admin");
	} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}catch(ClassNotFoundException e) {
	e.printStackTrace();
	}
	}
	return con;
	} }


