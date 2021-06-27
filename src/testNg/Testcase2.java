package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testcase2 {
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
		public void Testcase2() throws Exception {
			driver.get("https://jqueryui.com/droppable/");
			 driver.manage().window().maximize();
			 JavascriptExecutor jse=(JavascriptExecutor)driver;
			 jse.executeScript("window.scrollBy(0,500)");
			 Thread.sleep(5000);
			  Actions dd= new Actions(driver);
			  
			  WebElement ele =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/iframe"));
			  driver.switchTo().frame(ele);
			WebElement Source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
			WebElement target=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
	        dd.dragAndDrop(Source, target).perform();
	        driver.switchTo().defaultContent();
//	        Assert.assertEquals(false, true);
	        System.out.println("Testcase2 executed successfully");
			
		}

	}
