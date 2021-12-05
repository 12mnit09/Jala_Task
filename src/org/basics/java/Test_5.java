package org.basics.java;

public class Test_5 {

	int a = 4;

	public static void def() {

		int a = 5;
		System.out.println("Local variable:"+a);
	}

	public static void main(String[] args) {

		Test_5 t= new Test_5();
		Test_5.def();
		System.out.println("Global variable:"+(t.a));
	}

}
