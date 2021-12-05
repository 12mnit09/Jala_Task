package org.basics.java;

public class Test_1 {

	public int add(int a, int b) {

		int c;
		c = a + b;
		System.out.println("Value of C is:" + c);
		return c;

	}

	public static void main(String[] args) {

		Test_1 t = new Test_1();
		t.add(34,56);

	}

}
