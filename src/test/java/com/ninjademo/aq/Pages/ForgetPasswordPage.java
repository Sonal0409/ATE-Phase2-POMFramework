package com.ninjademo.aq.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ninjademo.qa.base.TestBase;

public class ForgetPasswordPage extends TestBase{
	
	@FindBy(id="input-email")
	WebElement email;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement continuebutton;
	
	public ForgetPasswordPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void forgetpasswordCheck()
	{
		email.sendKeys("seleniumdemo@gmail.com");
		continuebutton.click();
	}

}
