package com.ninjademo.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ninjademo.aq.Pages.HomePage;
import com.ninjademo.aq.Pages.LoginPage;
import com.ninjademo.aq.Pages.ProductComparePage;
import com.ninjademo.aq.Pages.ProductPage;
import com.ninjademo.aq.Pages.SearchPage;
import com.ninjademo.qa.base.TestBase;

public class ProductComaprePageTest extends TestBase {
	
HomePage hp ;
LoginPage lp;
SearchPage sp;
ProductPage pp;
ProductComparePage cp;

@BeforeMethod
public void OpenApp()
{
	OpenBrowser("Chrome");
	hp = new HomePage(driver);
	lp = new LoginPage(driver);
	sp = new SearchPage(driver);
	pp = new ProductPage(driver);
	cp = new ProductComparePage(driver);
	
}


 	@Test(priority='1')
 	public void searchProduct() throws InterruptedException
 	{
 		hp.clickonmyAccount();
 		hp.clickonLogin();
 		lp.logininAppValidcredentials("seleniumdemo@gmail.com", "123456");
 		Thread.sleep(1500);
 		sp.searchProduct("mac");
 		sp.selectproduct();
 		pp.compareproducts();
 		cp.productaddtocart();
 	}

}









