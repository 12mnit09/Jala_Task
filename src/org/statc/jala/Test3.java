package org.statc.jala;

public class Test3 {

	
	static int a=5;
	
	public void prit() {

		System.out.println("Static Variable value is:"+a);
		
	}
	
	public static void main(String[] args) {
		
		Test3 tt= new Test3();
		tt.prit();
	}
}
