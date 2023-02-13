package com.javacourse.se.lesson48;

public enum Season {
	SUMMER(35), WINTER(-30), AUTUMN(10), SPRING(20);

	private int temperature;
	
	Season( int temperature) {
		this.temperature = temperature;
		// TODO Auto-generated constructor stub
	}

	public int getTemperature() {
		return temperature;
	}
	
	

}
