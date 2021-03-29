package com.viswa.FinalizeInJava;

public class Test {
private int x;

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public Test(int x) {
	super();
	this.x = x;
}

@Override
protected void finalize() throws Throwable {
	//super.finalize();
	System.out.println("finalize method is called");
}


}
