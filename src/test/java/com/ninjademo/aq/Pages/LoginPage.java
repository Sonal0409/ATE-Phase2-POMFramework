package com.ninjademo.aq.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(id="input-email")
	WebElement email;
	
	@FindBy(id="input-password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbutton;
	
	@FindBy(xpath="//*[@id=\"account-login\"]/div[1]/text()")
	WebElement errormessage;
	
	@FindBy(linkText="Forgotten Password")
	WebElement forgetpasswd;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void logininAppValidcredentials(String emailid, String passwd)
	{
		email.sendKeys(emailid);
		password.sendKeys(passwd);
		loginbutton.click();
	}

	public void loginwithInvalidCredentaials(String emailid, String passwd) throws InterruptedException
	{
		email.sendKeys(emailid);
		password.sendKeys(passwd);
		loginbutton.click();
		Thread.sleep(1500);
		//String text = errormessage.getText();
		//System.out.println(text);
	}
	
	public void forgetpasswordlink()
	{
		forgetpasswd.click();
	}

	
}



