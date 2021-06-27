package com.Testing.mycart.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utility.Intialize;


public class Call {

	public static void main(String[] args) {
		WebDriver driver=Intialize.opeApp("firefox","https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("take a break");
		driver.quit();
	

	}

}
