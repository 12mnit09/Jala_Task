package org.fileio.jav;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Test8 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter(
				"C:\\Users\\DEEPAK PRABHU\\eclipse-workspace\\Jala_Task\\Deep_text\\T1.txt.txt");

		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Deepak Prabhu is an SDET Engineer");
		bw.close();
		System.out.println("Close");
	}
}
