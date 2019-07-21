package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Coach thecoach = context.getBean("tennisCoach",Coach.class);
		
		System.out.println(thecoach.getDailyworkout());
		
		System.out.println(thecoach.getDailyFortune());
		
		context.close();
		

	}

}
