
package com.Testing.mycart.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.TakeASnapShot;

public class Crome {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System. setProperty ("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
		TakeASnapShot.image(driver, "FbHomepage");
		//cssselector using id attribute 
//		driver.findElement(By.cssSelector("input#email")).sendKeys("hai");
		//cssselector using class attribute
//		driver.findElement(By.cssSelector("input.inputtext _55r1 _6luy")).sendKeys("hai");
		//cssselector using single attribute
//		driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("hai");
		//cssselector using Starts with
//		driver.findElement(By.cssSelector("input[aria-label^='Email address']")).sendKeys("hai");
//		using xpath
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("by using xpath");
//		driver.findElement(By.xpath("//input[@class='inputtext _55r1 _6luy']")).sendKeys("using xpath by class attibute");
//		driver.findElement(By.xpath("input[@name='email']")).sendKeys("using xpath by name attibute");
		driver.close();
		

	}

}
