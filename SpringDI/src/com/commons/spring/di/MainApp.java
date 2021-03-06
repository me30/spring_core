package com.commons.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	 public static void main(String[] args) {
	      ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
	      
	      Writer writer = context.getBean("writer", Writer.class);
	      writer.getWriter("testing for writer");
	      
	   }
}
