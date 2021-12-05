package org.fileio.jav;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\DEEPAK PRABHU\\eclipse-workspace\\Jala_Task\\Deep_text\\T1.txt.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos);

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a line in the notepad file:");
		String nextLine = sc.nextLine();
		byte[] bytes = nextLine.getBytes();
		bos.write(bytes);
		bos.close();

	}

}
