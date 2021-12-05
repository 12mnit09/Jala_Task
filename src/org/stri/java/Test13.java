package org.stri.java;

public class Test13 {

	public static void main(String[] args) {

		int a = 10;
		String string = Integer.toString(a);
		Integer y = a;

		System.out.println(string.getClass().getName());
		System.out.println(string);

		System.out.println(y.getClass().getName());

		System.out.println(y);
	}
}
