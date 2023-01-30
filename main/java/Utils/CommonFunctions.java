package Utils;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Core.Baseclass;

public class CommonFunctions extends Baseclass {
	
	WebDriverWait wait;
	
	public void sendkeysOnWebelement(WebElement element,String text) {
		
		element.clear();
		element.click();
		element.sendKeys(text);
		
		
	}
	public void clickonWebElement(WebElement element,long timeInSeconds) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
		element=wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		
	}
	

	

}
