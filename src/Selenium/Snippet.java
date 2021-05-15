package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Snippet 
{
	
	public static void main(String[] args) 
	{
		/*System.setProperty("webdriver.chrome.driver", "./ThirdPartyDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption1")).click();
		Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected());
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
    
	
		System.setProperty("webdriver.chrome.driver", "./ThirdPartyDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());*/
		
		System.setProperty("webdriver.chrome.driver", "./ThirdPartyDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.className("ui-state-default.ui-state-highlight.ui-state-active")).click();
		WebElement dd = driver.findElement(By.id("Adults"));
		Select dropdown= new Select(dd);
		dropdown.selectByIndex(2);
		
		
		
		driver.findElement(By.className("blue.dArrow")).click();
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");
		
		driver.findElement(By.id("SearchBtn")).click();
		
		System.out.println( driver.findElement(By.id("homeErrorMessage")).getText());
		
		
		
		
		
		
		
		
		
		
		
	
	}
}

