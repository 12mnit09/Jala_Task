package org.loops.jav;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check Palindrome or not:");
		int num = sc.nextInt();
		int q = 0, y = 0, a = num;
		while (a != 0) {
			q = a % 10;
			y = (y * 10) + q;
			a = a / 10;

		}

		if (y == num) {
			System.out.println("Its Palindrome");
		} else {

			System.out.println("Not a palindrome");
		}
	}
}
