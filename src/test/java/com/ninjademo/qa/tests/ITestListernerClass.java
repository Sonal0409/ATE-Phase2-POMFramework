package com.ninjademo.qa.tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListernerClass implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
	
		System.out.println("Test has started");
		}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("Test is Success");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test has failed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("Test has skipped");
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
		
		System.out.println("Test failed due to timeout");
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("methods is class started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test has Finished");
	}

}
