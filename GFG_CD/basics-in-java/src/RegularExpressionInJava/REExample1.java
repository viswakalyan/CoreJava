package RegularExpressionInJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class REExample1 {

	public static void main(String[] args) {

		int count=0;
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abbbabbaba");
		while(m.find()) {
			count++;
			System.out.println(m.start()+"  "+m.end()+" "+m.group());
		}
		
		System.out.println("number of occurances is "+count);
	}

}
