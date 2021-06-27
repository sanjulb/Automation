import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.get("https://in.yahoo.com/?p=us&guccounter=1");
	}

}
