package org.fileio.jav;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class Test2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream fi=new FileOutputStream("C:\\Users\\DEEPAK PRABHU\\eclipse-workspace\\Jala_Task\\Deep_text\\T1.txt.txt");
		PrintWriter pw = new PrintWriter(fi);
		pw.println("Deepak will become SDET Engineer");
		pw.close();
		
	}
}
