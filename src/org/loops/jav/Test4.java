package org.loops.jav;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check even or odd");
		int nextInt = sc.nextInt();
		if (nextInt%2==0) 
		{
		
			System.out.println("Its even number");
		}
		else 
		{
			System.out.println("Its odd number");
		}
		
	}

}
