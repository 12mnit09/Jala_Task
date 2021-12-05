package org.conn.jav;

public class Test1 {

	Test1() {

		this("Deepak");
		System.out.println("Default Constructor");

	}
	Test1(String name) {
		this("Deepak", 21);
		System.out.println("One Argument constructor:" + name);

	}

	Test1(String name, int age) {

		System.out.println("Two argument constructor:" + name + age);
	}

}
