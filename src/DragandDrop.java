import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");	
		 WebDriver driver	= new FirefoxDriver();
		 driver.get("https://jqueryui.com/droppable/");
		 driver.manage().window().maximize();
		 Actions dd= new Actions(driver);
		  WebElement ele =driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/iframe"));
		  driver.switchTo().frame(ele);
		WebElement Source = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement target=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
        dd.dragAndDrop(Source, target).perform();
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/aside/div/a/img")).click();
	}

}
