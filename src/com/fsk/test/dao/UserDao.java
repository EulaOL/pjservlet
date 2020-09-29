package com.fsk.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fsk.test.pojo.User;
import com.fsk.test.util.DatabaseUtil;

public class UserDao {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	public User Login(User user) {
		conn = DatabaseUtil.getConn();
		String sql = "select * from tbadmin where aname=? and apassword=?";
		try {
			pst=conn.prepareStatement(sql);
			//设置值
			pst.setString(1, user.getAname());
			pst.setInt(2, user.getApassword());
			//执行sql语句
			rs=pst.executeQuery();
			
			User users=null;
			if(rs.next()) {
				users = new User();
				//从数据库中获取值设置到实体类的setter方法中
				users.setAid(rs.getLong("aid"));
				users.setAname(rs.getString("aname"));
				users.setApassword(rs.getInt("apassword"));
				return users;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DatabaseUtil.closeAllConn(rs, pst, conn);
		}
		return null;
	}
	
	public boolean Register(User user) {
		conn = DatabaseUtil.getConn();
		String sql="insert into tbadmin(aname,apassword) values(?,?)";
		try {
			pst=conn.prepareStatement(sql);
			pst.setString(1,user.getAname());
			pst.setInt(2, user.getApassword());
			
			//执行更新操作
			int a=pst.executeUpdate();
			if(a!=0) {
				return true;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DatabaseUtil.closeAllConn(rs, pst, conn);
		}
		return false;
	}
}
