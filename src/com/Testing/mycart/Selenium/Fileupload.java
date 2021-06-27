package com.Testing.mycart.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Fileupload {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/HP/Desktop/sanju/apps/file.html");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//input[@name='fileupload']")).click();
		Screen screen = new Screen();
		Pattern browse = new Pattern("C:\\Users\\HP\\Desktop\\Testing\\browse.PNG");
		screen.click(browse);
		Pattern Filename = new Pattern("C:\\Users\\HP\\Desktop\\New folder\\Filename.PNG");
		screen.type(Filename, "C:\\Users\\HP\\Desktop\\New folder\\latency calc.xlsx");
		Pattern open = new Pattern("C:\\Users\\HP\\Desktop\\New folder\\open.PNG");
		screen.click(open);
		
		

	}

}
