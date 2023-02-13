package advanced.regularExpressions.lesson1;

public class Test {
	public static void main(String[] args) {
		/*
		 
		 \\d - ���� �����
		 \\w - ���� ��������� �����
		 \\w = [a-zA-Z]
		 
		 + - ���� ��� �����
		 * - ���� ��� �����
		 ? - 0 ��� 1 c������� ��
		 (x|y|z) - ���� ������ �� ��������� �����
		 
		 [abc] = (a|b|c)
		 [a-zA-Z] - ��� ���������� �����
		 [0 - 9] = \\d 
		 [^abc] - �� ����� ��� ������� ����� abc
		 . - ����� ������
		 
		 {2} - 2 ������� �� {\\d(2)}
		 {2,} - 2 ��� ����� �������� (\\d{2,})
		 {2,4} �� 2 �� 4 �������� (\\d{2,4})
		 
		 
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
