package org.interf.com;

public class Test5 implements Inf1, Inf2 {

	@Override
	public void zzz() {

		System.out.println("Two Interfaces Inf1 and Inf2 with same method");
	}
	
	public static void main(String[] args) {
		
		Test5 bb= new Test5();
		bb.zzz();
	}

}
