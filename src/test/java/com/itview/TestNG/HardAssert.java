package com.itview.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class HardAssert 
{
  WebDriver w;
  
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	   w=new ChromeDriver(); 
  }
  
  @Test(priority=0,description="Verify the functionality",groups="login")
  public void Login()
  {
	  w.get("http://altoromutual.com:8080/login.jsp");
	  
	  String CurrentPageTitle=w.getTitle();
	  String CurrentPageUrl=w.getCurrentUrl();
	  String LoginPageLable=w.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/h1")).getText();
	  
	  Assert.assertEquals(CurrentPageTitle,"Altoro Mutual");
	  Assert.assertEquals(CurrentPageUrl, "http://altoromutual.com:8080/login.jsp");
	  Assert.assertTrue(LoginPageLable.contains("Login"), "Login page not contain 'Login'");
	  
	  w.findElement(By.id("uid")).sendKeys("admin");
	  w.findElement(By.id("passw")).sendKeys("admin");
	  w.findElement(By.name("btnSubmit")).click();
  }
  
  @Test(priority=0,description="Verify the functionality",groups="logoff")
  public void Logoff()
  {
	  w.get("http://altoromutual.com:8080/login.jsp");
	  
	  String currentPageTitle=w.getTitle();
	  String homePagelable=w.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/div/h1")).getText();
	  
	  
	  Assert.assertEquals(currentPageTitle, "Altoro Mutual");
		Assert.assertTrue(homePagelable.contains("Admin"), "Home page lebel doesn't contains 'Admin'");
		
		
	  w.findElement(By.linkText("Sign Off")).click();
  }
  @AfterTest
  public void afterTest()
  {
	  w.quit();
  }

}
