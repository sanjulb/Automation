package com.Testing.mycart.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		try {
			WebDriver driver = new FirefoxDriver();
			System.out.println("glassdoor will open");
			driver.get("https://www.glassdoor.co.in");
			System.out.println("glassdoor page window will open");
//			driver.findElement(By.cssSelector("button.d-none")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/article/header/nav/div[2]/div/div/div/button")).click();
			Thread.sleep(1000);
			driver.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
