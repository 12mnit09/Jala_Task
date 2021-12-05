package com.methodoverloa.jav;

public class Test1 {

	public void print(String value) {

		System.out.println("Method with one value:" + value);
	}

	public void print(String name, String nn) {

		System.out.println("Method with two value:" + name + nn);
	}

	public static void main(String[] args) {

		Test1 ttt = new Test1();
		ttt.print("Raghul");
		ttt.print("Deepak", "Prabu");

	}
}
