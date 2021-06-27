package com.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.fb.pages.InstagramLogin;

public class InstagramLoginTestcases {
	@Test
	public void verifyInstagramLogin() throws Exception
	{
		System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://www.instagram.com");
		InstagramLogin login=new InstagramLogin(driver);
		login.typeUsername();
		login.typePassword();
		login.clickonLoginButton();
		Thread.sleep(5000);
		driver.close();
	}

}
