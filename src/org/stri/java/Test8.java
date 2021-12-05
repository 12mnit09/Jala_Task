package org.stri.java;

public class Test8 {

	public static void main(String[] args) {

		String s1 = "Deepak";

		String s2 = "deepak";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));

		String s3 = "Selenium is an API";

		System.out.println(s3.startsWith("Selenium"));
		System.out.println(s3.startsWith("is", 10));

		System.out.println(s3.endsWith("API"));

		System.out.println(s1.compareTo(s2));

	}
}
