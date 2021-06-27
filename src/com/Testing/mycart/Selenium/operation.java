package com.Testing.mycart.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class operation {

	public static void main(String[] args) {
		//setting driver executable path
		System.setProperty("webdriver.gecko.driver",".//Drivers//geckodriver.exe");
		
//		creating object for firefoxdriver and assigning to a variable called  driver which is of WebDriver interface
		WebDriver driver=new FirefoxDriver();
		  driver.get("https://www.facebook.com");
		  
//by using getTitle method		  
		  String exp_Title="Facebook";
		 String Actual_Title=driver.getTitle();
		 
//		 comparing Actual title n expected title
		 if(exp_Title.equals(Actual_Title))
		 {
			 
			 System.out.println("both are same");
		 }
		 else {
			 System.out.println(Actual_Title);
			 System.out.println("both are not same");
		 }

		 
//	by using getCurrentUrl  method	 
		 String curl= driver.getCurrentUrl();
		 
//	by using startsWith  method
		 if(curl.startsWith("http"))
			 
		 {
			 System.out.println(curl);
			 System.out.println("both are same");
			
		 }
		 else
		 {
			 System.out.println("both are not same");
		 }
		 
//	by using endsWith  method
		 
		 if(curl.endsWith(".com"))
		 {
			 
			 System.out.println("both are same");
			
		 }
		 else
		 {
			 System.out.println("both are not same");
		 }
			driver.close(); 
		 

	}

}
