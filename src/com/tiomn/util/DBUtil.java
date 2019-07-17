package com.tiomn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getConnection(){
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/videocms?useUnicode=true&characterEncoding=utf8","root","1234");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public static void close(Connection con){
		if(con!=null){
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
