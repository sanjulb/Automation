package com.fb.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InstagramLogin {
	WebDriver driver;
	
	By username = By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input");
	By password = By.name("password");
	By loginButton=By.name("login");
	
//	constructor
	public InstagramLogin(WebDriver driverl)
	{
		this.driver=driverl;
	}
	//Actions or methods	
		public void typeUsername()
		{
			
			driver.findElement(username).sendKeys("sanju_lb");
			
		}
		public void typePassword()
		{
			driver.findElement(password).sendKeys("123");
			
		}
		public void clickonLoginButton()
		{
			driver.findElement(loginButton).click();
		}
		
		

}
