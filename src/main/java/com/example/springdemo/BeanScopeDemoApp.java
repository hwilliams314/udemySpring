package com.example.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScopeApplicationContext.xml");

		// retrieve bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class); 

        Coach assistantCoach = context.getBean("myCoach", Coach.class); 
        
        boolean result = (theCoach == assistantCoach);
        
        System.out.println("\nresult: " + result);
        
        System.out.println("memory loc for theCoach:       " + theCoach);
        System.out.println("memory loc for assistantCoach: " + assistantCoach + "\n");

        context.close();
	}

}
