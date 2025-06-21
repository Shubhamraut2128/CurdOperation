package com.springcurdoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springcurdoperation.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
