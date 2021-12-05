package org.array.java;

import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int s = 0, size = sc.nextInt();
		int b[] = new int[size];
		System.out.println("Enter the elements of the array");
		for (int i = 0; i < size; i++) {

			b[i] = sc.nextInt();
		}
		for (int i = 0; i < size; i++) {

			s = s + b[0];

		}
		System.out.println("Sum is:" + s);
		long average = s / size;
		System.out.println("Average is:" + average);

	}

}
