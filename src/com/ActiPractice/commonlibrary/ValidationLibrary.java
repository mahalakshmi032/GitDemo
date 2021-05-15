package com.ActiPractice.commonlibrary;

import org.testng.Assert;

public class ValidationLibrary 
{
	public static String verifyTitle(String actRes,String expRes)
	{
		try
		{
			Assert.assertEquals(actRes, expRes);
			return "Pass";
		}
		catch(AssertionError e)
		{
			return "Fail";
		}
		
	}
}
