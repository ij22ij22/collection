package com.tagit.demo.list.conn;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallStatementDemo {
	public static void main(String[] args) throws SQLException  {
		
		Connection con=ConnectionDAO.getConnection();
		CallableStatement stmt = null;
		try {
			stmt = con.prepareCall("{?=calll insertEmployee(?,?,?");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		stmt.setInt(2, 201);
		
		stmt.setString(2, "annu");
		stmt.setDouble(2, 230000);
		stmt.execute();
		
		
	}

}
