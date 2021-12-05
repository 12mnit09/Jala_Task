package org.array.java;

import java.util.LinkedList;
import java.util.Scanner;

public class Test6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a = sc.nextInt();
		LinkedList<Integer> fl = new LinkedList<Integer>();
		System.out.println("Enter the elements");
		System.out.println("First array");
		for (int i = 0; i < a; i++) {

			fl.add(sc.nextInt());
		}
		LinkedList<Integer> sl = new LinkedList<Integer>();
		sl = (LinkedList<Integer>) fl.clone();
		System.out.println("Second Array:");
		for (Object z : sl.toArray()) {
			System.out.print(z + " ");
		}

	}

}
