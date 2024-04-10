package com.Books.demo.dao.Interface;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Books.demo.model.Books;

@Repository
public interface BookRepository 
		extends JpaRepository <Books, String>{
	
	@Query(value = "select name from main where name = :name", nativeQuery=true)
	Books show(@Param ("name") String name);

}
