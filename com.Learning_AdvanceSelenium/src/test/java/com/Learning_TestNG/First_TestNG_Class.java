package com.Learning_TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class First_TestNG_Class {
	
		@Test //acts like a main methods
		public void loginTest() // acts like test case
		{
			
			Reporter.log("Execute Login TestCase ", true);// steps of test ca
		}
			
		@Test
		public void registerTest() {
		
			Reporter.log("Execute register test case", true);	
		}
		
		
		@Test
		public void searchTest() {
			
			
			Reporter.log("Execute search test case", true);
			
		}
		
		
		
		

	}
