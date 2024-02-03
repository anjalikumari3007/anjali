package com.Learning_TestNG;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Learning_TestNG2.Base_Test_2;


  @Listeners(com.Learning_TestNG2.Listener_Implementation.class)
  public class Learning_Listener_Implementation extends Base_Test_2
  {

	@Test
	public void searchTest() throws InterruptedException {
		
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://demowebshop");//negative scenario
		
		driver.findElement(By.name("q")).sendKeys("mobile");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(2000);
	}
	
	
	
	
	
	
}
