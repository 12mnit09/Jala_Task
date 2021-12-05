package org.array.java;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		boolean found = false;
		int value, size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the elements in the array");
		for (int i = 0; i < size; i++) {

			a[i] = sc.nextInt();
		}

		System.out.println("Enter the number to check value is presnt or not");
		value = sc.nextInt();
		for (int i : a) {
			if (value == i) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println(value + ": value is founded");
		} else {
			System.out.println(value + ": value is not founded");
		}
	}

}
