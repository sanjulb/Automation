import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class New {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		Actions dd=new Actions(driver);
	  WebElement ele =driver.findElement(By.cssSelector(".midSec > li:nth-child(6) > a:nth-child(1) > div:nth-child(2)"));
            dd.moveToElement(ele).perform();
	}

}
