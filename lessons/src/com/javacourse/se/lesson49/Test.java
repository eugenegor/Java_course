package com.javacourse.se.lesson49;

public class Test {

	
	public static void main(String[] args) {
		
		System.out.println(fac(4));

	}
    
	
	// fac(4);
	// 4 * 6 = 24
	// 3 * 2 = 6
	// 2 * 1
	// fac(1) = return 1
	
	private static int fac(int n){
		if(n==1)
			return 1 ;
		
		return n * fac(n - 1);
	}
}

