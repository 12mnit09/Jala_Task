package org.fileio.jav;

import java.io.FileWriter;
import java.io.IOException;

public class Test6 {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter(
				"C:\\Users\\DEEPAK PRABHU\\eclipse-workspace\\Jala_Task\\Deep_text\\T1.txt.txt");

		fw.write("Deepak prabhu is SDET");
		fw.close();
	}

}
