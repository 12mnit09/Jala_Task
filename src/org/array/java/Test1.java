package org.array.java;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size");
		int s = 0, a = sc.nextInt();

		int b[] = new int[a];
		System.out.println("Enter the elements");
		for (int i = 0; i < a; i++) {
			b[i] = sc.nextInt();
		}
		for (int i = 0; i < a; i++) {
			s = s + b[i];
		}
		System.out.println("Added values are:" + s);

	}
}
