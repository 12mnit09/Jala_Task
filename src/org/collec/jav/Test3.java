package org.collec.jav;

import java.util.HashSet;
import java.util.Iterator;

public class Test3 {

	public static void main(String[] args) {

		HashSet<String> hs = new HashSet<String>();

		hs.add("Deepak");
		hs.add("Raghul");
		hs.add("Udhay");
		hs.add("Praveen");
		hs.add("Kirthiga");
		System.out.println(hs);

		boolean contains = hs.contains("Udhay");
		System.out.println(contains);

		// size of the hashset
		System.out.println(hs.size());
		// Removing hashset
		hs.remove("Udhay");
		// Iterating hashset using Iterator
		Iterator<String> iterator = hs.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}

		// to clear the hashset
		hs.clear();
		System.out.println(hs);

	}

}
