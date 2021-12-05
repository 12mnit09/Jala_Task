package org.loops.jav;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the gender");
		char key = sc.next().charAt(0);
		switch (key) {
			case 'm' :
				System.out.println("Your Male");
				break;
			case 'M' :
				System.out.println("Your Male");
				break;
			case 'f' :
				System.out.println("Your Female");
				break;
			case 'F' :
				System.out.println("Your Female");
				break;
			default :
				System.out.println("Please enter again");
				break;
		}

	}
}
