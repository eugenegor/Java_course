package com.javacourse.se.lesson37;

import java.io.IOException;
import java.util.Scanner;

public class Exeptions2 {

	
	public static void main(String[] args) throws ScannerException  {
		Scanner scanner = new Scanner(System.in);
		while(true){
			int x =Integer.parseInt(scanner.nextLine());
			
			if(x != 0){
				throw new ScannerException("ользователб ввел что то кроме нуля");
			}
		}

	}

}
