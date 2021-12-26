package com.rest.book.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.book.etity.Book;
import com.rest.book.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	// get All Books
	@GetMapping("/book")
	public ResponseEntity<List<Book>> getBooks()
	{
		List list= this.bookService.getAllBook();
		
		if(list.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		else
			return ResponseEntity.of(Optional.of(list));
		
	}
	
	//Get Single Book
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> getBookById(@PathVariable("id") Integer id)
	{
		Book book= this.bookService.getBookById(id);
		
		if(book==null)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		else
			return ResponseEntity.of(Optional.of(book));
	}
	
	//Add Book
	@PostMapping("/books")
	public Book add(@RequestBody Book book)
	{
		
		return this.bookService.add(book);
		
	}
	
	//Delete Book
	@DeleteMapping("/books/{id}")
	public void deleteBook(@PathVariable("id") int id)
	{
		this.bookService.deleteBook(id);
	}
	
	//Update the book
	
	@PutMapping("/books")
	public Book updateBook(@RequestBody Book bk)
	{
		
	 this.bookService.updateBook(bk);
	 
	 return bk;
		
	}

}
