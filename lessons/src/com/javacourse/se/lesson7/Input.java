package com.javacourse.se.lesson7;

import java.util.Scanner;




public class Input {
	
	public void inp(){
	
	Scanner s = new Scanner(System.in);
	System.out.println("введите какое нибудь число");
    int a = s.nextInt();
    System.out.println("вы ввели" + " " + a) ;
	s.close();
	}
}
	
	


