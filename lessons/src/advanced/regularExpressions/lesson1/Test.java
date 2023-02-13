package advanced.regularExpressions.lesson1;

public class Test {
	public static void main(String[] args) {
		/*
		 
		 \\d - одна цифра
		 \\w - одна анлийская буква
		 \\w = [a-zA-Z]
		 
		 + - один или более
		 * - ноль или более
		 ? - 0 или 1 cимволов до
		 (x|y|z) - одна строка из множества строк
		 
		 [abc] = (a|b|c)
		 [a-zA-Z] - все английские буквы
		 [0 - 9] = \\d 
		 [^abc] - мы хотим все символы кроме abc
		 . - любой символ
		 
		 {2} - 2 символа до {\\d(2)}
		 {2,} - 2 или более символов (\\d{2,})
		 {2,4} от 2 до 4 символов (\\d{2,4})
		 
		 
		 */
		
		String a = "-955";
		String b = "4545";
		String c = "+234";
		String d = "r1tg3rg12345";
		System.out.println(a.matches("(\\+|-)?\\d+"));
		System.out.println(b.matches("(\\+|-)?\\d+"));
		System.out.println(c.matches("(\\+|-)?\\d+"));
		System.out.println(d.matches("[a-zA-Z31]+\\d+"));
		
		
		String e = "hello";
		System.out.println(e.matches("[^abc]*"));
		
		String url = "http://www.google.com";
		System.out.println(url.matches("http://www\\..+\\.(com|ru)"));
		
		String f = "12456457";
		System.out.println(f.matches("\\d{2,}"));
		

	}

}
