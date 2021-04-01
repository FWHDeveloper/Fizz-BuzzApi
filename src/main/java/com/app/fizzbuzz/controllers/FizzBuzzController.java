package com.app.fizzbuzz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.fizzbuzz.services.FizzBuzzService;

@RestController
@RequestMapping("/fizz-buzz/api/")
public class FizzBuzzController {
	private FizzBuzzService service;
	
	@Autowired
	 public FizzBuzzController(FizzBuzzService service) {
		this.service= service;
	}
	 @GetMapping ("number/{input}")
	 public String getNumber(@PathVariable int input) {
		 return service.calculate(input);
	 }
	
}
