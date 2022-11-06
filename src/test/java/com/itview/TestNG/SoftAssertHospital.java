package com.itview.TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class SoftAssertHospital {
	
	WebDriver w;
	SoftAssert sft;
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  w = new ChromeDriver();
	  
  }
  
  @Test(priority=0,description="Verify the Login page",groups="Login")
  public void f() throws Exception {
	  sft=new SoftAssert();
	  
	  w.get("http://hospitalnew.bdtask.com/demo6/login");
	  
	  String currentPageTitle=w.getTitle();
	  String currentURL=w.getCurrentUrl();
	  String loginPageLable=w.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[2]/h3")).getText();
	  sft.assertEquals(currentPageTitle,"Log In - Demo Hospital Limited");
	  sft.assertEquals(currentURL, "http://hospitalnew.bdtask.com/demo6/login");
	  sft.assertEquals(loginPageLable,"Demo Hospital Limited");
	  
	  w.findElement(By.name("email")).sendKeys("admin@demo.com");
	  w.findElement(By.name("password")).sendKeys("12345");
	 Select UserRole=new Select( w.findElement(By.xpath("//*[@id=\"user_role\"]")));
	 UserRole.selectByVisibleText("Admin");
	 UserRole.selectByIndex(1);
	 Thread.sleep(3000);
	  w.findElement(By.xpath("//*[@id=\"loginForm\"]/div[4]/button")).click();
	  Select Department=new Select(w.findElement(By.linkText("/html/body/div[3]/aside/div/ul/li[2]/a")));
			  Department.selectByVisibleText("Add Department");
			  Department.selectByIndex(1);
	  
	  sft.assertAll();
  }

  @AfterTest
  public void afterTest() {
	 // w.quit();
  }

}
