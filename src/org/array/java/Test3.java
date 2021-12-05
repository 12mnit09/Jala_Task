package org.array.java;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int index = -1;
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the elements");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();

		}
		System.out.println("Enter the number to find index position");
		int key = sc.nextInt();
		for (int i = 0; i < size; i++) {

			if (key == a[i]) {
				index = i;
				break;
			}
		}
		System.out.println("Index is:" + index);

	}

}
