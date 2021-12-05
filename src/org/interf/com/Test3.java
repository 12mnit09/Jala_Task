package org.interf.com;

public class Test3 implements Test1, Test2 {

	@Override
	public void xx() {

		System.out.println("Interface one from Test1");
	}

	@Override
	public void mm() {

		System.out.println("Interface one from Test2");
	}
	public static void main(String[] args) {
		
		Test3 a=new Test3();
		a.xx();
		a.mm();
	}

}
