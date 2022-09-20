package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.Testbase;

public class LoginPage extends Testbase{

	
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id = "user")
	private WebElement Email;
	
	public void enterEmail(String mail)
	{
		Email.sendKeys(mail);
	}
	
	@FindBy(id = "login")
	private WebElement ContinueButton;
	
	public void continueButton()
	{
		ContinueButton.click();
	}
	
	@FindBy(id = "password")
	private WebElement Password;
	
	public void enterPassword(String Pass)
	{
		Password.sendKeys(Pass);
	}
	
	@FindBy(id = "login-submit")
	private WebElement Login;
	
	public void clickLogin()
	{
		Login.click();
	}
	
	
}

