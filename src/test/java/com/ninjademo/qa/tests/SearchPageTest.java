package com.ninjademo.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ninjademo.aq.Pages.HomePage;
import com.ninjademo.aq.Pages.LoginPage;
import com.ninjademo.aq.Pages.SearchPage;
import com.ninjademo.qa.base.TestBase;

public class SearchPageTest extends TestBase {
	

SearchPage sp;
	
	@BeforeMethod
	public void OpenApp()
	{
		OpenBrowser("Chrome");
	
		sp = new SearchPage(driver);
	}
	
	@Test(priority='1')
	public void searchentry()
	{
		sp.searchProduct("mac");
	}
	

	

	
}
