package com.Testing.mycart.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Internet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", ".\\Drivers\\IEDriverServer.exe");
		 WebDriver driver=new InternetExplorerDriver();
		 driver.get("https://www.facebook.com");
		 driver.close();
	}

}
