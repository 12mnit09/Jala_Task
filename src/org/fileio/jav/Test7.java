package org.fileio.jav;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test7 {

	public static void main(String[] args) throws IOException {

		FileReader fi = new FileReader(
				"C:\\\\Users\\\\DEEPAK PRABHU\\\\eclipse-workspace\\\\Jala_Task\\\\Deep_text\\\\T1.txt.txt");
		BufferedReader br = new BufferedReader(fi);
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
}
