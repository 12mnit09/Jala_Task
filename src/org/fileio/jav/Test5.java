package org.fileio.jav;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test5 {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader(
				"C:\\Users\\DEEPAK PRABHU\\eclipse-workspace\\Jala_Task\\Deep_text\\T1.txt.txt");

		int i;

		while ((i = fr.read()) != -1) {
			System.out.print((char) i);
		}
	}

}
