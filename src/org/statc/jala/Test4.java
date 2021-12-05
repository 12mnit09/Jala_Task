package org.statc.jala;

public class Test4 {

	public void add() {

		System.out.println("Instance Method");
	}

	public static void sub() {

		Test4 ttt = new Test4();
		ttt.add();
		System.out.println("I am static method");
	}
	public static void main(String[] args) {

	}
}
