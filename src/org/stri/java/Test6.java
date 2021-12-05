package org.stri.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test6 {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("Welcome", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("Hello Welcome");
		boolean matchfound = matcher.find();
		if (matchfound) {
			System.out.println("Match Found");
		} else {

			System.out.println("Match Not found");
		}

	}
}
