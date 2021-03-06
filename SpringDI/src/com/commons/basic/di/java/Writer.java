package com.commons.basic.di.java;

public class Writer {

	private IWriter iWriter;

	public IWriter getiWriter() {
		return iWriter;
	}

	public void setiWriter(IWriter iWriter,String s) {
		iWriter.getWriter("The Writer class string msg is :: " + s);
	}
}
