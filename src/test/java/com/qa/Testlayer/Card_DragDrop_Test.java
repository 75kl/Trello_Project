package com.qa.Testlayer;

import java.time.Duration;

import org.testng.annotations.Test;

import com.qa.PageLayer.Board_1;
import com.qa.PageLayer.CreateBoard;
import com.qa.PageLayer.LoginPage;
//import com.qa.PageLayer.Testbase;

public class Card_DragDrop_Test extends com.qa.TestBase.Testbase {

	
	@Test(priority = 1)
	public void dragAndDrop() throws InterruptedException
	{
		// Login Page Test run
		 login = new LoginPage();
		login.enterEmail("845945kul@gmail.com");
		login.continueButton();
		Thread.sleep(2000);
		login.enterPassword("Kuldeep@123");
		login.clickLogin();
		Thread.sleep(9000);
		
		//Create Board Test run
		cb = new CreateBoard();
		cb.clickBoard();
		cb.clickcreateboard();
		cb.titlename("Board1");
		cb.createButton();
		
		// Board Lists test run
		b = new Board_1();
		b.addlist();
		b.listNameA("ListA");
		b.addlistButton();
		b.listNameB("ListB");
		b.addlistButtonB();
		
		b.addcarda();
		b.namea("CardA");
		b.buttonA();
		
		//drag and drop
		b.listclose();
		b.draganddrop();
	}

}
