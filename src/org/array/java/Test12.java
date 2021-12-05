package org.array.java;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Test12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the Array");
		int size = sc.nextInt();
		int a[] = new int[size];
		System.out.println("Enter the elements in the Array");
		List<Integer> ll = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			ll.add(sc.nextInt());
		}
		Set<Integer> s = new LinkedHashSet<Integer>();
		s.addAll(ll);
		ll.clear();
		ll.addAll(s);
		System.out.println("After removing duplicates in the Array:");
		System.out.println(ll);

	}
}
