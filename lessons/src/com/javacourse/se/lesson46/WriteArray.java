package com.javacourse.se.lesson46;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.javacourse.se.lesson45.Person;

public class WriteArray {

	
	public static void main(String[] args) {
		
		Person [] people = {new Person(1, "Bob"), new Person(2, "Mike"), new Person(3, "Tom")};
		
		try {
			FileOutputStream fos = new FileOutputStream("arrPeople.bin");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			
			
			oos.writeInt(people.length);
			
			for(Person person : people) {
				oos.writeObject(person);
				
				oos.close();
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}



	}

}
