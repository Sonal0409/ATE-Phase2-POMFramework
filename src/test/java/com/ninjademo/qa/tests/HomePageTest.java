package com.ninjademo.qa.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.ninjademo.aq.Pages.HomePage;
import com.ninjademo.qa.base.TestBase;

public class HomePageTest extends TestBase {
	
	HomePage hp ;
	
	@BeforeClass
	public void OpenApp()
	{
		OpenBrowser("Chrome");
		hp = new HomePage(driver);
	}
	
	@Test
	public void testTitle()
	{
		hp.gettitle();
	}
	
	/*
	 * @Test public void clickonLogin() { hp.clickonLogin(); hp.gettitle(); }
	 * 
	 * public void clickonRegister() { hp.clickonRegister(); hp.gettitle(); }
	 * 
	 * public void clickonwishlist() { hp.clickonWishList();; hp.gettitle(); }
	 * public void clickonShoppingcart() { hp.clickonShoppingcart();; hp.gettitle();
	 * }
	 */
	
	@AfterClass
	public void CloseApp()
	{
		driver.quit();
	}

}
