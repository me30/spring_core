package com.commons.spring.di;

public class NiceWriter implements IWriter {
	
    @Override
    public void getWriter (String s){
        System.out.println("The NiceWriter class string msg is :: " + s);
    }
}