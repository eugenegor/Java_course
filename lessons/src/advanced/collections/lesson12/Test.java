package advanced.collections.lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import java.util.List;



public class Test {

	
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		
		people.add(new Person(2, "Katy"));
		people.add(new Person(1, "Bob"));
		people.add(new Person(3, "Mike"));
		
		Collections.sort(people, new Comparator<Person>(){
			public int compare(Person o1, Person o2){
				if(o1.getId() > o2.getId()){
					return 1;
				} else if(o1.getId() < o2.getId()){
					return -1;
				}else{
					return 0;
				}
			}
		});
		
		System.out.println(people);
	}
}


class Person{
	private int id;
	private String name;
	
	

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "person [id=" + id + ", name=" + name + "]";
	}

	public int getId() {
		return id;
	}
	
	
}
	
	
	
	

	

	


