package org.interf.com;

public class A implements One {

	@Override
	public void m1() {

		System.out.println("Interface Methods");
	}
	public static void main(String[] args) {
		A aa = new A();
		aa.m1();
	}

}
