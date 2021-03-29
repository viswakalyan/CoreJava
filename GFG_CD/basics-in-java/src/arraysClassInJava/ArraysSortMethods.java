package arraysClassInJava;

import java.util.Arrays;
import java.util.List;

public class ArraysSortMethods {

	public static void main(String[] args) {

		int[] a= {10,5,20,11,6};
		System.out.println("-------------------------------------------------------");
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.binarySearch(a, 6));
		
		
		System.out.println("-------------------------------------------------------");
		
		String[] s= {"A","Z","B"};
		System.out.println(Arrays.toString(s));
		Arrays.sort(s);
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.binarySearch(s, "Z"));
		System.out.println("-------------------------------------------------------");
		
		String[] s2= {"A","Z","B"};
		System.out.println(Arrays.toString(s2));
		Arrays.sort(s2, new MyComparator());
		System.out.println(Arrays.toString(s2));
		System.out.println(Arrays.binarySearch(s2, "Z",new MyComparator()));
		System.out.println("-------------------------------------------------------");
		int intArr[] = { 10, 20, 15, 22, 35 }; 
		Arrays.fill(intArr, 22);
		System.out.println(Arrays.toString(intArr));
		System.out.println("-------------------------------------------------------");
		
		int intArr2[] = { 10, 20, 15, 22, 35 }; 
		int intArr3[] = Arrays.copyOf(intArr2, 10);
		System.out.println(Arrays.toString(intArr3));
		System.out.println("-------------------------------------------------------");
		int intArr4[]=Arrays.copyOfRange(intArr3, 0, 5);
		System.out.println(Arrays.toString(intArr4));
		System.out.println("-------------------------------------------------------");
		
		String[] s3= {"A","Z","B"};
		List<String> ls=Arrays.asList(s3);
		System.out.println(ls);
		s3[0]="K";
		System.out.println(Arrays.asList(s3));
		ls.set(0, "M");
		System.out.println(Arrays.asList(s3));
		//ls.add("s"); //java.lang.UnsupportedOperationException
		//ls.remove("Z"); //java.lang.UnsupportedOperationException
		
		
	}

}
