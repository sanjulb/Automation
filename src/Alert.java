import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");	
		 WebDriver driver	= new FirefoxDriver();
		 driver.get("file:///C:/Users/HP/Desktop/sanju/apps/answerOnNextPrompt.html.html");
		 driver.manage().window().maximize();
driver.findElement(By.xpath("//a[text()=' Click here to enter your name ']")).click();
 String text= driver.switchTo().alert().getText();
 System.out.println(text);
//driver.switchTo().alert().dismiss();
driver.switchTo().alert().sendKeys("sanju");
driver.switchTo().alert().accept();

	}

}
