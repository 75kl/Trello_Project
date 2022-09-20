package com.qa.Utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.qa.TestBase.Testbase;

public class Listener extends Testbase implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test exection started "+result.getName());;
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed "+result.getName());;
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed "+result.getName());
		
		UtilClass.takeScreenShot(result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
	
	}
	
}
