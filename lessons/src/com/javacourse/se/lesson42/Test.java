package com.javacourse.se.lesson42;

public class Test {
	//  animal1   ->      {1}
    //  animal1   ->      {1}


	
	public static void main(String[] args) {
		Animal animal1 = new Animal(1);
		Animal animal2 = new Animal(1);
		
		//System.out.println(animal1.equals(animal2));

        String string1 = new String( "Hello");
        String string2 = new String( "Hello");
        
        System.out.println(string1.equals(string2));
	}
	
	

}


class Animal{
	private int id;
	
	public Animal(int id){
		this.id = id;
	}
	
	public boolean equals(Object obj){
		Animal otherAnimal = (Animal) obj;
		
		return this.id == otherAnimal.id;
	}
}
