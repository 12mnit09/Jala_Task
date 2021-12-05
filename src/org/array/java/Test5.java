package org.array.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int a = sc.nextInt();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		System.out.println("Enter the elements");
		for (int i = 0; i < a; i++) {
			ll.add(sc.nextInt());

		}

		System.out.println("Enter the value to remove from the Array");
		int b = sc.nextInt();
		// ll.remove(b); this will delete the index value in order to overcome
		// that we we have to use Object
		ll.remove(new Integer(b));
		System.out.println("After Removing the elemnts from the array");
		for (Object o : ll.toArray()) {
			System.out.print((Integer) o + " ");
		}

	}

}
