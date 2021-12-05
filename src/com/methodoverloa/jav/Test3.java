package com.methodoverloa.jav;

public class Test3 {

	private void pri(String name, int age) {

		System.out.println("Same");
	}
	private void prii(String name, int age) {
		System.out.println("Same");
	}
	public static void main(String[] args) {
		Test3 qw = new Test3();
		qw.pri("Deepak", 68);
	}

}
