
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Core.Baseclass;
import Pages.DashboardPage;
import Pages.LoginPage;


public class TestcasesExecutions extends Baseclass {
	
	LoginPage login;
	DashboardPage dashboard;
	
	@Test(priority=1)
	public void loginpageTestCase() throws InterruptedException {
		
		login=new LoginPage();
		login.loginpageValidation();
		Assert.assertEquals(login.Expectedscreen, login.Actualscreen);
		
		
	}
	@Test(dependsOnMethods  ="loginpageTestCase")
		public void dash() {
			dashboard=new DashboardPage();
			dashboard.dashboardpageaasertcheck();
		}
	
	@BeforeTest
	public void browsersetup() throws InterruptedException {
		setup();
	}
	
	@AfterTest
	public void browserteardown() {
		teardown();
	}

}
