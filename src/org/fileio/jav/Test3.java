package org.fileio.jav;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\DEEPAK PRABHU\\eclipse-workspace\\Jala_Task\\Deep_text\\T1.txt.txt");
		BufferedInputStream bfs = new BufferedInputStream(fis);

		int read;
		while ((read = bfs.read()) != -1) {
			System.out.print((char) read);
		}

	}

}
