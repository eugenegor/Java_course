package com.javacourse.se.lesson48;

public class Test {

	
	public static void main(String[] args) {
		Animal animal = Animal.CAT;
		System.out.println(animal);
		
		Season season = Season.WINTER;
		System.out.println(season.getTemperature());
		
		/*
		switch(animal){
			case CAT:
				System.out.println("Its a cat");
			    break;
			case DOG:
				System.out.println("Its a dog");
			    break;
		}
		
		Season season = Season.SUMMER;
		
		// Object -> Enum -> Season
		
		switch(season){
		case SUMMER:
			System.out.println("ts warm outside");
			break;
		case WINTER:
			System.out.println("ts cold outside");
			break;
		}
		*/

	}

}
