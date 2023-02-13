package com.javacourse.Others.Interfaces2;

public class Main {

	
	public static void main(String[] args) {
		Mi8 mi8 = new Mi8();
		Boeing737 boeing737 = new Boeing737();
		Test test = new Test();
		
		test.toDoVertical(mi8);
		test.toFly(boeing737);
	}

}
