package stringClassInJava;

public class StringMethodSet3 {

	public static void main(String[] args) {
		// String Methods 01
		
		String str1= new String("viswakalyan");
		System.out.println("str1 lenth is: "+str1.length());
		
		System.out.println(str1.charAt(0));
		
		System.out.println(str1.concat(" Dhanusha"));
		
		String str2="ViswaKalyan";
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		System.out.println(str1.substring(5));
		
		System.out.println(str1.substring(5, 11));
		
		System.out.println(str1.replace('v', 'b'));
		
		System.out.println(str2.toLowerCase());
		
		System.out.println(str2.toUpperCase());
		
		String str3="           siva         ";
		System.out.println(str3.trim());
		
		System.out.println(str1.indexOf('a'));
		
		System.out.println(str1.lastIndexOf('a'));
		
		String str4="viswaKalyan";		
		System.out.println(str1.compareTo(str4));
		
		System.out.println(str1.compareToIgnoreCase(str4));
		
		
		System.out.println(str1.contains("viswa"));
		
		System.out.println(str1.startsWith("viswa"));
		
		System.out.println(str1.endsWith("an"));
		
		char[] chArr= str1.toCharArray();
		
		System.out.println(new String(chArr));
		
		System.out.println(str1.isEmpty());
		
		String str5="I am a good boy";
		String[] strArr=str5.split("\\s");
		for (String string : strArr) {
			System.out.println(string);
		}
		String str6="I,am,a,good,boy";
	String[] strArr2=str6.split(",");
	for (String string : strArr2) {
		System.out.println(string);
	}
	
	
		String str7 = "word1, word2 word3@word4?word5.word6";
		String[] strArr3=str7.split("[, ?.@]+");
		for (String string : strArr3) {
			System.out.println(string);
		}

	}

}
