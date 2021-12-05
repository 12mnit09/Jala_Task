package org.array.java;

import java.util.Arrays;
import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the elements in the array:");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();

		}
		Arrays.sort(a);
		System.out.println("Maximum and Minimum element in the array are:");
		System.out.println(a[size - 1] - a[1 - 1]);

	}
}
