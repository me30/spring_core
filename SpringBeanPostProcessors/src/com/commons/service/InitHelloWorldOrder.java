package com.commons.service;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.beans.BeansException;

public class InitHelloWorldOrder implements BeanPostProcessor, Ordered {



	public Object postProcessBeforeInitialization(Object bean, String beanName) 
			throws BeansException {

		System.out.println("BeforeInitialization order 1 : " + beanName);
		return bean;  // you can return any other object as well
	}
	public Object postProcessAfterInitialization(Object bean, String beanName) 
			throws BeansException {

		System.out.println("AfterInitialization order 1: " + beanName);
		return bean;  // you can return any other object as well
	}
	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 1;
	}
}