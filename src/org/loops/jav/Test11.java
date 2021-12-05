package org.loops.jav;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check it is even or not");
		int key = sc.nextInt();
		switch (key%2) {
			case 0 :
				System.out.println("Even Number");
				break;
			case 1:
				System.out.println("Odd Number");
				break;
			default :
				break;
		}
		
		
		
		
	}

}
