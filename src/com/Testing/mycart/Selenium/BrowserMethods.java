package com.Testing.mycart.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		try {
			WebDriver driver = new FirefoxDriver();
			System.out.println("Firefoxwindow will open");
			driver.get("https://www.facebook.com");
			System.out.println("Facebooklogin page window will open");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			driver.navigate().to("https://www.google.com");
			Thread.sleep(5000);
			driver.navigate().forward();
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);
			WebElement Username =driver.findElement(By.name("email"));
					Username.sendKeys("new");
			WebElement Password=driver.findElement(By.name("pass"));
			Password.sendKeys("new");
			driver.findElement(By.name("login")).click();
			Thread.sleep(5000);
			
			driver.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
