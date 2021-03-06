package com.training;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.entity.Student;
import com.training.service.InitStudentIdGenerator;

public class MainApp {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

		Student stud =  context.getBean(Student.class);
		stud.setName("shubham");
		stud.setEmail("shubham@gmail.com");

		InitStudentIdGenerator i = context.getBean(InitStudentIdGenerator.class);
		i.postProcessBeforeInitialization(stud, "Student");
		
		System.out.println(stud.getId() + " " + stud.getName() + " " + stud.getEmail());

		context.registerShutdownHook();
		
		
		
		
	}
}
