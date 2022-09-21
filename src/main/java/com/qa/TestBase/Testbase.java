package com.qa.TestBase;

import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.qa.PageLayer.Board_1;
import com.qa.PageLayer.CreateBoard;
import com.qa.PageLayer.LoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {

	public static String parent;
	public static WebDriver driver;
	public static Actions action;
	public static LoginPage login;
	public static Point p;
	public static CreateBoard cb;
	public static Board_1 b;
	public String browse = "chrome";
	

	@BeforeMethod()
	public void setup()
	{
		if(browse.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		else if(browse.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://trello.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		
		//Class Object creation
		action = new Actions(driver);
		 
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
		
}


	

