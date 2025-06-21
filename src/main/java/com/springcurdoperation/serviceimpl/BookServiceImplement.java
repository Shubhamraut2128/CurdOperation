package com.springcurdoperation.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springcurdoperation.model.Book;
import com.springcurdoperation.repository.BookRepository;
import com.springcurdoperation.service.BookService;

@Service
public class BookServiceImplement implements BookService {
    
    @Autowired 
    private BookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllData() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(long id) {
        Optional<Book> book = bookRepository.findById(id);
        if(book.isPresent()) {
            return book.get();
        } else {
            throw new RuntimeException("Book not found with id: " + id);
        }
    }

    @Override
    public Book updateById(Book updatedBook, long id) {
        Optional<Book> existingBookOpt = bookRepository.findById(id);
        
        if(existingBookOpt.isPresent()) {
            Book existingBook = existingBookOpt.get();
            existingBook.setBookName(updatedBook.getBookName());
            existingBook.setBookAuther(updatedBook.getBookAuther());
            existingBook.setBookPrice(updatedBook.getBookPrice());
            existingBook.setBookNo(updatedBook.getBookNo());
            return bookRepository.save(existingBook); // Save updated book
        } else {
            throw new RuntimeException("Book not found with id: " + id);
        }
    }

    @Override
    public void deleteData() {
        bookRepository.deleteAll();
    }
}
