package org.thissupr.com;

public class Test5 {

	public Test5() {

		this(1, 2);
		System.out.println("Parent class constructior_Test5");

	}
	public Test5(int a, int b) {
		this("Ayanavaram", "Deepak");
		int y = a + b;
		System.out.println("Paramenterized constructor:" + y);
	}

	public Test5(String add, String Name) {
		System.out.println(Name + " " + add);

	}

}
