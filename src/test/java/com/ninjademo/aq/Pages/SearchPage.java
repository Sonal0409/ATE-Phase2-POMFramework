package com.ninjademo.aq.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	@FindBy(name="search")
	WebElement searchbox;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	WebElement searchButton;
	
	@FindBy(linkText = "iMac")
	WebElement product;
	
	@FindBy(xpath = "(//div[@class='button-group'])[1]/descendant::button[1]")
	WebElement addtocart;
	
	@FindBy(linkText = "Add to Cart")
	WebElement addtowishlist;
	
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void searchProduct(String product)
	{
		searchbox.sendKeys(product);
		searchButton.click();
	}
	
	public void selectproduct()
	{
		product.click();
	}
	
	public void selectaddtocart()
	{
		addtocart.click();
		
	}
	public void selectaddtowishlist()
	{
		addtowishlist.click();
		
	}
	

}
