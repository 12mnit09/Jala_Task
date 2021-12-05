package org.excepti.jav;

public class Test13 {

	public void validate(int age) throws Exception {

		if (age < 18) {
			throw new Exception("No Such Field Exception");

		}

	}
	public static void main(String[] args) throws Exception {

		Test5 t = new Test5();
		t.validate(6);
	}
}
