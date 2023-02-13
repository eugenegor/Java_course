package com.javacourse.se.lesson10;

import java.util.Scanner;

public class Switch {
	
	public void sw(){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("введите возраст");
	String age = scanner.nextLine();
	switch(age){
	case "ноль":
	System.out.println("Ты родился");
	break;
	case "Семь":
		System.out.println("Ты пошел в школу");
		break;
	case "Восемнадцать":
		System.out.println("Ты закончил школу");
		break;
	default:
			System.out.println("ни одно из предыдущих условий не подошло");
	}
	
	}
	

}
