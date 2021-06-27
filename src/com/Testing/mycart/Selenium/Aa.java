package com.Testing.mycart.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class Aa {
	public static void main(String[] args) throws SikuliException {
		// TODO Auto-generated method stub
		System. setProperty ("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Desktop/sanju/apps/file.html");
		driver.manage().window().maximize();
		Screen screen =new Screen();
		Pattern bb= new Pattern("C:\\Users\\HP\\Desktop\\New folder\\Screenshot.PNG");
		 screen.click(bb);
}
}