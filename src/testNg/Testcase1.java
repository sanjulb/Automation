package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase1 {
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
	public void Testcase1() {
		driver.get("https://www.facebook.com");
		 String exp_Title="Facebook";
		 String Actual_Title=driver.getTitle();
		 if(exp_Title.equals(Actual_Title))
		 {
			 
			 System.out.println("both are same");
		 }
		 else {
			 System.out.println(Actual_Title);
			 System.out.println("both are not same");
		 }
		 System.out.println("Testcase1 executed successfully");
		 
	}
	
}
