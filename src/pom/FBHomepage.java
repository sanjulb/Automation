package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FBHomepage {
	
	public WebDriver driver;
//	constructor
	public FBHomepage(WebDriver driverl) {
		this.driver=driverl;
		}
	
//	Repository
//	By userName=By.name("email");
	@FindBy(name="email")WebElement username;
	@FindBy(name="pass")WebElement password;
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	WebElement loginbutton;
	
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
	public void verifyLogin(String un ,String pwd) {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbutton.click();
		
	}
	

}
