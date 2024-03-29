package com.Learning_TestNG2;



import java.io.File;
import java.sql.Time;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener_Implementation implements ITestListener
	
{

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		
		
		String time = new Date().toString().replace("","_").replace(":","_");
		String name = result.getMethod().getMethodName();
		TakesScreenshot ts = (TakesScreenshot)Base_Test_2.sDriver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./src/test/resources/screenshot/"+ name + time + ".png");
		
		try {
			FileHandler.copy(src, dest);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		
		
	}


	
	
	
	
	
	
	
	
	
	
}
