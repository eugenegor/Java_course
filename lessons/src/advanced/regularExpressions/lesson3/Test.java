package advanced.regularExpressions.lesson3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

	
	public static void main(String[] args) {
		String text = "Hello, Guys! I send you my email joe@gmail.com so we can\n"+
	    "Be in touch. Thanks, Joe! Thats cool. I am sending you\n" +
		"my adress: tim@yandex.ru. Lets stay in touch...";
		
		Pattern email = Pattern.compile("(\\w+)@(gmail|yandex)\\.(com|ru)");
		Matcher matcher = email.matcher(text);
		
		while(matcher.find()){
			System.out.println(matcher.group(2));
		}
		
		

	}

}
