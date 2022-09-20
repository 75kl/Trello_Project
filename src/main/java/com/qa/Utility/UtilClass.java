package com.qa.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.Testbase;

public class UtilClass extends Testbase{
	
	public UtilClass()
	{
		PageFactory.initElements(driver,this);
	}
	
	static String path = "C:\\Users\\Admin\\Desktop\\Automation\\NewProjectMaven\\Screenshots";
	
	public static void takeScreenShot(String filename)
	{
		try 
		{
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			File des = new File(path+filename+System.currentTimeMillis()+".png");
			FileHandler.copy(src, des);
		} 
		catch (IOException e) 
		{
			System.out.println("Please provide correct path");
			e.printStackTrace();
		}

	}
}