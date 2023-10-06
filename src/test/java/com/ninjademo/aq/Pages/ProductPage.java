package com.ninjademo.aq.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	@FindBy(xpath="(//button[@class='btn btn-default'])[2]")
	WebElement comparebutton;
	
	@FindBy(linkText="product comparison")
	WebElement compareproductlink;
	
	public ProductPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void compareproducts() throws InterruptedException
	{
		comparebutton.click();
		Thread.sleep(1500);
		compareproductlink.click();
	}

}
