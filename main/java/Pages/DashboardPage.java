package Pages;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Core.Baseclass;
import Utils.CommonFunctions;

public class DashboardPage extends Baseclass {
	
	CommonFunctions comm;
	 public String Expectedscreen="Dashboard";
	

	@FindBy(xpath="//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module']")
	 
	public WebElement Actualscreen;
	

		
	public DashboardPage() {
		PageFactory.initElements(driver,this);
	}
	public void dashboardpageaasertcheck()  {
		
		Assert.assertEquals(Expectedscreen, Actualscreen, "pass");
		
		
	
		
	}
	
}
