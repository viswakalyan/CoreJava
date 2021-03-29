package RegularExpressionInJava;

import java.util.regex.Pattern;

public class REExample5 {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("\\s");
		String[] strArr=p.split("viswa software solutions");
		for (String string : strArr) {
			System.out.println(string);
		}
		System.out.println("======================================");
		
		Pattern p1 = Pattern.compile("\\.");
		String[] strArr1=p1.split("www.viswa.com");
		for (String string : strArr1) {
			System.out.println(string);
		}
	}

}
