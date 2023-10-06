package com.ninjademo.qa.tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ninjademo.aq.Pages.HomePage;
import com.ninjademo.aq.Pages.LoginPage;
import com.ninjademo.aq.Pages.ProductPage;
import com.ninjademo.aq.Pages.RegisterPage;
import com.ninjademo.aq.Pages.SearchPage;
import com.ninjademo.qa.base.TestBase;


public class RegisterPageTest extends TestBase {
	
HomePage hp ;
RegisterPage rp;

@BeforeMethod
public void OpenApp()
{
	OpenBrowser("Chrome");
	hp = new HomePage(driver);
	rp = new RegisterPage(driver);
	
}

@Test(priority='1',dataProvider = "testdata")

public void RegisterUser(String firstname1,String lastname1, String emailid1,String phone1,String passwd1,String confirmpasswd1 )
{
	hp.clickonmyAccount();
	hp.clickonRegister();
	rp.RegisterUser(firstname1, lastname1, emailid1, phone1, passwd1, confirmpasswd1);
}


@DataProvider(name="testdata")
public Object[][] datasupplier()
{
	Object input[][]= Xls_DataProvider.getTestData("Sheet1");
	return input;
}
}
