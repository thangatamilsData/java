package com.webFirst.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class siteController {
	
	@GetMapping("name")
	@ResponseBody
	public String show() {
		return "Hello React :) "+21 + "it's spring Backend (:";
	}
}
