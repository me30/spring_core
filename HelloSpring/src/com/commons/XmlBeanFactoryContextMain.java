package com.commons;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.commons.msg.HelloWorld;

public class XmlBeanFactoryContextMain {
	public static void main(String[] args) {
		XmlBeanFactory factory = new XmlBeanFactory (new ClassPathResource("Beans.xml")); 
		HelloWorld obj = (HelloWorld) factory.getBean("helloWorld");    
		System.out.println(obj.getMessage() + " XmlBeanFactory");
	}
}
