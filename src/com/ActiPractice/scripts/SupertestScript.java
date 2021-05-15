package com.ActiPractice.scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ActiPractice.commonlibrary.ExcelOperation;

public class SupertestScript 
{
	public static WebDriver driver;
	@BeforeMethod
	public void preStep()
	{
		String browserType = ExcelOperation.excelReadData("preconfig", 0, 0);
		String url = ExcelOperation.excelReadData("preconfig", 1, 1);
		if(browserType.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./ThirdPartyDrivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserType.equals("ie"))
		{
			System.setProperty("webdriver.chrome.driver", "./ThirdPartyDrivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void postStep()
	{
		driver.close();
	}
}
