package com.fsk.test.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseUtil {

	//连接数据库
	public static Connection getConn() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/mydb1?useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai";
		/*
		 * autoReconnect='true'" +
		 * " useSSL='false' + 'useUnicode=true'& 'characterEncoding=UTF-8'";
		 */
		try {
			conn = DriverManager.getConnection(url,"root","123456");
			if(conn == null) {
				System.out.println("fault");
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return conn;	
	}
	
	/*
	//关闭数据库
	public static void closeConn(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	*/
	//关闭所有连接
	public static void closeAllConn(ResultSet rs,PreparedStatement pst,Connection conn) {
		if(rs != null) {
			try {
				rs.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		if(pst != null) {
			try {
				pst.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn != null) {
			try {
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
