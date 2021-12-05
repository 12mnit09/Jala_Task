package org.array.java;

import java.util.Scanner;

public class Test17 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the elements in the array:");
		for (int i = 0; i < size; i++) {

			a[i] = sc.nextInt();
		}

		System.out.println("Enter the elements you want to search");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int present = 0, notpresent = 0;
		for (int i = 0; i < size; i++) {

			if ((a[i] == num1) || (a[i] == num2)) {
				present++;
				break;
			} else {
				notpresent++;
			}

		}

		System.out.println("Num1 and Num2 is present:"+present);
		System.out.println("Num1 and Num2 is not present:"+notpresent);
	}

}
