package com.lti.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.lti.service.SendMailService;

public class Trial {

	public static void main( String[] args )
    {
    	ApplicationContext context = 
             new ClassPathXmlApplicationContext("mail-servlet.xml");
    	 
    	SendMailService sms = (SendMailService)context.getBean("mail");
    	sms.send();
    }
}
