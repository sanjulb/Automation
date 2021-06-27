package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Intialize {
	public static WebDriver driver;
	
	
	public static WebDriver opeApp(String bname,String url)
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
	driver.get(url);
	return driver;
	
	}
	

}
