package com.viswa.arraysInJava;

public class ArrayPrint {

	public static void main(String[] args) {

		int[] arr= new int[5];
		arr[0]=10;
		arr[1]=11;
		arr[2]=12;
		arr[3]=13;
		arr[4]=14;
		for(int x: arr) {
			System.out.println(x);
		}
		System.out.println("--------------------------------------");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
