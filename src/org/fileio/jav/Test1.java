package org.fileio.jav;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws FileNotFoundException {
// to read the file from Notepad
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\DEEPAK PRABHU\\eclipse-workspace\\Jala_Task\\Deep_text\\T1.txt.txt");
		Scanner sc = new Scanner(fis);
		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}

	}
}
