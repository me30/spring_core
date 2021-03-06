package com.commons.entity;

public class TextEditor {
	private SpellChecker spellChecker;
	//private SpellChecker spellChecker1;
	private String name;
	
	
	public TextEditor( String name) {
		super();
		this.name = name;
	}

	public TextEditor(SpellChecker spellChecker, String name) {
		super();
		this.spellChecker = spellChecker;
		this.name = name;
	}
	
	public void setSpellChecker( SpellChecker spellChecker ){
		this.spellChecker = spellChecker;
	}
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	
	public void spellCheck() {
		System.out.println(spellChecker);
		if(null != spellChecker) {
			spellChecker.checkSpelling();
		}
		
	}
	
	/*
	
	public SpellChecker getSpellChecker1() {
		return spellChecker1;
	}
	public void setSpellChecker1(SpellChecker spellChecker1) {
		this.spellChecker1 = spellChecker1;
	}
	
	public void spellCheck() {
		spellChecker1.checkSpelling();
	}*/
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
}