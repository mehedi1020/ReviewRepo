package com.bit.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
	WebDriver driver;
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/mdmehedihasan/Downloads/chromedriver");
		 driver = new ChromeDriver();
		
	}
	public Homepage geturl() {
		driver.get("http://www.amazon.com/");//this method takes us to homepage
		//so we will re
		return new Homepage(driver);
	}

}
