import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Validations {

	public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");	
	 WebDriver driver	= new FirefoxDriver();
	 driver.get("https://crowdsprint.com/client-signup/");
	 driver.manage().window().maximize();
	  boolean status=driver.findElement(By.xpath("//*[@id=\"termsOfService\"]")).isSelected();
      System.out.println(status);
      if(status==true)
      {
    	 System.out.println(" selected");
    	
    	 
      }
      else
      {
    	  System.out.println("not selected");
      }
      boolean status1= driver.findElement(By.xpath("//*[@id=\"termsOfService\"]")).isEnabled();
      System.out.println(status1);
      driver.findElement(By.xpath("//*[@id=\"termsOfService\"]")).click();
      boolean status2= driver.findElement(By.xpath("//*[@id=\"termsOfService\"]")).isDisplayed();
      System.out.println(status2);
      driver.close();
	}

}
