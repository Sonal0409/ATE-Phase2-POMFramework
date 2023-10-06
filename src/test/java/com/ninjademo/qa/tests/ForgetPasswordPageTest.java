package com.ninjademo.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ninjademo.aq.Pages.ForgetPasswordPage;
import com.ninjademo.aq.Pages.HomePage;
import com.ninjademo.aq.Pages.LoginPage;
import com.ninjademo.qa.base.TestBase;

public class ForgetPasswordPageTest extends TestBase{
	
	HomePage hp ;
	LoginPage lp;
	ForgetPasswordPage fp;
	
		@BeforeMethod
		public void OpenApp()
		{
			OpenBrowser("Chrome");
			hp = new HomePage(driver);
			lp = new LoginPage(driver);
			fp = new ForgetPasswordPage(driver);
		}
		
		@Test
		public void forgetpasswordCheck()
		{
			hp.clickonmyAccount();
			hp.clickonLogin();
			lp.forgetpasswordlink();
			fp.forgetpasswordCheck();
		}

		@AfterMethod
		public void closebrowser()
		{
			driver.close();
		}
}
