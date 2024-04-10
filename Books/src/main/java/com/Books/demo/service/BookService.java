package com.Books.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Books.demo.dao.Interface.BookRepository;
import com.Books.demo.model.Books;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository; 
	
	public Books getBookByName(String name) {
		return bookRepository.show(name);
	}

}
