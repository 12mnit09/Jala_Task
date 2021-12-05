package org.array.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array_1");
		int size_1 = sc.nextInt();
		int b1[] = new int[size_1];
		System.out.println("Enter the elements in the array_1");
		for (int i = 0; i < size_1; i++) {
			b1[i] = sc.nextInt();
		}

		System.out.println("Enter the size of the array_2");
		int size_2 = sc.nextInt();
		int b2[] = new int[size_2];
		System.out.println("Enter the elements in the array_2");
		for (int i = 0; i < size_2; i++) {
			b2[i] = sc.nextInt();
		}

		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < b1.length; i++) {
			for (int j = 0; j < b2.length; j++) {
				if (b1[i] == b2[j]) {

					s.add(b1[i]);
					break;
				}

			}
		}
		System.out.println("Common elements are:");
		for (Object z : s.toArray()) {
			System.out.print(z + " ");
		}

	}
}
