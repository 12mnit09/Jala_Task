package org.array.java;

import java.util.Scanner;

public class Test9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int t = 0, size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the elements in the array");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();

		}

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (a[i] > a[j]) {
					t = a[i];
					a[i] = a[j];
					a[j] = t;

				}
			}
		}
		// to print in reverse order
		System.out.println("Reverse elements in an Array");
		for (int i = size - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}

	}
}
