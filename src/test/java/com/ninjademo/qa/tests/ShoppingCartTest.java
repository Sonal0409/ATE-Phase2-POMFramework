package com.ninjademo.qa.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ninjademo.aq.Pages.HomePage;
import com.ninjademo.aq.Pages.LoginPage;
import com.ninjademo.aq.Pages.ProductPage;
import com.ninjademo.aq.Pages.SearchPage;
import com.ninjademo.aq.Pages.ShoppingCartPage;
import com.ninjademo.qa.base.TestBase;

public class ShoppingCartTest extends TestBase{
	
	HomePage hp ;
	LoginPage lp;
	SearchPage sp;
	ProductPage pp;
	ShoppingCartPage sc;
		@BeforeClass
		public void OpenApp()
		{
			OpenBrowser("Chrome");
			hp = new HomePage(driver);
			lp = new LoginPage(driver);
			sp = new SearchPage(driver);
			pp = new ProductPage(driver);
			sc = new ShoppingCartPage(driver);
			
		}
		
		@Test(priority='1')
	 	public void AddtocartProduct1() throws InterruptedException
	 	{
	 		hp.clickonmyAccount();
	 		hp.clickonLogin();
	 		lp.logininAppValidcredentials("seleniumdemo@gmail.com", "123456");
	 		Thread.sleep(1500);
	 		sp.searchProduct("mac");
	 		sp.selectaddtocart();
	 		Thread.sleep(1500);
	 		hp.clickonShoppingcart();
	 		sc.viewcart();
	 		sc.quantityChange();
	 		
	 		
	 	}


}
