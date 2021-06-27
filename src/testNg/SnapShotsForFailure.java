package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import utility.TakeASnapShot;

public class SnapShotsForFailure {

	public WebDriver driver;
	@AfterClass
	public void close() {
		driver.quit();
	}
	
	@Test
	public void snap()
	{
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
	    driver=new FirefoxDriver();
		driver.manage().window().maximize();	
		driver.get("http://www.google.com");
		driver.findElement(By.name("qqqq")).sendKeys("Hello");
	}
	
	@AfterMethod
	public void breakDown(ITestResult result) throws Exception
	{
		if(ITestResult.FAILURE == result.getStatus())
		{
			TakeASnapShot.image(driver, result.getName());
			
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
