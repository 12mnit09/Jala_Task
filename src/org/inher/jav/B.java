package org.inher.jav;

public class B extends A {

	public void m3() {
		super.m1();
		System.out.println("Class-B");
	}
	public void m4() {
		super.m2();
		System.out.println("Class-B");
	}

	@Override
	public void m7() {

	System.out.println("Class-B");
	}
}
