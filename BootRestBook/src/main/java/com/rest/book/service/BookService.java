package com.rest.book.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rest.book.dao.BookRepository;
import com.rest.book.etity.Book;


@Component
public class BookService {
	
	
	@Autowired
	private BookRepository bookRepository;

	
	static List<Book> book = new ArrayList<>();
	
//
//	static {
//		book.add(new Book(1, "ABC", "Vivek"));
//		book.add(new Book(2, "BCD", "Pranav"));
//	book.add(new Book(3, "CDE", "Shubham"));
//	book.add(new Book(4, "DEF", "Pankaj"));
//		book.add(new Book(5, "EFG", "Ravi"));
//	  book.add(new Book(6, "FGH", "Naresh"));
//		book.add(new Book(7, "GHI", "Aman"));	
//	
//}

	// get All Boook

	public List<Book> getAllBook() {
		
		return (List<Book>) bookRepository.findAll();
	
		
		 
}

	// get Book By Id

	public Book getBookById(int id) {
		
//		Book book2 = null;
//		try
//	{
//			book2 = book.stream().filter(i -> i.getId() == id).findFirst().get();
//	}
//		catch(Exception e)
//		{
//			e.printStackTrace();
//		}
//		
//		return book2;
//		
		
	 Book book2 = bookRepository.findById(id).get();
	 
	 return book2;
	
	}

	// Add book

	public Book add(Book bk) {
		
//		book.add(bk);
//
//		return bk;
		
		return bookRepository.save(bk);
		
	}

	// delete a Book

	public void deleteBook(int id) {

		//book = book.stream().filter(e -> e.getId() != id).collect(Collectors.toList());
		
		bookRepository.deleteById(id);
		
	

	}
	
	//update the Book
	public void updateBook(Book bk)
	{
//		
//	      book = book.stream().map(  ee->{
//			if(ee.getId()==bk.getId())
//			{
//				ee.setAuthor(bk.getAuthor());
//				ee.setName(bk.getName());
//			}
//	return ee;			
//		}
//	).collect(Collectors.toList());
//		
	   
		bookRepository.save(bk);
	
	
	
	
	}

}
