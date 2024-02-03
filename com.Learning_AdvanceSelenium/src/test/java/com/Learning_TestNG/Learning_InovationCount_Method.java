package com.Learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning_InovationCount_Method 
{
   @Test(invocationCount=5)
   public void loginDemoShop() {
	   
	   
	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.get("http://desktop-g16decv/login.do");
	   
	   driver.findElement(By.name("username")).sendKeys("admin");
	   driver.findElement(By.name("pwd")).sendKeys("manager");
	   driver.findElement(By.id("loginButton")).click();
	   
	
	
	
	
}
}