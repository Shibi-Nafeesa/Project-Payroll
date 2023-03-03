package com.payroll.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePage {
	
	WebDriver driver;
	
	
	
	
	@BeforeMethod
	
	public void setUP(){
		
      System.setProperty("webdriver.edge.driver", "D:\\edgedriver_win64\\msedgedriver.exe");
		
	  WebDriver driver = new EdgeDriver();
	  
	  //driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	  
	  //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  driver.manage().window().maximize();
	  
	  driver.manage().deleteAllCookies();
	  
      driver.get("https://www.freecrm.com/");
      
    
	}
	
	
	
	@Test 
	
	public void verifyPagetitleTest(){
		
		String title= driver.getTitle();
		
		System.out.println("the page title is: "+ title);
		
		//Assert.assertEquals(title,"Payroll Application");
		
		Assert.assertEquals(title, "Free CRM software for any business with sales, support and customer relationship management");
	}
		
	@AfterMethod
	
	public void tearDown(){
		
		driver.quit();
		
	}
				
		
		
	}
	
	


