package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parallelTesting {
public static WebDriver driver;
	
	@Test
	@Parameters("browser")
	public static void opeApp(String bname)
	{
	if(bname.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		  driver=new FirefoxDriver();
	}
	if(bname.equalsIgnoreCase("chrome"))
	{
		System. setProperty ("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
	
	}
	if(bname.equalsIgnoreCase("edge"))
	{
		System.setProperty("webdriver.edge.driver", ".\\Drivers\\msedgedriver.exe");
		 driver=new EdgeDriver();
	
	}
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	String Title=driver.getTitle();
	System.out.println(Title);
	driver.close();
	}
	


}
