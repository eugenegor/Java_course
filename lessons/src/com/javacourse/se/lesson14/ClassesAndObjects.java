package com.javacourse.se.lesson14;

//� ������ ����� ����:
	//1. ������(����)
	//2. ��������, ������� �� ����� ���������(������)


public class ClassesAndObjects {
	
	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.setName("");
		person1.setAge(20);
		String s1 = "����";
		Person person2 = new Person();
		person2.setName(s1);
		person2.setAge(50);
		int year1 = person1.calculateYearsToRRetirement();
		int year2 = person2.calculateYearsToRRetirement();
		//System.out.println("������� �������� �� ������: "+year1+" ���");
		//System.out.println("������� �������� �� ������: "+year2+" ���");
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
			System.out.println("�������� �������, ��� ������ ���");
		}else{
		for(int i=0; i<3; i++){
		System.out.println("���� ����� "+ getName() + ",��� "+getAge()+" ���");
	}
	  }}
		void sayHello(){
			System.out.println("������");
		}

		//������ � ������(������������):
		public String getName() {
			return name;
		}

		public void setName(String name) {
			if(name.isEmpty()){
				System.out.println("�� ���� ������ ���");
			} else{
			this.name = name;}
		}
		

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			if(age<0){
				System.out.println("������� ������ ���� �������������");
				
			}else{
			this.age = age;}
		}
	}

