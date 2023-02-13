package advanced.regularExpressions.lesson2;

import java.util.Arrays;

public class Test {

	
	public static void main(String[] args) {
		String a = "Hello1442there758867hey";
		
		String[] words = a.split("\\d+");
		System.out.println(Arrays.toString(words));
		
		String b = "Hello1245there465757hey";
		String modifiedString = b.replaceAll("\\d+", "-");
		String modifiedString2 = b.replaceFirst("\\d+", "-");
		System.out.println(modifiedString);
		System.out.println(modifiedString2);

	}

}
