package com.itview.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class WindowTab {
	WebDriver w;
  
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();		 
		 w=new ChromeDriver();
		w.manage().window().maximize();
  }
  
  @Test
  public void f() throws Exception {
	  
		w.get("https://www.flipkart.com/home-kitchen/home-appliances/washing-machines/fully-automatic-front-load~function/pr?sid=j9e%2Cabm%2C8qx&otracker=nmenu_sub_TVs%20%26%20Appliances_0_Fully%20Automatic%20Front%20Load");		
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[3]/div[1]/div[1]")).click();
		Set<String> tab=w.getWindowHandles();
		Object [] tabSplit=tab.toArray();
		
		System.out.println(tabSplit[0]);
		System.out.println(tabSplit[1]);
		
		w.switchTo().window(tabSplit[0].toString());
		System.out.println("Tab 1 title:"+w.getTitle());
		
		w.switchTo().window(tabSplit[1].toString());
		System.out.println("Tab 2 title:"+w.getTitle());
		
		w.findElement(By.id("pincodeInputId")).clear();
		w.findElement(By.id("pincodeInputId")).sendKeys("411057");
		
  }

  @AfterTest
  public void afterTest() {
  }

}
