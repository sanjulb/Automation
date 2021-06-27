import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Waits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");	
		 WebDriver driver	= new FirefoxDriver();
		 driver.get("https://www.google.com");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
//		 it will implicitly wait for few seconds
		 driver.findElement(By.cssSelector("sanju"));
		 driver.close();

	}

}
