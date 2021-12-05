package org.acce.jav;

public class Test1 {

	private int a;
	private void mm() {
		System.out.println("Private Method");
	}

	public int getA() {
		return a;
	}

	public void setA(int a2) {
		this.a = a2;

	}
	public static void main(String[] args) {
		Test1 t= new Test1();
		t.mm();
	}

}
