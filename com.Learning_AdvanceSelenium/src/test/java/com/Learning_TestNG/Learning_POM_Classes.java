package com.Learning_TestNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.objectRepository.WelcomePage;
import com.objectRepository.loginPage;

public class Learning_POM_Classes 
{

	@Test
	public void loginTest() throws InterruptedException {
		
		
		   WebDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		   driver.get("https://demowebshop.tricentis.com/");
		   
		   WelcomePage wp = new WelcomePage(driver);
		   wp.getLoginLink().click();
		   
		   loginPage lp = new loginPage(driver);
		   lp.getEmailTextField().sendKeys("anjalijha2711@gmail.com");
		   //driver.navigate().refresh();
		   //lp.getEmailTextField().sendKeys("anjalijha2711@gmail.com");
		   lp.getPasswordTextField().sendKeys("Anjali@3007");
		   lp.getLoginButton().click();
		   Thread.sleep(2000);
		   driver.quit();
		
		
		
		
	}
	
	
	
	
	
	
}
