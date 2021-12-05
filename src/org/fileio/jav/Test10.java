package org.fileio.jav;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test10 {

	public static void main(String[] args) throws IOException {

		List<Map<String, String>> testDataAllRows = null;
		Map<String, String> testData = null;

		FileInputStream fileInputStream = new FileInputStream(
				"C:\\Users\\DEEPAK PRABHU\\eclipse-workspace\\Datadriven\\Excel\\Practise.xlsx");

		XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
		XSSFSheet sheet = xssfWorkbook.getSheet("Sheet1");
		// To get the last row number in the excel
		int lastRowNum = sheet.getLastRowNum();

		// Count number of columns/cells
		int lastColNum = sheet.getRow(0).getLastCellNum();
		List list = new ArrayList();
		// To get the row header
		for (int i = 0; i < lastColNum; i++) {
			XSSFRow row = sheet.getRow(0);
			XSSFCell cell = row.getCell(i);
			String rowHeader = cell.getStringCellValue().trim();
			list.add(rowHeader);
		}

		testDataAllRows = new ArrayList<Map<String, String>>();
		for (int j = 1; j <= lastRowNum; j++) {
			XSSFRow row = sheet.getRow(j);
			// Using tree map for insertion order

			testData = new TreeMap<String, String>();
			for (int i = 0; i < lastColNum; i++) {
				XSSFCell cell = row.getCell(i);
				String colValue = cell.getStringCellValue().trim();
				testData.put((String) list.get(i), colValue);
			}
			testDataAllRows.add(testData);
		}
		System.out.println(testDataAllRows);
		xssfWorkbook.close();
	}

}
