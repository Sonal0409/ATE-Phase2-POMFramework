package com.ninjademo.aq.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	@FindBy(id="input-firstname")
	WebElement firstname;
	

	@FindBy(id="input-lastname")
	WebElement lastname;
	

	@FindBy(id="input-email")
	WebElement emailid;
	

	@FindBy(id="input-telephone")
	WebElement phone;
	

	@FindBy(id="input-password")
	WebElement passwd;
	

	@FindBy(id="input-confirm")
	WebElement confirmpasswd;
	
	@FindBy(name="agree")
	WebElement agreecheckbox;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continuebutton;
	
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void RegisterUser(String firstname1,String lastname1, String emailid1,String phone1,String passwd1,String confirmpasswd1)
	{
		firstname.clear();
		firstname.sendKeys(firstname1);
		lastname.clear();
		lastname.sendKeys(lastname1);
		emailid.clear();
		emailid.sendKeys(emailid1);
		phone.clear();
		phone.sendKeys(phone1);
		passwd.clear();
		passwd.sendKeys(passwd1);
		confirmpasswd.clear();
		confirmpasswd.sendKeys(confirmpasswd1);
		agreecheckbox.click();
		continuebutton.click();
	}

}
