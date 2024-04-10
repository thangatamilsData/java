package com.Books.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "main")
public class Books {

	  @Id
	    @SequenceGenerator(
	            name = "Main",
	            sequenceName = "Main",
	            allocationSize = 1
	    )
	    @GeneratedValue(
	            strategy = GenerationType.SEQUENCE,
	            generator = "Main"
	    )
	
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
