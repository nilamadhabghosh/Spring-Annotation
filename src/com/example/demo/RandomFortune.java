package com.example.demo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortune implements FortuneService {

	public String[] mystring = {
		"abcdef","asdfg","qwert"	
	};
	
	private Random myrandom = new Random();
	
	@Override
	public String getFortune() {
		int index = myrandom.nextInt(mystring.length);
		
		String finalstring = mystring[index];
		return finalstring;
	}

}
