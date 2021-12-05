package org.loops.jav;

import java.util.Scanner;

public class Test8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Enter the number to check whether it is Armstrong Number:");

		int num = sc.nextInt();
		int a = 0, d = 0;
		while (num != 0) {
			a = num % 10;
			d = (a * a * a) + d;
			num = num / 10;

		}
		System.out.println("Its an armstrong number:" + d);

	}

}
