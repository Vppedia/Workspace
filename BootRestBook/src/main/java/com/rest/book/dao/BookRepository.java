package com.rest.book.dao;

import org.springframework.data.repository.CrudRepository;

import com.rest.book.etity.Book;



public interface BookRepository extends CrudRepository<Book, Integer> {


	
}
