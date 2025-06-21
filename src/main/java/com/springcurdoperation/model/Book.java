package com.springcurdoperation.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book-table11")
public class Book {
	
	@Id 
	@GeneratedValue(strategy =GenerationType.AUTO)
	private long id ;
	
	@Column(name="book_name")
	private String bookName;
	@Column(name="book_author")
	private String bookAuther;
	@Column(name="book_price")
	private int bookPrice;
	@Column(name="book_no")
	private String bookNo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuther() {
		return bookAuther;
	}
	public void setBookAuther(String bookAuther) {
		this.bookAuther = bookAuther;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookNo() {
		return bookNo;
	}
	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}
	public Book(long id, String bookName, String bookAuther, int bookPrice, String bookNo) {
		super();
		this.id = id;
		this.bookName = bookName;
		this.bookAuther = bookAuther;
		this.bookPrice = bookPrice;
		this.bookNo = bookNo;
	}
	
	public Book() {
		
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bookName=" + bookName + ", bookAuther=" + bookAuther + ", bookPrice=" + bookPrice
				+ ", bookNo=" + bookNo + "]";
	}
	
	

}
