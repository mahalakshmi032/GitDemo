package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./ThirdPartyDrivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//WebElement dd = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//Select dropdown = new Select(dd);
		//dropdown.selectByIndex(2);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		int i=3;
		while(i<=3)
		{
		driver.findElement(By.id("hrefIncAdt")).click();
		i++;
		}
		
	}

}
