package com.Learning_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Learning_Properties_File
{

	@Test
	public void loginTest() throws Throwable {
		
		
		//to create java represenatation object of external file
		
		FileInputStream fis = new FileInputStream("./src/test/resources/data/commonData.properties");
		
		//This class is used to fetch data from properties file
		
	     Properties prop = new Properties();
	     
	     //This method is used to load all the key in properties class object
	     
	     prop.load(fis);
	     
	     //This method is used to fetch value by passing key
	     
	    String URL = prop.getProperty("url");
	    String USERNAME = prop.getProperty("username");
	    String PASSWORD = prop.getProperty("password");
	    
	    
	    WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get(URL);
		   
		   driver.findElement(By.linkText("Log in")).click();
		   driver.findElement(By.name("username")).sendKeys(USERNAME);
		   driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
		   driver.findElement(By.id("loginButton")).click();
		   
	    
				
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
