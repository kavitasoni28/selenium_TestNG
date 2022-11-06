package com.itview.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class HardAssertCode {
	
  WebDriver w;
  
  @BeforeTest
  public void beforeTest()
  {
	  WebDriverManager.chromedriver().setup();
	  w=new ChromeDriver();
	  
  }
  
  @Test(priority=0,description="Verify the Login page",groups="Login")
  public void Login() throws Exception 
  {
	  w.get("http://hospitalnew.bdtask.com/demo6/login");
	  
	 
	  String currentURL=w.getCurrentUrl();
	 String currentPageTitle = w.getTitle();
	Assert.assertEquals(currentPageTitle, "Log In-Demo Hospital Limited");
	  
	  w.findElement(By.name("email")).sendKeys("admin@demo.com");
	  w.findElement(By.name("password")).sendKeys("12345");
	 Select UserRole=new Select( w.findElement(By.xpath("//*[@id=\"user_role\"]")));
	 UserRole.selectByVisibleText("Admin");
	 UserRole.selectByIndex(1);
	 Thread.sleep(3000);
	  w.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
	  
  }

  @AfterTest
  public void afterTest() 
  {
	  //w.quit();
  }

}
