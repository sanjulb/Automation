package com.Testing.mycart.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", ".//Drivers//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(5000);
		driver.navigate().refresh();
		driver.findElement(By.name("email")).sendKeys("hai");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("hai");
		driver.findElement(By.id("email")).clear();
		
		driver.close();
		
		

	}

}

