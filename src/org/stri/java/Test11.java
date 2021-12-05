package org.stri.java;

public class Test11 {
	public static void main(String[] args) {
		
		String str="raghul94@gmail@com";
		String[] split = str.split("@");
		for (String string : split) {
			System.out.println(string);
		}
		
	}

}
