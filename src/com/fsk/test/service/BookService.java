package com.fsk.test.service;

import java.util.List;

import com.fsk.test.dao.BookDao;
import com.fsk.test.pojo.Book;

public class BookService {

	private BookDao bookDao = new BookDao();
	public List<Book> booklist(){
		return bookDao.booklist();
	}
	
	public Book selectByid(Long id) {
		return bookDao.selectByid(id);
	}
	
	public boolean add(Book book) {
		return bookDao.add(book);
	}
	
	public boolean update(Book book) {
		return bookDao.update(book);
	}
	
	public boolean deleteById(Long id) {
		return bookDao.deleteById(id);
	}
}
