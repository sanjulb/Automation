import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hiddenelement {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");	
		 WebDriver driver	= new FirefoxDriver();
		 driver.get("file:///C:/Users/HP/Desktop/sanju/apps/Hidden.html");
		 driver.manage().window().maximize();
		 List<WebElement> eles=driver.findElements(By.xpath("//*[@id=\"male\"]"));
		 System.out.println(eles);
		 for(WebElement ele:eles)
		 {
			 int x=ele.getLocation().getX();
			 if(x!=0)
			 {
				 ele.click();
			 }
		 }

	}

}
