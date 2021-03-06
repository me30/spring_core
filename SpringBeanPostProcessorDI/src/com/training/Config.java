package com.training;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.training.entity.Student;
import com.training.service.InitStudentIdGenerator;

@Configuration
public class Config {

	@Bean
	public Student student() {
		return new Student();

	}

	@Bean
	public InitStudentIdGenerator initStudentIdGenerator() {
		return new InitStudentIdGenerator();

	}
	
	

}
