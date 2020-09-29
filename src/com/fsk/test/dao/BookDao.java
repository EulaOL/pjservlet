package com.fsk.test.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.fsk.test.pojo.Book;
import com.fsk.test.util.DatabaseUtil;

public class BookDao {

	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	//查找所有信息
	public List<Book> booklist(){
		conn = DatabaseUtil.getConn();
		String sql = "select * from book";
		try {
			pst=conn.prepareStatement(sql);
			List<Book> books=new ArrayList<Book>();
			rs = pst.executeQuery();
			while(rs.next()) {
				Book book = new Book();
				book.setId(rs.getLong("id"));
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setDescription(rs.getString("description"));
				book.setNum(rs.getInt("num"));
				books.add(book);//将数据放入books表单
			}
			return books;
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DatabaseUtil.closeAllConn(rs, pst, conn);
		}
		return null;
	}
	
	//根据id查找信息
	public Book selectByid(Long id) {
		conn = DatabaseUtil.getConn();
		String sql="select * from book where id=?";
		try {
			pst=conn.prepareStatement(sql);
			pst.setLong(1, id);
			Book book = new Book();
			
			//执行查询获取结果集
			rs=pst.executeQuery();
			while(rs.next()) {
				book.setId(rs.getLong("id"));
				book.setName(rs.getString("name"));
				book.setAuthor(rs.getString("author"));
				book.setDescription(rs.getString("description"));
				book.setNum(rs.getInt("num"));
			}
			return book;
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DatabaseUtil.closeAllConn(rs, pst, conn);
		}
		return null;
	}
	
	//添加信息
	public boolean add(Book book) {
		conn = DatabaseUtil.getConn();
		String sql="insert into book(name,author,description,num) values (?,?,?,?)";
		try {
			pst=conn.prepareStatement(sql);
			pst.setString(1, book.getName());
			pst.setString(2, book.getAuthor());
			pst.setString(3, book.getDescription());
			pst.setInt(4, book.getNum());
			
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
	
	//修改信息
	public boolean update(Book book) {
		conn = DatabaseUtil.getConn();
		String sql="update book set name=?,author=?,description=?,num=? where id=?";
		try {
			pst=conn.prepareStatement(sql);
			pst.setString(1, book.getName());
			pst.setString(2, book.getAuthor());
			pst.setString(3, book.getDescription());
			pst.setInt(4, book.getNum());
			pst.setLong(5, book.getId());
			System.out.println(book.getId());
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

	//删除信息
	public boolean deleteById(Long id) {
		conn = DatabaseUtil.getConn();
		String sql="delete from book where id=?";
		try {
			pst=conn.prepareStatement(sql);
			pst.setLong(1, id);
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
