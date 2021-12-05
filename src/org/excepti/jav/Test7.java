package org.excepti.jav;

public class Test7 {

	public static void main(String[] args) {

		try {
			int i = 100;
			int j = 0;
			float f = i / j;

		} catch (Exception e) {
			System.out.println("Its arithmetic exception");
		} finally {
			System.out.println("Finally block is executed successfully");
		}
	}

}
