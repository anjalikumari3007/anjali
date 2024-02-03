package com.Learning_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Learning_TestNG2.File_Utility;

public class Learning_Excel_File 
{

	@Test
    public void registerTest() throws Throwable {
		
		FileInputStream fis = new FileInputStream("./src/test/resources/data/TestScriptData.xlsx");
	    Workbook book = WorkbookFactory.create(fis);
	    Sheet sheet = book.getSheet("registerData");
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String firstName = cell.getStringCellValue();
		
		String lastName= row.getCell(1).getStringCellValue();
		String email = row.getCell(2).getStringCellValue();
		String password = row.getCell(3).getStringCellValue();
		String confirmPassword = row.getCell(4).getStringCellValue();
		
		String gender = row.getCell(5).getStringCellValue();
	
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(File_Utility.getPropertyValue("url"));
		
		driver.findElement(By.linkText("Register")).click();
		if (gender.equals("Female")) {
			driver.findElement(By.id("gender-female")).sendKeys(gender);
			
		} else {

			driver.findElement(By.id("gender-male"));
		}
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(lastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmPassword);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		Thread.sleep(2000);
		driver.quit();
	
		
		
		
		
		
		
	}	
	
	
	
}
