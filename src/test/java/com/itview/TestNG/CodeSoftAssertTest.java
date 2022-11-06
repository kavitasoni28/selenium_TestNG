package com.itview.TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class CodeSoftAssertTest 
{
  WebDriver w;
  SoftAssert sft;
  
  @BeforeTest
  public void beforeTest() 
  {
	  WebDriverManager.chromedriver().setup();
	   w=new ChromeDriver(); 
  }
  
  @Test(priority=0,description="Verify the functionality",groups="login")
  public void Login()
  {
	  sft=new SoftAssert();
	  w.get("http://altoromutual.com:8080/login.jsp");
	  
	  String CurrentPageTitle=w.getTitle();
	  String CurrentPageUrl=w.getCurrentUrl();
	  String LoginPageLable=w.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]/div/h1")).getText();
	  
	  sft.assertEquals(CurrentPageTitle,"Altoro Mutual");
	  sft.assertEquals(CurrentPageUrl, "http://altoromutual.com:8080/login.jsp");
	  sft.assertTrue(LoginPageLable.contains("Login"), "Login page not contain 'Login'");
	  
	  w.findElement(By.id("uid")).sendKeys("admin");
	  w.findElement(By.id("passw")).sendKeys("admin");
	  w.findElement(By.name("btnSubmit")).click();
	  
	  sft.assertAll();
  }
  
  @Test(priority=0,description="Verify the functionality",groups="logoff")
  public void Logoff()
  {
	  sft=new SoftAssert();
	  w.get("http://altoromutual.com:8080/login.jsp");
	  
	  String currentPageTitle=w.getTitle();
	  String homePagelable=w.findElement(By.xpath("/html/body/table[2]/tbody/tr/td[2]/div/h1")).getText();
	  
	  
	  sft.assertEquals(currentPageTitle, "Altoro Mutual");
		sft.assertTrue(homePagelable.contains("Admin"), "Home page lebel doesn't contains 'Admin'");
		
		
	  w.findElement(By.linkText("Sign Off")).click();
  }
  @AfterTest
  public void afterTest()
  {
	  w.quit();
  }

}

