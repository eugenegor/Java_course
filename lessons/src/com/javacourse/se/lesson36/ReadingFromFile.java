package com.javacourse.se.lesson36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {

	
	public static void main(String[] args) throws FileNotFoundException {
		String separator = File.separator;
		String path = separator +"Users"+separator+"Lunatic"+separator+"Desktop"+separator+"test.txt";
		File file = new File(path);
		
		Scanner scanner = new Scanner(file);
		String line = scanner.nextLine();
		String[] numbersString = line.split(" ");
		int[] numbers = new int[3];
		int counter = 0;
		
		for(String number : numbersString){
			numbers[counter++] = Integer.parseInt(number);
		}
		
        
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers[2]);
		int sum = numbers[2] + 3;
		System.out.println(sum);
		scanner.close();

	}

}
