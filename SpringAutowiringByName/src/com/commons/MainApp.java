package com.commons;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.commons.entity.TextEditor;

public class MainApp {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("BeansConsturction.xml");
		TextEditor te = (TextEditor) context.getBean("textEditor");
		System.out.println(te.getName());
		te.spellCheck();
	}
}