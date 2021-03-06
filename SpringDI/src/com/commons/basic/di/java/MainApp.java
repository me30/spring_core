package com.commons.basic.di.java;

public class MainApp {
	public static void main(String arg[]) {
		IWriter iWriter = new NiceWriter();
		iWriter.getWriter("NiceWriter");
		
		IWriter iWriter1 = new WriterOne();
		iWriter1.getWriter("Writer");
		
		Writer writer = new Writer();
		writer.setiWriter(new NiceWriter(), "testing");
	}
}
