package com.itview.TestNG;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class WebObjectTest {
	
	WebDriver w;
  
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	   w=new ChromeDriver();
  }
  
  @Test(priority=0,description="Testcase to handle text field")
  public void handleTextField() throws Exception 
  {
	  w.get("https://demo.automationtesting.in/Register.html");
	  w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).clear();
	  w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("reyansh");
	  
	  w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).clear();
	  w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("soni");
	  Thread.sleep(3000);
	  w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).clear();
	  w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("210-Sonigara");
	  
	  w.findElement(By.xpath("//*[@id=\"eid\"]/input")).clear();
	  w.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("Kavita2@gmail.com");
	  
	  w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).clear();
	  w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("1232443454");
	  
  }
  @Test(priority = 1,description = "Test case to handle radiobutton and checkbox")
	public void handleRadiobuttonCheckbox() {
	  
	  w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]")).click();
	  w.findElement(By.id("checkbox1")).click();
	  w.findElement(By.id("checkbox2")).click();
	  
	 // WebElement langdropdown=w.findElement(By.id("msdd"));
	 // Select sel=new Select(langdropdown);
	 // sel.selectByVisibleText("Hindi");
	  
  }
  
  @Test(priority = 2,description = "Test case to handle DropDown List")
	public void handleDropDownList() {
	  
	  WebElement dropdown=w.findElement(By.id("Skills"));
	  Select selc =new Select(dropdown);
	  selc.selectByVisibleText("C++");
	  
  }
  
  @Test(priority = 3,description = "Test case to country DropDown List")
 	public void countryDropDownList() {
	  
	  WebElement Country=w.findElement(By.id("country"));
 	  Select selc =new Select(Country);
 	  selc.selectByVisibleText("India");
 	  
 	  WebElement Countries=w.findElement(By.id("countries"));
 	  Select selcc =new Select(Countries);
 	  selc.selectByVisibleText("Select Country");
 	  
 	 WebElement yob=w.findElement(By.id("yearbox"));
	  Select sel =new Select(yob);
	  sel.selectByVisibleText("2015");
	  
	  WebElement mob=w.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
	  Select sel1 =new Select(mob);
	  sel1.selectByVisibleText("July");
	  
	  WebElement dob=w.findElement(By.id("daybox"));
	  Select sel2 =new Select(dob);
	  sel2.selectByVisibleText("11");
   }
  
  @Test(priority = 4,description = "Test case for password")
	public void password() {
	  
	  w.findElement(By.id("firstpassword")).clear();
	  w.findElement(By.id("firstpassword")).sendKeys("abc123");
	  
	  w.findElement(By.id("secondpassword")).clear();
	  w.findElement(By.id("secondpassword")).sendKeys("abc123");
	  
	  w.findElement(By.id("submitbtn")).click();
  }
  @AfterTest
  public void afterTest() {
	 // w.quit();
  }

}
