package com.testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.fb.pages.LoginPage;

public class FbLoginPageTestcase {

	@Test
	public void VerifyLoginFB()
	{
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com");
		LoginPage login=new LoginPage(driver);
		login.typeUsername();
		login.typePassword();
		login.clickonLoginButton();
		driver.close();
	}

}
