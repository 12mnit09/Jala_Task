package org.operators.java;

public class Pro_2 {

	public void preInc() {
		System.out.println("Post/Pre-Increment Operator");
		int x = 10;
		int y = ++x;
		System.out.println("Y value is:" + y);
		System.out.println("X value is:" + x);

	}
	public void postInc() {
		int x = 10;
		int y = x++;
		System.out.println("Y value is:" + y);
		System.out.println("X value is:" + x);

	}

	public static void preDec() {
		System.out.println("Pre/Post-Decrement Operator");
		int x = 10;
		int y = --x;
		System.out.println("Y value is:" + y);
		System.out.println("X value is:" + x);

	}
	public static void postDnc() {
		int x = 10;
		int y = x--;
		System.out.println("Y value is:" + y);
		System.out.println("X value is:" + x);

	}
	public static void main(String[] args) {
		Pro_2 p = new Pro_2();
		p.preInc();
		p.postInc();
		preDec();
		postDnc();

	}
}
