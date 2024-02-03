package com.Learning_TestNG2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base_Test 
{

	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser() throws Throwable {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(File_Utility.getPropertyValue("url"));
	
	}
	
	@BeforeMethod
	public void loginToDWS() throws Throwable {
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(File_Utility.getPropertyValue("username"));
		driver.findElement(By.id("Password")).sendKeys(File_Utility.getPropertyValue("password"));
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
	}
	
	@AfterMethod
	public void logoutFromDWS() {
		
		driver.findElement(By.linkText("Log out")).click();
		
		
		
	}
	
	@AfterClass
	public void closeBrowser() {
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
}
