package org.array.java;

import java.util.Scanner;

public class Test15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the elements in the array:");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		int even = 0, odd = 0;
		for (int i = 0; i < size; i++) {
			if (a[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println("No of even numbers are:" + even);
		System.out.println("No of odd numbers are:" + odd);
	}


}
