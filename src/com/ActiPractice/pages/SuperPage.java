package com.ActiPractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActiPractice.scripts.SupertestScript;

public class SuperPage 
{
	@FindBy(className="logoutImg")
	public WebElement logoutButton;
	
	public SuperPage()
	{
		PageFactory.initElements(SupertestScript.driver, this);
	}
	public void clickOnLogoutButton()
	{
		logoutButton.click();
	}
}
