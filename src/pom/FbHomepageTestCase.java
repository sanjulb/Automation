package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FbHomepageTestCase {

	public static void main(String[] args) {
		
		WebDriver driver=BaseClass.openApplication("firefox", "http://facebook.com");
		FBHomepage fbloginpage  =PageFactory.initElements(driver, FBHomepage.class);
		fbloginpage.verifyCurrentUrl();
		fbloginpage.getTitle();
		fbloginpage.verifyLogin("9108832182", "ajjayya");
		driver.quit();
		
	}

}
