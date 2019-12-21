package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class ProductDetail {
	
	WebDriver driver;
	String searchtext ="toy for kids";
	public ProductDetail(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "proceedToCheckOut xpath")WebElement proceedToCheckOut;
	
	public SignInPage clickonProceedtoCheckout () {
		Helper.clickon(proceedToCheckOut);
		return new SignInPage(driver);
	}

}
