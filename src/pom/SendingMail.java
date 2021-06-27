package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SendingMail {
	
		public WebDriver driver;
//		constructor
		public SendingMail(WebDriver driverl) {
			this.driver=driverl;
			}
		
		public void writingMail() throws Exception
		{
			Screen screen = new Screen();
			Pattern compose = new Pattern("C:\\Users\\HP\\Desktop\\New folder\\compose.PNG");
			screen.click(compose);
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Pattern To = new Pattern("C:\\Users\\HP\\Desktop\\New folder\\To.PNG");
			screen.type(To, "sanjulb1998@gmail.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Pattern subject = new Pattern("C:\\Users\\HP\\Desktop\\New folder\\Subject.PNG");
			screen.type(subject, "writing mail");
			Pattern body = new Pattern("C:\\Users\\HP\\Desktop\\New folder\\Body.PNG");
			screen.type(body, "hai");
			Pattern send = new Pattern("C:\\Users\\HP\\Desktop\\New folder\\send.PNG");
			screen.click(send);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			
			
		}
		
}	
		
