package com.springcurdoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcurdoperation.model.Book;
import com.springcurdoperation.serviceimpl.BookServiceImplement;

@RestController
@RequestMapping("/api")
public class BookController {
	
	
	@Autowired
     BookServiceImplement bookServiceImplement;
	 
	//create to post data 
	@PostMapping("/postdata")
	public ResponseEntity<Book> saveData1(@RequestBody Book book){
	 return new ResponseEntity<Book>(book,HttpStatus.CREATED);
	
	}
	@PostMapping("/add")
	public ResponseEntity<String> saveData(@RequestBody Book book){
		bookServiceImplement.saveBook(book);
		System.out.println(book);
		String Message ="create databases successfully"+book.toString();
    	return new ResponseEntity<String>(Message,HttpStatus.CREATED);
	}
	@GetMapping("/getdata")
	public ResponseEntity<List<Book>> getaAllData(){
		  List <Book> b = bookServiceImplement.getAllData();
		return new ResponseEntity<List<Book>>(b,HttpStatus.FOUND);
	}
	
	@GetMapping("/getdata/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable Long id){
		return new ResponseEntity<Book>(bookServiceImplement.getBookById(id),HttpStatus.OK);
	}
	
	@PutMapping("/getdata/{id}")
	public ResponseEntity<Book> updateById(@PathVariable long id,Book book){
		return new ResponseEntity<Book>(bookServiceImplement.updateById(book, id),HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String>deleteAllData(@PathVariable("id") long id){
		bookServiceImplement.deleteData();
		return new ResponseEntity<String>("delete data is successfully",HttpStatus.OK);
		
	}
  
}
