package org.loops.jav;

import java.util.Scanner;

public class Test3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		System.out.println("Enter the first numbers:");
		int a = sc.nextInt();
		System.out.println("Enter the second numbers:");
		int b = sc.nextInt();

		if (a == b) {

			System.out.println("The numbers are equal:");

		} else if (a != b) {

			System.out.println("The numbers are not equal:");

		}
		
		
		
	}

}
