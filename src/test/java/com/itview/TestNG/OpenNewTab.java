package com.itview.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class OpenNewTab {
	WebDriver w;
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  w=new ChromeDriver();
	  w.manage().window().maximize();
  }
  
  @Test
  public void f() throws Exception {
	  w.get("https://www.selenium.dev/");
	 w.switchTo().newWindow(WindowType.WINDOW);
	 Thread.sleep(3000);
	  w.switchTo().newWindow(WindowType.TAB);
	  Thread.sleep(3000);
  }

  @AfterTest
  public void afterTest() {
	  w.quit();
  }

}
