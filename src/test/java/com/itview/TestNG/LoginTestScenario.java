package com.itview.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginTestScenario
{
	WebDriver w;
  @BeforeTest
  public void preCondition_openBrowser() 
  {
	  WebDriverManager.chromedriver().setup();
		w = new ChromeDriver();
  }
  
  @Test(priority=0,description="Verify the functionality",groups="Login") 
  public void adminLogin()throws Exception
  {
	  w.get("http://altoromutual.com:8080/login.jsp");
	  w.findElement(By.id("uid")).sendKeys("admin");
	  w.findElement(By.id("passw")).sendKeys("admin");
	  w.findElement(By.name("btnSubmit")).click();
	  w.findElement(By.linkText("Sign Off")).click();
 }
  
  @Test(priority=1,description="Verify the function",groups="LoginHRM") 
  public void orangeHRM()throws Exception
  {
	  w.get("http://altoromutual.com:8080/login.jsp");
	  w.findElement(By.id("uid")).sendKeys("admin");
	  w.findElement(By.id("passw")).sendKeys("admin");
	  w.findElement(By.name("btnSubmit")).click();
	  w.findElement(By.linkText("Sign Off")).click();
 }

  @AfterTest
  public void afterTest() 
  {
	  w.quit();
  }

}
