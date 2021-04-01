package com.app.fizzbuzz.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {
public int i=1;
	
	public String calculate(int input) {
		
			

      if( input %15 == 0) {	
    	ArrayList<Integer> valuelist = new ArrayList<>();
    	  for(int i = 1; i <= input; i++) {
			valuelist.add(i);  
    	  }
		  return "FizzBuzz \n"+valuelist;	
      
      }
      if(input %5 == 0) {
    	  ArrayList<Integer> valuelist = new ArrayList<>();
    	  for(int i = 1; i <= input; i++) {
			valuelist.add(i);  
    	  }
			return"Buzz \n\n"+valuelist;
		}
		if(input %3 == 0) {
			ArrayList<Integer> valuelist = new ArrayList<>();
	    	  for(int i = 1; i <= input; i++) {
				valuelist.add(i);  
	    	  }
			return"Fizz \n"+ valuelist;
		}	else 
			
		
		return String.valueOf( input+1);
		
		}
}
