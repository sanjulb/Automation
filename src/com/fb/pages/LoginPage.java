package com.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
//	Repository
	
	By username=By.name("email");
	By password=By.name("pass");
	By loginButton=By.name("login");
	
	
//	constructor
	public LoginPage(WebDriver driverl)
	{
		this.driver=driverl;
	}
	
//Actions or methods	
	public void typeUsername()
	{
		driver.findElement(username).sendKeys("9108832182");
	}
	public void typePassword()
	{
		driver.findElement(password).sendKeys("ajjayya");
	}
	public void clickonLoginButton()
	{
		driver.findElement(loginButton).click();
	}
	

}
