package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utility.TakeASnapShot;

public class TestMethodsDependancy {

	public WebDriver driver;
	
	@BeforeClass
	public void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe"); 
        driver=new FirefoxDriver();
		
	}
	@AfterClass
	public void tear_Down(){
		driver.quit();
	}
	
	
	

	@Test
	public void openApp(){
		driver.navigate().to("http://www.facebook.com");
		driver.manage().window().maximize();
		 String curl=driver.getCurrentUrl();
		 Assert.assertTrue(curl.startsWith("httpD"));
		 
	}
	@Test(dependsOnMethods="openApp")
	public void loginApp() {
		driver.findElement(By.name("email")).sendKeys("9108832182");
		driver.findElement(By.name("pass")).sendKeys("ajjayya");
		driver.findElement(By.name("login")).click();
	 boolean status	=driver.findElement(By.cssSelector("li.buofh1pr:nth-child(1) > span:nth-child(1) > div:nth-child(1) > a:nth-child(2) > span:nth-child(1) > svg:nth-child(1) > path:nth-child(1)")).isDisplayed();
	 Assert.assertEquals(status, true);
	}
	@Test(dependsOnMethods="loginApp")
	public void logoutApp() {
//		driver.findElement(By.xpath("email")).sendKeys("9108832182");
}
	@AfterMethod
	public void takeSnapofFailCases(ITestResult result) throws Exception
	{
		if(ITestResult.SKIP == result.getStatus())
		{
			TakeASnapShot.image(driver, result.getName());
			
		}
	}
}

