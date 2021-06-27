package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Gmaillogin {
	public WebDriver driver;
//	constructor
	public Gmaillogin(WebDriver driverl) {
		this.driver=driverl;
		}

	//Repository
		By username= By.cssSelector("#identifierId");
		By nextButton= By.cssSelector("#identifierNext > div > button > span");
		By password = By.name("password");
		By nextButton1= By.cssSelector("#passwordNext > div > button > span");
		
	
	
	

	
		public void typeusername()
		{
			driver.findElement(username).sendKeys("sanjanatest321@gmail.com");
		}
		
		public void typenextButton()
		{
			driver.findElement(nextButton).click();
		}
		
		public void typepassword()
		{
			driver.findElement(password).sendKeys("9108832182");
		}
		
		public void typenextButton1()
		{
			driver.findElement(nextButton1).click();
			driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
			
		}
	}

	
	


