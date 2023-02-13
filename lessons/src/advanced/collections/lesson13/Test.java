package advanced.collections.lesson13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		List<Person>peopleList = new ArrayList<>();
		Set<Person> peopleSet = new TreeSet<>();
		
		addElements(peopleList);
		addElements(peopleSet);
		
		Collections.sort(peopleList);
		
		System.out.println(peopleList);
		System.out.println(peopleSet);
		

	}
	
	private static void addElements(Collection collection){
		
		
		collection.add(new Person(3, "Katy"));
		collection.add(new Person(1, "Bob"));
		collection.add(new Person(4, "George"));
		collection.add(new Person(2, "To"));
	}

}

class Person implements Comparable<Person>{
	int id;
	String name;
	
	public Person(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	
	
	
	public int getId() {
		return id;
	}
	
	

    public String getName() {
		return name;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}


	@Override
	public int compareTo(Person o) {
		if(this.name.length() > o.getName().length()){
			return 1;
		}else if(this.name.length() < o.getName().length()){
			return -1;
		}else{
			return 0;
		}
	}



	
	
}