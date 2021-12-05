package org.operators.java;

import java.util.Scanner;

public class Pro4 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers:");
		System.out.println("Enter the first numbers:");
		String a = sc.nextLine();
		System.out.println("Enter the second numbers:");
		String b = sc.nextLine();
		if (a.equals(b)) 
		{

			System.out.println("Two Numbers are equal");
		} else {

			System.out.println("Not Equal");
		}
		
	}
}
