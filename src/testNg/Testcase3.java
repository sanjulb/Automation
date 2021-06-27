package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase3 {
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
	public void Testcase3() {
		driver.get("https://crowdsprint.com/client-signup/");
		 driver.manage().window().maximize();
		  boolean status=driver.findElement(By.xpath("//*[@id=\"termsOfService\"]")).isSelected();
	      System.out.println(status);
	      if(status==true)
	      {
	    	 System.out.println(" selected");
	    	
	    	 
	      }
	      else
	      {
	    	  System.out.println("not selected");
	      }
	      System.out.println("Testcase3 executed successfully");
	}


}
