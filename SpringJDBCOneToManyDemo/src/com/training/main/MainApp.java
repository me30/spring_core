package com.training.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.jdbcTemplate.StudentJDBCTemplate;
import com.training.pojo.Student;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
		
		
		studentJDBCTemplate.create("mumbai", "12345", "Latur", "shubham", 25);
		 

	}
}