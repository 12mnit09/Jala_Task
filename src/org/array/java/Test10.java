package org.array.java;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int c = 0, size = sc.nextInt();
		int a[] = new int[size];
		int b[] = new int[99];
		System.out.println("Enter the elements in the array:");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (a[i] == a[j]) {
					b[a[i]]++;
				}
			}
		}

		for (int i = 0; i < 99; i++) {
			if (b[i] >= 1) {
				c++;
			}
		}
		System.out.println("Duplicate values in the array is:");
		System.out.println(c);

	}

}
