import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitlyWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");	
		 WebDriver driver	= new FirefoxDriver();
		 driver.get("https://www.naukri.com");
		 driver.manage().window().maximize();
		 WebDriverWait wait = new WebDriverWait(driver, 5000);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter mobile number']")));
		 driver.findElement(By.xpath("//input[@placeholder='Enter mobile number']")).sendKeys("3543546324");
		 Thread.sleep(5000);
		 driver.close();

	}

}
