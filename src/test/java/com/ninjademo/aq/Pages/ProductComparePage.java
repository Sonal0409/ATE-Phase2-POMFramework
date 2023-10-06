package com.ninjademo.aq.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class ProductComparePage {
	
	@FindBy(xpath="//input[@value='Add to Cart']")
	WebElement addtocartbutton;
	
	
	public ProductComparePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void productaddtocart()
	{
		addtocartbutton.click();
	}



}
