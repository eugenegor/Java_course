package com.javacourse.se.lesson35;

interface AbleToEat{
	public void eat();
		
	
}





public class Test {

	
	public static void main(String[] args) {
		AbleToEat ableToEat = new AbleToEat(){

			@Override
			public void eat() {
				System.out.println("Someone is eating ");
				
			}
			
		};
		
		AbleToEat ableToEat2 = new AbleToEat(){

			@Override
			public void eat() {
				System.out.println("AbleToEat is eating ");
				
			}
			
		};
		
		ableToEat.eat();
		ableToEat2.eat();

	}

}
