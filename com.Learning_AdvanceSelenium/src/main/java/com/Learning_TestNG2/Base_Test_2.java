package com.Learning_TestNG2;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Base_Test_2 
{

	public ExtentReports report;
	public ExtentTest test;
    public WebDriver driver;
    public static WebDriver sDriver;
    
    @BeforeSuite
    public void configureReport() {
    	
    	ExtentSparkReporter spark = new ExtentSparkReporter("./src/test/resources/reports/"+Java_Utility.getName()+".html");
		ExtentReports report = new ExtentReports();
		report.attachReporter(spark);
		
    	
    }
	
	@BeforeClass(alwaysRun = true)
	public void openBrowser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		sDriver = driver;
	
	}
	
	@BeforeMethod
	public void loginToDWS(Method method) {
		
		
		test = report.createTest(method.getName());
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("anjalijha2711@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Anjali@3007");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
	}
	
	@AfterMethod(alwaysRun = true)
	public void logoutFromDWS() {
		
		driver.findElement(By.linkText("Log out")).click();
		
		
		
	}
	
	@AfterClass
	public void closeBrowser() {
		
		driver.quit();
		
	}
	
	@AfterSuite
    public void saveReport() {
		
		
		
		report.flush();
	}	
	
}
