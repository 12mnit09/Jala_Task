package org.collec.jav;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test1 {
	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		l.add("Deepak");
		l.add("Priya");
		l.add("Sushma");
		l.add("Abhinaya");
		l.add("Sumitha");
		l.add("Kaja");
		l.add("Raja");
		l.add("Grace");
		l.add("Rahim");
		l.add("Jana");
		Iterator<String> iterator = l.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);

		}
		// Adding element at the Specific Index
		l.add(4, "Raghul");

		System.out.println(l);
		// Remove the element at the specific index

		l.remove(6);
		System.out.println(l);

		// update the element at the specific index
		l.set(8, "Lakshmi");
		System.out.println(l);

		System.out.println(l);

		// to get an element at a particluar index

		String string = l.get(7);
		System.out.println(string);

		// Check the element is present at particular index

		if (l.indexOf("Priya") == 1) {
			System.out.println("Present in this index only");
		}

		// to find the size of the List
		int i = l.size();
		System.out.println(i);

		// Check the given elements is present in ArrayList
		if (l.contains("Grace")) {
			System.out.println("Grace is present");
		} else {
			System.out.println("Grace is not present");
		}

		// to remove all elements from the array list
		boolean removeAll = l.removeAll(l);
		System.out.println(removeAll);
		System.out.println(l);

	}
}
