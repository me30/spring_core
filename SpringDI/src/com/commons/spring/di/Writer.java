package com.commons.spring.di;

public class Writer  {

	private IWriter iWriter;
	
	
	public void setiWriter(IWriter iWriter) {
		this.iWriter=iWriter;
	}




	public void getWriter(String s){
		iWriter.getWriter("The Writer class string msg is :: " + s);
    }
}
