package com.javacourse.se.lesson20;

public class Lesson20 {

	public static void main(String[] args) {
		Human human1 = new Human("Bob");
        
	}

}

class Human{
	
	
  private String name;
  private int age;
  
  public Human(){
		System.out.println("������ �� ������� ������������");
		this.name = "��� �� ���������";
		this.age = 0;
	}
  
  public Human(String name){
	  System.out.println("������ �� ������� ������������");
	  this.name = name;
	}

  public Human(String name, int age){
	  System.out.println("������ �� �������� ������������");
	  this.name = name;
	  this.age = age;
	}

public void setName(String name) {this.name = name;}


public void setAge(int age) {this.age = age;}
  
 }