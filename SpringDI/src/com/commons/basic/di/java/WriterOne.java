package com.commons.basic.di.java;

public class WriterOne implements IWriter {
    @Override
    public void getWriter (String s){
    	 System.out.println("The Writer class string msg is :: " + s);
    }
}
