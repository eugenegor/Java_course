package com.javacourse.Others.Interfaces2;

public class Mi8 extends Helicopter implements VerticalTakeoff{

	@Override
	public void fly() {
		System.out.println("Helicopter");
		
	}

	@Override
	public void verticalTakeoff() {
		System.out.println("Helicopter Mi8 vertical");
		
	}
	
	

}
