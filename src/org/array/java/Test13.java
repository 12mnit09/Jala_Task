package org.array.java;

import java.util.Scanner;

public class Test13 {
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
		System.out.println("Elements in the array are");
		for (int i = 0; i < size; i++) {

			System.out.print(a[i] + " ");
		}
		System.out.println();
		//Second largest number in an array
		System.out.println("Second largest element in the array are:" + a[4-1]);
		
		
		
		
	}

}
