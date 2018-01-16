package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		//load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//create two beans from a prototype scope and compare them
		//retreive bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		//print out the results
		System.out.println("\nResults for prototype scope:");
		
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		
		//create two beans from a singeton scope and compare them
		//retreive bean from spring container
		Coach theSingleCoach = context.getBean("singleCoach", Coach.class);
		
		Coach alphaSingleCoach = context.getBean("singleCoach", Coach.class);
		
		//check if they are the same
		result = (theSingleCoach == alphaSingleCoach);
		
		//print out the results
		System.out.println("\nResults for singleton scope:");
		
		System.out.println("\nPointing to the same object: " + result);
		
		System.out.println("\nMemory location for theCoach: " + theSingleCoach);
		
		System.out.println("\nMemory location for alphaCoach: " + alphaSingleCoach + "\n");
		
		//close the context
		context.close();
	}

}
