package com.javacourse.se.lesson19;

public class lesson19 {
	public static void main(String[] args){
	
	Human human1 = new Human();
	human1.setAge(18);
	human1.setName("Tom");
	human1.getInfo();
	
	}
	
}
	


class Human{
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	public void setName(String theName) {
		name = theName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int myAge) {
		age = myAge;
	}
	
	public void getInfo(){
		System.out.println(name+","+age);
		
	}
	
}

