package org.thissupr.com;

public class Test3 {

	public Test3() {

		this("Deepak", "Prabhu");
		System.out.println("Current class constructor");
	}

	public Test3(int a) {
		this();
		System.out.println("Single Parameter constructor:" + a);

	}
	public Test3(String fname, String lname) {
		System.out.println(fname + "" + lname);
	}

	public static void main(String[] args) {

		Test3 z = new Test3(12);

	}

}
