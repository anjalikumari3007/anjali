package com.Learning_TestNG2;

import java.util.Date;

public class Java_Utility
{

	public static String getName() {
		
		
		String date = new Date().toString().replace("", "_").replace(":", "_");
		 String name = "Report_"+date;
		
		 return name;
		
		
		
	}
	
	
	
	
}
