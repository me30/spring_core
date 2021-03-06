package com.commons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.commons.msg.HelloWorldOne;

public class ApplicationContext_FileSystemXmlApplicationContext_Main {
	public static void main(String[] args) {
		ApplicationContext context = new FileSystemXmlApplicationContext("file:/home/meena/eclipse-workspace/spring_core/HelloSpring/FileSystem/Beans.xml");
		HelloWorldOne obj = (HelloWorldOne) context.getBean("helloWorld_1");
		obj.getMessage1();
	}
}
