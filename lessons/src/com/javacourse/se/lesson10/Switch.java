package com.javacourse.se.lesson10;

import java.util.Scanner;

public class Switch {
	
	public void sw(){
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("������� �������");
	String age = scanner.nextLine();
	switch(age){
	case "����":
	System.out.println("�� �������");
	break;
	case "����":
		System.out.println("�� ����� � �����");
		break;
	case "������������":
		System.out.println("�� �������� �����");
		break;
	default:
			System.out.println("�� ���� �� ���������� ������� �� �������");
	}
	
	}
	

}
