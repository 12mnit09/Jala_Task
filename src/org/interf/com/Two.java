package org.interf.com;

public class Two implements B {

	@Override
	public void add() {

		System.out.println("Addition Operation is Peformed");
	}

	public static void main(String[] args) {
		
		Two tw= new Two();
		tw.add();
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		
	}

}
