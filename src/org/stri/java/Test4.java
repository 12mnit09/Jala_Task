package org.stri.java;

public class Test4 {

	public static void main(String[] args) {

		String name = "Deepak";
		for (int i = 0; i < name.length(); i++) {
			for (int j = i + 1; j < name.length(); j++) {
				System.out.println(name.substring(i, j));

			}
		}
	}

}
