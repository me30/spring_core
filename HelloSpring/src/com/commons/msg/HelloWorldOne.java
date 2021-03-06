package com.commons.msg;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloWorldOne {
	private String message1;

	public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
		System.out.println("Your Message for FileSystemXmlApplicationContext  : " + message1);
	}
	
}
