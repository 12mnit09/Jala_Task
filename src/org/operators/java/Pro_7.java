package org.operators.java;

import java.util.Iterator;
import java.util.Scanner;
//largest of two numbers without using array
public class Pro_7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the counnt");
		int num = sc.nextInt();

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < num; i++)

		{
			System.out.println("Enter the number");
			int current = sc.nextInt();

			if (current > max) {
				max = current;

			} else {
				min = current;
			}

		}
		System.out.println("Largest of number is:" + max);
		System.out.println("Smallest of number is:" + min);

	}

}
