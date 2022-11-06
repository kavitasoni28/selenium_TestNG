package com.itview.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class MouseHandle {
	
	WebDriver w;
  
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  
	  w=new ChromeDriver();
	  w.manage().window().maximize();
  }

  @Test
  public void mouseHandling() {
	  Actions a = new Actions(w);
	  w.get("https://www.ebay.com/");
	
	  WebElement Electronics=w.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
	  a.moveToElement(Electronics).build().perform();
	  w.findElement(By.linkText("Apple")).click();
  }
  
  @AfterTest
  public void afterTest() {
  }

}
