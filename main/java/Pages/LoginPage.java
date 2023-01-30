package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Core.Baseclass;
import Utils.CommonFunctions;

public class LoginPage extends Baseclass {
	
	CommonFunctions comm;
	String username="Admin";
	String password="admin123";
	
	@FindBy(xpath="//input[@name='username']")
	WebElement username_textbox;
	@FindBy(xpath="//input[@name='password']")
	WebElement password_textbox;
	@FindBy(xpath="//button[@type='submit']")
	WebElement submit_button;
	
	public String Expectedscreen="Dashboard";
	

	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	 
	public WebElement Actualscreen;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
		
	}
	
	public void loginpageValidation() throws InterruptedException {
		
		comm=new CommonFunctions();
		comm.sendkeysOnWebelement(username_textbox, username);
		comm.sendkeysOnWebelement(password_textbox, password);
		comm.clickonWebElement(submit_button, 10);
		Thread.sleep(1000);
		System.out.println(Actualscreen);
		
	}
	
	
}

