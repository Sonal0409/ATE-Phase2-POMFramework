package com.ninjademo.qa.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ninjademo.aq.Pages.HomePage;
import com.ninjademo.aq.Pages.LoginPage;
import com.ninjademo.qa.base.TestBase;

public class LoginPageTest extends TestBase {
	
HomePage hp ;
LoginPage lp;
	
	@BeforeMethod
	public void OpenApp()
	{
		OpenBrowser("Chrome");
		hp = new HomePage(driver);
		lp = new LoginPage(driver);
	}
	
	@Test(priority='1')
	public void loginValidCredentials() throws InterruptedException
	{
		hp.clickonmyAccount();
		hp.clickonLogin();
		lp.logininAppValidcredentials("seleniumdemo@gmail.com", "123456");
		Thread.sleep(1500);
		
	}
	

	@Test(priority=2)
	public void loginInvalidCredentials() throws InterruptedException
	{
		hp.clickonmyAccount();
		hp.clickonLogin();
		lp.loginwithInvalidCredentaials("demo123@gmail.com", "demo1");
	}
	
	@Test(priority=3)
	public void forgetpasswordtest() throws InterruptedException
	{
		hp.clickonmyAccount();
		hp.clickonLogin();
		lp.forgetpasswordlink();
		Thread.sleep(1500);
	}
	
	@AfterMethod
	public void CloseBrowser()
	{
		driver.close();
	}

}
