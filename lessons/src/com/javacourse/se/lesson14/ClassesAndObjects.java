package com.javacourse.se.lesson14;

//У класса могут быть:
	//1. данные(поля)
	//2. действия, которые он может совершать(методы)


public class ClassesAndObjects {
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.setName("");
		person1.setAge(20);
		String s1 = "Вова";
		Person person2 = new Person();
		person2.setName(s1);
		person2.setAge(50);
		int year1 = person1.calculateYearsToRRetirement();
		int year2 = person2.calculateYearsToRRetirement();
		//System.out.println("Первому человеку до пенсии: "+year1+" лет");
		//System.out.println("Второму человеку до пенсии: "+year2+" лет");
		person1.speak();
		person2.speak();
	}

}

 class Person{
	private String name;
	private int age;
	
	
	
	int calculateYearsToRRetirement(){
		int years = 65-getAge();
		return years;
	}
	
	void speak(){
		if(getAge()==0||getName()==null){
			System.out.println("Неверный возраст, или пустое имя");
		}else{
		for(int i=0; i<3; i++){
		System.out.println("меня зовут "+ getName() + ",мне "+getAge()+" лет");
	}
	  }}
		void sayHello(){
			System.out.println("Привет");
		}

		//ГЕТЕРЫ И СЕТЕРЫ(ИНКАПСУЛЯЦИЯ):
		public String getName() {
			return name;
		}

		public void setName(String name) {
			if(name.isEmpty()){
				System.out.println("Ты ввел пустое имя");
			} else{
			this.name = name;}
		}
		

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			if(age<0){
				System.out.println("Возраст должен быть положительным");
				
			}else{
			this.age = age;}
		}
	}

