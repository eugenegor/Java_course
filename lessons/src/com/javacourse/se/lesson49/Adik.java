package com.javacourse.se.lesson49;

public class Adik {

	
	public static void main(String[] args) {
		matryoshka(7);

	}
	
	
	public static void matryoshka(int n){
		if (n ==1)
			System.out.println("Last matryoshka" + n);
		else{
			System.out.println("Top side of matryoshka" + n);
			matryoshka( n - 1);
			System.out.println("Bottom side of matryoshka" + n);
		}
	}

}
