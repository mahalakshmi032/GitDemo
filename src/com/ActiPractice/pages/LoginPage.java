package com.ActiPractice.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActiPractice.scripts.SupertestScript;

public class LoginPage 
{
	@FindBy(name="username")
	private WebElement usernameTextBox;
	@FindBy(name="pwd")
	private WebElement passwordTextBox;
	@FindBy(xpath="//input[@type='submit']")
	private WebElement LoginButton;
	
	public LoginPage()
	{
		PageFactory.initElements(SupertestScript.driver, this);
	}
	public void enterUserName(String un)
	{
		usernameTextBox.sendKeys(un);
	}
	public void enterPassword(String pwd)
	{
		passwordTextBox.sendKeys(pwd);
	}
	public void clickOnLogin()
	{
		LoginButton.click();
	}
}
