package com.Learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Learning_HardAssert
{

   @Test
   public void loginTest() throws InterruptedException {
	   
	   
	   WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "I am validating Title");
		
		driver.findElement(By.linkText("Log in")).click();
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop.tricentis.com/login");
		driver.findElement(By.id("Email")).sendKeys("anjalijha2711@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Anjali@3007");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop");
		Thread.sleep(2000);
	   
	   
	   
   }
	
	
	
	
}
