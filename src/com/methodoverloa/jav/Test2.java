package com.methodoverloa.jav;

public class Test2 {

	public void rog(float a, long e) {

		System.out.println(a + " " + e);

	}
	public void rog(String name, int a) {

		System.out.println(name + " " + a);
	}

	public static void main(String[] args) {

		Test2 ttt = new Test2();
		ttt.rog(2.0f, 4567);
		ttt.rog("Mani", 23);

	}
}
