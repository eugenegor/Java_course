package com.javacourse.se.lesson37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exeptions1 {

	
	public static void main(String[] args)   {
		try {
			readFile();
		} catch (FileNotFoundException e) {
			System.out.println("бработка исключения в методе main");
		}

	}
	
	public static void readFile() throws FileNotFoundException{
		File file = new File("adadf");
		Scanner scanner = new Scanner(file);
	}

}
