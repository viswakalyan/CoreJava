package arraysClassInJava;

import java.util.Comparator;

public class MyComparator implements Comparator<String> {

	
	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s2.compareTo(s1);
	}

}
