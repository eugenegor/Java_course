package com.javacourse.se.lesson46;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

import com.javacourse.se.lesson45.Person;

public class ReadArray {

	
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("arrPeople.bin");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			int personCount = ois.readInt();
			Person[]people = new Person[personCount];
			for(int i = 0; i < personCount; i++){
				people[i] = (Person) ois.readObject();
			}
			
			System.out.println(Arrays.toString(people));
			
			
			ois.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}


	}

}
