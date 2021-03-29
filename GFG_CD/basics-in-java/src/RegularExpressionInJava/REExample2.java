package RegularExpressionInJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REExample2 {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("[abc]");
		Matcher m=p.matcher("a1b7@z#");
		while(m.find()) {
			System.out.println(m.start()+"  "+m.group());
		}
		
		System.out.println("=========================================");
		Pattern p1 = Pattern.compile("[^abc]");
		Matcher m1=p1.matcher("a1b7@z#");
		while(m1.find()) {
			System.out.println(m1.start()+"  "+m1.group());
		}
		
		System.out.println("=========================================");
		Pattern p2 = Pattern.compile("[0-9]");
		Matcher m2=p2.matcher("a1b7@z#");
		while(m2.find()) {
			System.out.println(m2.start()+"  "+m2.group());
		}
		
		System.out.println("=========================================");
		Pattern p3 = Pattern.compile("[a-z]");
		Matcher m3=p3.matcher("a1b7@z#");
		while(m3.find()) {
			System.out.println(m3.start()+"  "+m3.group());
		}
		
		
		
		
	}

}
