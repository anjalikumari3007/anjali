package com.Learning_TestNG;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.Learning_TestNG2.Base_Test;

import WebDriver.WebDriver_Utility;

public class TC002_AddToCart extends Base_Test
{

	@Test
	public void addToCartTest() throws InterruptedException {
		
		driver.findElement(By.partialLinkText("APPAREL & SHOES")).click();
		driver.findElement(By.xpath("//a[text()='Casual Golf Belt']/ancestor::div[@class='details']/descendant::input")).click();
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		WebDriver_Utility.scrollToWebElement(driver, driver.findElement(By.xpath("//h1[text()='Shopping cart']")));
		
		try {
			Reporter.log("Element is present..", true);
			WebDriver.WebDriver_Utility.takesScreenshotOfWebPage(driver, "ADDSS");
			
		} catch (Exception e) {
			Reporter.log("Element is not present...", true);
		}
		
        Thread.sleep(2000);
		
	}
	
	
	
	
	
	
}
