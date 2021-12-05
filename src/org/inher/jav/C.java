package org.inher.jav;

public class C extends B {

	public void m5() {
		super.m3();
		System.out.println("Class-C");
	}

	public void m6() {
		super.m4();
		System.out.println("Class-C");
	}

	@Override
	public void m7() {

		System.out.println("Class-C");

	}

}
