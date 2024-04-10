package com.example.demo;


import org.springframework.stereotype.Component;

@Component("art")
public class Book2{
	
	String name;
	int price;
	
	Book2(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void dis() {
		System.out.println("hello java!"+ "\n" + this.name + "\n" + this.price);
	}
	
	
}