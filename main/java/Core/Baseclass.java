package Core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;





public class Baseclass {
	public static WebDriver driver;
	String Url="https://opensource-demo.orangehrmlive.com";
	public void setup() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		
		driver= new ChromeDriver();
		driver.get(Url);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
	}
	public void teardown() {
		driver.quit();
	}
	
	
	
	

}
