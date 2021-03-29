package stringClassInJava;

public class StringMethodSet2 {

	public static void main(String[] args) {
//constructors
		
		byte[] bArr= {71, 101, 101, 107, 115};
		String str1= new String(bArr);
		System.out.println(str1);
		
		
		char[] chArr= {'G','e','e','k','s'};
		String str2= new String(chArr);
		System.out.println(str2);
		
		String str3= new String("viswa");
		System.out.println(str3);
		
		StringBuffer sb1= new StringBuffer("viswakalyan");
		String str4= new String(sb1);
		System.out.println(str4);
		
		StringBuilder sb2= new StringBuilder("Dhanusha");
		String str5= new String(sb2);
		System.out.println(str5);
		
		
		
	}

}
