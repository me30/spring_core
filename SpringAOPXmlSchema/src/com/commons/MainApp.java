package com.commons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	 public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	      
	      Student student = (Student) context.getBean("student");
	      student.getName();
	      student.getAge();
	      try {
	    	  student.printThrowException();
	      }catch (Exception e) {
			// TODO: handle exception
		}
	     
	   }
}
