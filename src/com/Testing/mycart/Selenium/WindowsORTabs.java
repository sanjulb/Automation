package com.Testing.mycart.Selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsORTabs {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");	
		 WebDriver driver	= new FirefoxDriver();
		 driver.get("https://www.naukri.com");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
//		 closes currently focused window
//		 driver.close();
		 
//		 closes all browser window
//		 driver.quit();
		 String mainwindow=driver.getWindowHandle();
		 System.out.println(mainwindow);
		 
		 Set<String> allwindows=driver.getWindowHandles();
		 System.out.println(allwindows);
		 
//		 close parent windows
		 
/*	    for(String win:allwindows)
		 {
			 if(win.equals(mainwindow))
			 {
				 driver.switchTo().window(win).close();
			 }
			 
		 }*/
		 
//		 close child window
		 
		/* for(String win:allwindows)
		 {
			 if(!win.equals(mainwindow))
			 {
				 driver.switchTo().window(win).close();
			 }
			 
		 }*/
		 
//		 close all window without using quit
		 for(String win:allwindows)
		 {
			 driver.switchTo().window(win).close();
		 }
		 
		 }
		 
		 
		 

	}


