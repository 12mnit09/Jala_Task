package org.statc.jala;

public class Test7 {

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
		
		Test7 ttt= new Test7();
		name();
		ttt.display();
	}
}
