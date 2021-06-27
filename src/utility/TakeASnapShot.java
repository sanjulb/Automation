package utility;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;



public class TakeASnapShot {
	public static WebDriver driver;
	
	public static void image(WebDriver driver,String imgName) throws Exception
	{
		TakesScreenshot tss=(TakesScreenshot) driver;
		 File src=tss.getScreenshotAs(OutputType.FILE);//tool
		 FileUtils.copyFile(src,new File("./Image/"+imgName+".png"));
//		                                .Images/fbHomePage.png
		
	}
	

}
