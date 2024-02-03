package com.Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Learning_Priority_Attribute
{

	@Test(priority = 2) //acts like a main methods
	public void loginTest() // acts like test case
	{
		
		Reporter.log("Execute Login TestCase ", true);// steps of test ca
	}
		
	@Test(priority=1)
	public void registerTest() {
	
		Reporter.log("Execute register test case", true);	
	}
	
	
	@Test(priority=3)
	public void searchTest() {
		
		
		Reporter.log("Execute search test case", true);
		
	}
	
	
	
	

}

	
	
	
	
	
	
	
	

