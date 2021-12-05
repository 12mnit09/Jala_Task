package org.statc.jala;

public class Test1 {

	static int p;
	static int q;
	int x;
	int y;

	public static void add(int a, int b) {

		p = a + b;
		System.out.println("The added value is:" + p);

	}
	public static void mul(int x, int y) {
		q = x * y;
		System.out.println("Multiplied value is:" + q);
	}

	public void sub(int x, int y) {
		this.x = x - y;
		System.out.println("Subtracted value is:" + this.x);

	}
	public void div(int x, int y) {

		this.y = x / y;
		System.out.println("Divided value is:" + this.y);
	}

	public static void main(String[] args) {
		add(12, 13);
		mul(34, 44);

		Test1 t = new Test1();
		t.sub(50, 25);
		t.div(500, 250);
	}

}
