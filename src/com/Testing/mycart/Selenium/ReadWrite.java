package com.Testing.mycart.Selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadWrite {

	public static void main(String[] args) throws Exception {
		FileInputStream f = new FileInputStream("C:\\Users\\HP\\Desktop\\New folder\\Excel.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet ws = wb.getSheetAt(0);
		String Username=ws.getRow(1).getCell(0).getStringCellValue();
          System.out.println(Username);
          
          String Password=ws.getRow(1).getCell(1).getStringCellValue();
          System.out.println(Password);
          
         System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe"); 
         WebDriver driver=new FirefoxDriver();
         driver.get("https://www.facebook.com");
         driver.manage().window().maximize();
         
         Thread.sleep(5000);
         driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9108832182");
         driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(Password);
         driver.findElement(By.xpath("//*[@name=\"login\"]")).click();
         
         Thread.sleep(10000);
         String exp_Title="Facebook ಗೆ ಲಾಗಿನ್ ಮಾಡಿ";
		 String Actual_Title=driver.getTitle();
//		 String exp_Title=new String(Actual_Title);
		 System.out.println(Actual_Title);

//       WebElement Alert= driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[2]/div[2]/form/div/div[1]/div[2]"));
       if(exp_Title.equals(Actual_Title)) {
             System.out.println("Invalid data");
        	 ws.getRow(1).createCell(2).setCellValue("Fail");
        	 driver.close();
        	 }
         else {
        	  ws.getRow(1).createCell(2).setCellValue("Pass");
        	 System.out.println("Login success");
        	 driver.close();
        	 }
         FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\Desktop\\New folder\\Excel.xlsx");
         wb.write(fos);
         wb.close();
         f.close();
	}

}
