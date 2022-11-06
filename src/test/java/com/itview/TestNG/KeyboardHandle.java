package com.itview.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class KeyboardHandle {
	 WebDriver w;
	 
	 
  @BeforeTest
  public void code_KeyboardHandle() {
	 
	  WebDriverManager.chromedriver().setup();
	  w=new ChromeDriver();
	  w.manage().window().maximize();
	 
	  
  }
  
  @Test
  public void f() throws Exception {
	  
	  Actions a = new Actions(w);
	  w.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
       w.findElement(By.id("firstName")).clear();
       w.findElement(By.id("firstName")).sendKeys("reyanshs");
       
       Thread.sleep(3000);
       
       a.sendKeys(Keys.BACK_SPACE).build().perform();
       a.sendKeys(Keys.TAB).build().perform();
       w.findElement(By.id("lastName")).clear();
       w.findElement(By.id("lastName")).sendKeys("soni");
       a.sendKeys(Keys.TAB).build().perform();
       w.findElement(By.id("username")).clear();
       w.findElement(By.id("username")).sendKeys("reyanshs123");
       a.sendKeys(Keys.TAB).build().perform();
       w.findElement(By.name("Passwd")).clear();
       w.findElement(By.name("Passwd")).sendKeys("abc12345");
       a.sendKeys(Keys.TAB).build().perform();
       w.findElement(By.name("ConfirmPasswd")).clear();
       w.findElement(By.name("ConfirmPasswd")).sendKeys("abc12345");
       a.sendKeys(Keys.ENTER).build().perform();
       w.findElement(By.xpath("//*[@id=\"accountDetailsNext\"]/div/button/span")).click();
       
       
       
  }
  

  @AfterTest
  public void afterTest() {
	  w.quit();
  }

}
