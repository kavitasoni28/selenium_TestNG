package com.itview.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class OrangeHRM {
	WebDriver w;
  @BeforeTest
  public void orangeHRM() throws Exception
  {
	  WebDriverManager.chromedriver().setup();
		w = new ChromeDriver();
  }
  
  @Test(priority=0,description="verify the login functionility",groups="HRM")
  public void HRM_Login()
  {
	  w.get("https://opensource-demo.orangehrmlive.com/");
	  w.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		w.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		w.findElement(By.cssSelector("button[type='submit']")).click();
		w.findElement(By.cssSelector("span[class='oxd-userdropdown-tab']")).click();
  }

  @AfterTest
  public void postCondition() 
  {
	  w.quit();
  }

}
