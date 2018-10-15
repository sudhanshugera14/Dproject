package com.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataConnection {
	public static Connection makeConnection() {
		Connection con = null;

		try {

			// java.sql.Connection con;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/emp",
					"root", "password");
		} catch (Exception e) {
			System.out.println(e);
		}

		return con;

	}
}
