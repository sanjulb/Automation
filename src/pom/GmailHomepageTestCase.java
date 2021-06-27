package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

	public class GmailHomepageTestCase {

		public static void main(String[] args) throws Exception {
			
			
			WebDriver driver=BaseClass.openApplication("chrome", "http://google.com");
			GmailHomePageClick gmailloginpage  =PageFactory.initElements(driver, GmailHomePageClick.class);
			gmailloginpage.verifyCurrentUrl();
			gmailloginpage.getTitle();
			gmailloginpage.gmailclick();
			Gmaillogin gmaillogin  =PageFactory.initElements(driver, Gmaillogin.class);
			gmaillogin.typeusername();
			gmaillogin.typenextButton();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			gmaillogin.typepassword();
			gmaillogin.typenextButton1();
			SendingMail sendmail=PageFactory.initElements(driver, SendingMail.class);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			sendmail.writingMail();
			

		}

	}


