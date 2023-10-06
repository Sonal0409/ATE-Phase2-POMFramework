package com.ninjademo.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ninjademo.aq.Pages.HomePage;
import com.ninjademo.aq.Pages.LoginPage;
import com.ninjademo.aq.Pages.ProductPage;
import com.ninjademo.aq.Pages.SearchPage;
import com.ninjademo.qa.base.TestBase;

public class ProductsPageTest extends TestBase {
			
	HomePage hp ;
	LoginPage lp;
	SearchPage sp;
	ProductPage pp;
		@BeforeMethod
		public void OpenApp()
		{
			OpenBrowser("Chrome");
			hp = new HomePage(driver);
			lp = new LoginPage(driver);
			sp = new SearchPage(driver);
			pp = new ProductPage(driver);
			
		}
		
		
		 	@Test(priority='1')
		 	public void CompareProduct() throws InterruptedException
		 	{
		 		hp.clickonmyAccount();
		 		hp.clickonLogin();
		 		lp.logininAppValidcredentials("seleniumdemo@gmail.com", "123456");
		 		Thread.sleep(1500);
		 		sp.searchProduct("mac");
		 		sp.selectproduct();
		 		pp.compareproducts();
		 	}
		 	
		 	@Test(priority='2')
		 	public void AddtocartProduct() throws InterruptedException
		 	{
		 		hp.clickonmyAccount();
		 		hp.clickonLogin();
		 		lp.logininAppValidcredentials("seleniumdemo@gmail.com", "123456");
		 		Thread.sleep(1500);
		 		sp.searchProduct("mac");
		 		sp.selectaddtocart();
		 		
		 	}

		 	
		 	@AfterMethod()
		 	public void closeBrowser()
		 	{
		 		driver.close();
		 	}
}
