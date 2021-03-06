package com.commons.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;

public class InitHelloWorld implements BeanPostProcessor, Ordered{
	public Object postProcessBeforeInitialization(Object bean, String beanName) 
			throws BeansException {

		System.out.println("BeforeInitialization order 2 : " + beanName);
		return bean;  // you can return any other object as well
	}
	public Object postProcessAfterInitialization(Object bean, String beanName) 
			throws BeansException {

		System.out.println("AfterInitialization order 2 : " + beanName);
		return bean;  // you can return any other object as well
	}
	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 2;
	}
}