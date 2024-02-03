package com.Learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.objectRepository.WelcomePage;
import com.objectRepository.loginPage;

import WebDriver.WebDriver_Utility;

public class Learning_ExtentReports 
{

	@Test
	public void loginTest() throws InterruptedException {
		
		
		ExtentSparkReporter spark = new ExtentSparkReporter("./src/test/resources/reports/FirstReport.html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		
		ExtentTest test = report.createTest("loginTest");
		
		WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get("https://demowebshop.tricentis.com/");
		   
		  
		   try {
			
			   Assert.assertEquals(driver.getTitle(), "DWS");
			   test.log(Status.INFO, "Demo Web Shop opened");
			   WelcomePage wp = new WelcomePage(driver);
			   wp.getLoginLink().click();
			   test.log(Status.INFO, "Login Page opened");
			   loginPage lp = new loginPage(driver);
			   lp.getEmailTextField().sendKeys("anjalijha2711@gmail.com");
			   //driver.navigate().refresh();
			   //lp.getEmailTextField().sendKeys("anjalijha2711@gmail.com");
			   lp.getPasswordTextField().sendKeys("Anjali@3007");
			   lp.getLoginButton().click();
			   test.log(Status.PASS, "User logged in successfully");
			   Thread.sleep(2000);
			   
		
			   
			   
			   
		} catch ( Throwable e) {
			test.log(Status.FAIL, "Fail...");
			test.addScreenCaptureFromBase64String(WebDriver_Utility.getScreenShotPath(driver));
		}	
		
		driver.quit();
		report.flush();
	}
	
	
	
	
	
}
