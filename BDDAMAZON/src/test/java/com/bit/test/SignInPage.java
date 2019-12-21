package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class SignInPage {
	
	WebDriver driver;
	String searchtext ="toy for kids";
	public SignInPage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "Signin Xpath")WebElement signIn;
	
	public void verifySignInPage () {
		boolean b = Helper.verifyElement(signIn);
		if(b) {
			System.out.println("user is at sing page");
		}else {
			System.out.println("user is not at sing page");
		}
	}

}
