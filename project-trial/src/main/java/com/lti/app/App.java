package com.lti.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.entity.InstituteRegistration;

public class App {
	
	public static void main(String[] args) {
		 ApplicationContext context = new ClassPathXmlApplicationContext("mvc-servlet.xml");
		 
		 InstituteRegistration carpartInventory = (InstituteRegistration)context.getBean("inst1");
		 
		 
		 
	}
}
