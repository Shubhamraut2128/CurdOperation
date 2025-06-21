package com.springcurdoperation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.springcurdoperation.model.Book;

@Service
public interface BookService {
	
	
	 // Save a new book
	  Book saveBook(Book book);
	
	  // Get all books
	 List<Book> getAllData();
	 
	// Get a specific book by its ID
	  Book getBookById(long id);
	 
	  // Update an existing book by its ID and return the updated book
	 Book updateById(Book book, long id);
	 
	  // Delete all books
	 void deleteData();
	
	
}