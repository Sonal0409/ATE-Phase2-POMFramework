package com.ninjademo.aq.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
	
	@FindBy(id = "cart")
	WebElement cartbutton;
	
	@FindBy(xpath = "//button[@class='btn btn-danger btn-xs']")
	WebElement crossbutton;
	
	@FindBy(xpath="(//input[@class='form-control'])[1]")
	WebElement quantity;
	
	@FindBy(linkText="Checkout")
	WebElement checkoutbutton;
	
	public ShoppingCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void viewcart() throws InterruptedException
	{
		cartbutton.click();
		Thread.sleep(1500);
		crossbutton.click();
		
	}
	
	public void quantityChange()throws InterruptedException
	{
		quantity.clear();
		quantity.sendKeys("5");
		Thread.sleep(1500);
		checkoutbutton.click();
		
	}
	

}
