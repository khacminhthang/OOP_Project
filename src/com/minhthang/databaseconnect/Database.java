package com.minhthang.databaseconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
	static String username = "dba";
	static String password = "dba";
	private static Connection conn;

	public static Connection getConnection() throws SQLException {
		if (conn == null) {
			conn = DriverManager.getConnection("jdbc:virtuoso://localhost:1111/", username, password);
			return conn;
		}
		return conn;

	}

	public void closeConnection() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
