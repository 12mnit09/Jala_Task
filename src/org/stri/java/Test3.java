package org.stri.java;

import java.util.Scanner;

public class Test3 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		char[] charArray = str.toCharArray();
		int len=0;
		for (char c : charArray) {
			len++;
		}
		System.out.println("Length of the String is:");
		System.out.println(len);
		
	}
	

}
