package com.Learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Learning_Data_Provider
{

	@Test(dataProvider ="loginData" )
	public void LoginTest(String username, String password) {
	
	WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.get("http://desktop-g16decv/login.do");
	   
	   driver.findElement(By.name("username")).sendKeys(username);
	   driver.findElement(By.name("pwd")).sendKeys(password);
	   driver.findElement(By.id("loginButton")).click();
	
}


	@DataProvider(name= "loginData")
	public Object[][] loginData() {
		
		Object [][] data = new Object[3][2];
		data[0][0]= "anjalijha2711@gamil.com";
		data [0][1]= "anjali@123";
		
		data [1][0]= "anjali.kr1@careinsurance.com";
		data[1][1]= "Insurance@3007";
		
		data[2][0]= "nikhil123@gmail.com";
		data [2][1]= "nikhil123";
		
		return data ;
		
		
		
	}
	
	
	
	
}
