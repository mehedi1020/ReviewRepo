package utility;

import org.openqa.selenium.WebElement;

public class Helper {
	public static void typeon(WebElement element, String searchtext) {
	element.sendKeys(searchtext);	

	}
	public static void clickon (WebElement element) {
		element.click();
	}
	
	public static boolean verifyElement (WebElement element) {
		return element.isDisplayed();
	}

}
