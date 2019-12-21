package com.bit.test;

import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AmazonShoppingStepDefination {
	WebDriver driver;
	BaseTest basetest;
	Homepage homepage;
	ProductDetail productdetailpage;
	SignInPage signinPage;
	 
@Given("^open chrome browser$")
public void open_chrome_browser() throws Throwable {
	
  BaseTest basetest = new BaseTest();
  basetest.openbrowser();
}

@Given("^nevigate to url$")
public void nevigate_to_url() throws Throwable {
	homepage =  basetest.geturl();//new homepage();
   
}

@When("^user search toy in search text box$")
public void user_search_toy_in_search_text_box() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    //driver.findElement(By.xpath("search")).sendKeys("toys for kids");
	homepage.typeonsearchbox();
}

@When("^user click search button$")
public void user_click_search_button() throws Throwable {
	homepage.clickOnsearchButton();
	
}

@When("^user click on first product$")
public void user_click_on_first_product() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//driver.findElement(By.xpath("1st product")).click();
	homepage.clickOnFirstProduct();
}

@When("^user click on add to cart button$")
public void user_click_on_add_to_cart_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//driver.findElement(By.xpath("add to cart button")).click();
	productdetailpage=homepage.clickaddToCartButton();
}

@When("^user click on proceed to checkout button$")
public void user_click_on_proceed_to_checkout_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//driver.findElement(By.xpath("chack button")).click();
	signinPage=productdetailpage.clickonProceedtoCheckout();
}

@Then("^user should see sign in page$")
public void user_should_see_sign_in_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	signinPage.verifySignInPage();
	
	
	
}


}
