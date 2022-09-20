package com.qa.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.Testbase;

public class Board_1 extends Testbase{

	public Board_1()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(css = "#board > div.js-add-list.list-wrapper.mod-add.is-idle")
	private WebElement Addlist;
	
	public void addlist()
	{
		Addlist.click();
	}
	
	@FindBy(css = "#board > div.js-add-list.list-wrapper.mod-add > form > input")
	private WebElement ListName;
	
	public void listNameA(String NameA)
	{
		ListName.sendKeys(NameA);
	}
	
	@FindBy(css = "#board > div.js-add-list.list-wrapper.mod-add > form > div > input")
	private WebElement AddlistButton;
	
	public void addlistButton()
	{
		AddlistButton.click();
	}
	
	@FindBy(css = "#board > div > form > input")
	private WebElement List2;
	
	public void listNameB(String NameB)
	{
		List2.sendKeys(NameB);
	}
	
	@FindBy(css = "#board > div.js-add-list.list-wrapper.mod-add > form > div > input")
	private WebElement AddlistButtonB;
	
	public void addlistButtonB()
	{
		AddlistButtonB.click();
	}
	
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > a:nth-child(1) > span:nth-child(2)")
	private WebElement AddCardA;
	
	public void addcarda()
	{
		AddCardA.click();
	}
	
	@FindBy(css = "textarea[placeholder='Enter a title for this card…']")
	private WebElement NameA;
	
	public void namea(String Name)
	{
		NameA.sendKeys(Name);
	}
	
	@FindBy(css = "input[value='Add card']")
	private WebElement buttonclickA;
	
	public void buttonA()
	{
		buttonclickA.click();
	}
	
	@FindBy(css = ".icon-lg.icon-close.dark-hover.js-cancel")
	private WebElement Listclose;
	
	public void listclose()
	{
		Listclose.click();
	}
	
	@FindBy(css="#board > div:nth-child(1) > div > div.list-cards.u-fancy-scrollbar.u-clearfix.js-list-cards.js-sortable.ui-sortable > a > div.list-card-details.js-card-details > div.list-card-front-labels-container.js-list-card-front-labels-container > div")
	private WebElement CardA;
	
	@FindBy(css = "body > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > main:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)")
	private WebElement droplist;
	
	public void draganddrop()
	{
		action.dragAndDrop(CardA, droplist).build().perform();
	}
	
	
}
