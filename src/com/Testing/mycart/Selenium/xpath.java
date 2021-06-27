package com.Testing.mycart.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");	
		 WebDriver driver	= new FirefoxDriver();
		 driver.get("C:\\Users\\HP\\Desktop\\sanju\\apps\\file.html");
		 driver.manage().window().maximize();
		
	}

}
