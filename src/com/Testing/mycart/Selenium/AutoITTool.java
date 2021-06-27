package com.Testing.mycart.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class AutoITTool {

	public static void main(String[] args) throws SikuliException, Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");	
		 WebDriver driver	= new FirefoxDriver();
		 driver.get("C:\\Users\\HP\\Desktop\\sanju\\apps\\file.html");
		 driver.manage().window().maximize();
		 Screen screen=new Screen();
		 Pattern browse=new Pattern("C:\\Users\\HP\\Desktop\\Testing\\browse.PNG");
		 screen.click(browse);
		 
		 Runtime.getRuntime().exec("C:\\Users\\HP\\Documents\\AutoIt.exe");
		 
		 

	}

}
