package com.javacourse.se.lesson12;

public class Arrays_of_Strings {
	
	public void arrayoffstr(){
		
		String[] strings = new String[3];
		strings[0] = "привет";
		strings[1] = "пока";
		strings[2] = "джава";
		System.out.println(strings[0]);
		System.out.println(strings[2]);
		
		
		//FOR(EACH):
		for(String string:strings){
			System.out.println(string);
		}
		int[] numbers1 = {1,2,3};
		int sum = 0;
		for(int x: numbers1){
			sum = sum+x;
		}
		System.out.println();
		System.out.println(sum);
	}

}
