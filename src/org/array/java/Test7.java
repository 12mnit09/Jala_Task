package org.array.java;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int a = sc.nextInt();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		System.out.println("Enter the elements");
		for (int i = 0; i < a; i++) {
			ll.add(sc.nextInt());
		}
		System.out.println("Enter the location:");
		int loc = sc.nextInt();
		System.out.println("Enter the new element:");
		int nl = sc.nextInt();
		ll.set(loc, nl);
		ListIterator<Integer> listIterator = ll.listIterator();
		while (listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}

	}
}
