package org.fileio.jav;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Test9 {

	public static void main(String[] args) throws IOException {

		FileInputStream fi = new FileInputStream(
				"C:\\Users\\DEEPAK PRABHU\\eclipse-workspace\\Jala_Task\\Deepak.properties");
		Properties p = new Properties();
		p.load(fi);
		System.out.println(p.getProperty("Name"));
		System.out.println(p.getProperty("City"));
		System.out.println(p.getProperty("State"));
		System.out.println(p.getProperty("Country"));

		
	}
}
