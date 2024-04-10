package com.Books.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Books.demo.model.Books;
import com.Books.demo.service.BookService;

@RestController
@RequestMapping(path = "name")
@CrossOrigin(origins = "*")
public class BookController {

	
	public final BookService bookService = new BookService();
	
	 @GetMapping("/{name}")
	 @Autowired
	 public Books getStudentByName(@PathVariable String name){
	        return bookService.getBookByName(name);
	    }
	
	
}
