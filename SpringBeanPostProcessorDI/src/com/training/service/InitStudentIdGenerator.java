package com.training.service;

import java.util.Random;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.training.entity.Student;

public class InitStudentIdGenerator implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName)  throws BeansException {

		return bean;  // you can return any other object as well
	}
	

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		return bean;
	}




}