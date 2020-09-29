package com.fsk.test.pojo;


public class Book {

	private Long id;

	private String name;

	private String author;

	private String description;

	private int num;

	public Book() {

	}

	public Book(Long id, String name, String author, String description, int num) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.description = description;
		this.num = num;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
