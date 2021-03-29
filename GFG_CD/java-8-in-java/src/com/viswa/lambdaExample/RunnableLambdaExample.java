package com.viswa.lambdaExample;

public class RunnableLambdaExample {

	public static void main(String[] args) {
		System.out.println("====================================================");
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Inside runnable 1");
			}
		};
		
		new Thread(runnable).start();
		System.out.println("====================================================");
		Runnable runnable2=()->{
			System.out.println("Inside lambda runnable 1");
		};
		new Thread(runnable2).start();
		System.out.println("====================================================");
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Inside runnable 2");
				
			}
		}).start();
		System.out.println("====================================================");
		
		new Thread(()-> {
			System.out.println("Inside lambda runnable 1");
		}).start();
		System.out.println("====================================================");
		new Thread(()-> System.out.println("Inside lambda runnable 123")).start();

	}

}
