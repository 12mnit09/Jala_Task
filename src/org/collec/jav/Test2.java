package org.collec.jav;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Test2 {

	public static void main(String[] args) {

		HashMap<Integer, String> m = new HashMap<Integer, String>();
		m.put(1, "Revathy");
		m.put(2, "Deepika");
		m.put(3, "Savithiri");
		m.put(4, "Aishwarya");
		m.put(5, "Santa");
		m.put(6, "Rakesh");
		m.put(7, "Buvana");
		m.put(8, "Roni");
		m.put(9, "Venkat");
		m.put(10, "Prasy");

		System.out.println(m);

		int size = m.size();
		for (int i = 1; i <= size; i++) {

			String string = m.get(i);
			System.out.println(string);
		}
		// create a clone of hashmap
		Object clone = m.clone();
		System.out.println(clone);

		// check whether the given key is in map

		if (m.containsKey("Roni")) {
			System.out.println("Key is Present");
		} else {
			System.out.println("Key not present");
		}
		// check if value is present or not
		boolean containsValue = m.containsValue("Venkat");
		System.out.println(containsValue);

		// check if map is empty

		boolean empty = m.isEmpty();
		System.out.println(empty);

		// Size of the map
		int size2 = m.size();
		System.out.println(size2);

		// Print all the keys from the map
		Set<Integer> keySet = m.keySet();
		System.out.println(keySet);

		// Remove specific key value pair
		m.remove(4, "Aishwarya");
		System.out.println(m);

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.putAll(m);
		System.out.println("New hashMap");
		System.out.println(hm);

	}

}
