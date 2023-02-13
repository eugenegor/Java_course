package com.javacourse.se.lesson9;

public class Break_Continue {
	
	public static void bk(){ 
	for(int i = 0; i <= 15; i++){
		if(i%2 == 0){
			continue;
		}
		System.out.println("это нечетное число" + i);
	}
	}
    
}