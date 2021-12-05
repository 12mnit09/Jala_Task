package org.statc.jala;

public class Test5 {
	
	static String name()
	{
		String name="Deepak Prabhu and will become SDET Engineer";
		return name;
		
	}
	
	public void display() {

		String disp=name();
		System.out.println("He is "+disp);
	}
	public static void main(String[] args) {
		
		Test5 ttt= new Test5();
		ttt.display();
	}

}
