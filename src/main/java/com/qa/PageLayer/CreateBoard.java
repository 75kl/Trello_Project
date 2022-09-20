package com.qa.PageLayer;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.TestBase.Testbase;


public class CreateBoard extends Testbase{
	
	
	public CreateBoard()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css =".uJFM1WfH-EGEiT")
	private WebElement Clickboard;
	
	public void clickBoard() throws InterruptedException
	{
		driver.navigate().refresh();
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(8));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='suETmwkWYk2Tcl en8b0gypeeOoyj Ts+YceGnvTbKoG _4y7Skbm3OXlhNV JIXQq8gDYY04N6']")));
		Clickboard.click();
		
	}
	
	@FindBy(css = "body > div.atlaskit-portal-container > div > section > div > nav > ul > li:nth-child(1) > button")
	private WebElement clickCreateboard;
	
	public void clickcreateboard() throws InterruptedException
	{
		Actions a = new Actions(driver);
		a.click(clickCreateboard).perform();

	}
	
	@FindBy(css = "body > div.atlaskit-portal-container > div > section > div > form > div:nth-child(1) > label > input")
	private WebElement titleName;
	
	public void titlename(String BoardName)
	{
		titleName.sendKeys(BoardName);
	}
	
	@FindBy(css = "body > div.atlaskit-portal-container > div > section > div > form > button")
	private WebElement createButton;
	
	public void createButton()
	{
		createButton.click();
	}
}
