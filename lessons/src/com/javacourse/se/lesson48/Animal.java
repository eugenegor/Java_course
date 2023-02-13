package com.javacourse.se.lesson48;

public enum Animal {
    DOG("собака"), CAT("кошка"), FROG("л€гушка");

	private String translation;
    
     Animal(String translation){
    	this.translation = translation;
		
	}

	public String getTranslation() {
		return translation;
	}

	@Override
	public String toString() {
		
		return "ѕеревод на русский €зык" + translation;
	}
    
    
}
