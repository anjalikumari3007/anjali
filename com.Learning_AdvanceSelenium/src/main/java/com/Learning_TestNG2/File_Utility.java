package com.Learning_TestNG2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class File_Utility {

	public static String getPropertyValue(String key) throws Throwable {

		// to create java represenatation object of external file

		FileInputStream fis = new FileInputStream("./src/test/resources/data/commonData.properties");

		// This class is used to fetch data from properties file

		Properties prop = new Properties();

		// This method is used to load all the key in properties class object
		prop.load(fis);

		return prop.getProperty(key);

	}

	public static Object[][] fetchMultipleDataFromExcel(String SheetName) throws Throwable {

		FileInputStream fis = new FileInputStream("./src/test/resources/data/TestScriptData.xlsx");
		Workbook book = WorkbookFactory.create(fis);

		Sheet sheet = book.getSheet(SheetName);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();

		Object[][] data = new Object[rowCount - 1][cellCount];
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < cellCount; j++) {

				data[i - 1][j] = sheet.getRow(i).getCell(j).getStringCellValue();

			}

			return data;
		}
		return data;

	}

}
