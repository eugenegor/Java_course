package com.javacourse.se.lesson48;

public enum Animal {
    DOG("������"), CAT("�����"), FROG("�������");

	private String translation;
    
     Animal(String translation){
    	this.translation = translation;
		
	}

	public String getTranslation() {
		return translation;
	}

	@Override
	public String toString() {
		
		return "������� �� ������� ����" + translation;
	}
    
    
}
