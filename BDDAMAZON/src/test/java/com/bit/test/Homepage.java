package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Helper;

public class Homepage {
	WebDriver driver;
	String searchtext ="toy for kids";
	public Homepage(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "search")WebElement searchbox;
	@FindBy(xpath = "searchbuttonXpath")WebElement searchbutton;
	@FindBy(xpath = "firstProduct xpath") WebElement firstproduct;
	@FindBy(xpath = "add to cart button xpath")WebElement addtocartButton;
	public void typeonsearchbox() {
		// driver.findElement(By.xpath("search")).sendKeys("toys for kids");
	   Helper.typeon(searchbox, searchtext);
	}
	
	public void clickOnsearchButton() {
		Helper.clickon(searchbutton);	
	}
	
	public void clickOnFirstProduct() {
		Helper.clickon(firstproduct);
	}
	public ProductDetail clickaddToCartButton() {
		Helper.clickon(addtocartButton);
		return new ProductDetail(driver);
	}

}
