package com.javacourse.se.lesson11;

public class Arrays {
	
	public void arr(){
	
	int number = 10;      //����������� ��� ������  //[10]
	int[] numbers = new int[5];       //numbers ->  [������] cc������� ��� ������
    for(int i = 0; i < numbers.length; i++){
    	numbers[i] = i*10;
    }
    for(int i = 0; i<numbers.length; i++){
    	System.out.println(numbers[i]);
    }
    System.out.println();
    int[] numbers1 = {1, 2, 3};
    for(int i = 0; i<numbers1.length; i++){
    	System.out.println(numbers1[i]);
    }
}
}


