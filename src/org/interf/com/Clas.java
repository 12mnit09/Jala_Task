package org.interf.com;

public class Clas implements Inf3 {

	@Override
	public void rty() {
		Inf3.super.rty();
		System.out.println("Default Method in Interface");

	}

	public static void main(String[] args) {

		Clas c= new Clas();
		c.rty();
	}
}
