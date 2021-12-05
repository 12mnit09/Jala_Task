package org.thissupr.com;

public class Test2 extends Test1{

	public void pra() {

		System.out.println(super.a);
		super.mm();
		
	}
	public static void main(String[] args) {
		Test2 tt= new Test2();
		tt.pra();
	}
}
