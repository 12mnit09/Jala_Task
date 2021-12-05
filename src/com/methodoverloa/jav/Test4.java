package com.methodoverloa.jav;

public class Test4 {
	
	private int pet(int a, String b) {
		
		int y;
		y=a;
		
			System.out.println(a+""+b);
			return y; 
	}
	
	
	private void pet2(int a, String b) {

		
		System.out.println(a+""+b);
	}
	public static void main(String[] args) {
		
		
		Test4 t = new Test4();
		t.pet(2, "rrgg");
	}

}
