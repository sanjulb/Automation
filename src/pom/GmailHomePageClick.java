package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class GmailHomePageClick {
	public WebDriver driver;
//	constructor
	public GmailHomePageClick(WebDriver driverl) {
		this.driver=driverl;
		}
//	Repository
	@FindBy(how=How.XPATH,using="//*[@id=\"gb\"]/div/div[2]/a")
	WebElement signin;
	
	
	
	
	
//	Actions or methods
	public void verifyCurrentUrl()
	{
		String curl=driver.getCurrentUrl();
		System.out.println(curl);

	}
	public void getTitle()
	{
	        String Title=driver.getTitle();
	        System.out.println(Title);
	}
	public void gmailclick() throws Exception {
		
		signin.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
//		Screen screen = new Screen();
//		Pattern signin = new Pattern("C:\\Users\\HP\\Desktop\\New folder\\signin.PNG");
//		screen.click(signin);
//		
//		driver.findElement(By.xpath("/html/body/div/header/div/div/ul/li[2]/a"));
		
		
	}

}
