package com.service;

import java.sql.Connection;
import java.sql.DriverManager;

public class photoService {
	public static Connection getCon() {
		Connection con = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost/photos", "root", "root");
		} catch (Exception e) {
			System.out.println(e);
		}
		return con;
	}

}
