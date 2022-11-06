package com.itview.basictestcases.selenium_testing_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCase2 {

	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver w = new ChromeDriver();
		
		w.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(3000);
		
		//w.findElement(By.name("username")).sendKeys("Admin");
		//w.findElement(By.name("password")).sendKeys("admin123");
		
		//Thread.sleep(3000);
		//w.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		//w.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/span")).click();
		//w.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		
		//w.quit();
		
		w.findElement(By.cssSelector("input[name='username']")).sendKeys("Admin");
		w.findElement(By.cssSelector("input[type='password']")).sendKeys("admin123");
		w.findElement(By.cssSelector("button[type='submit']")).click();
		w.findElement(By.cssSelector("span[class='oxd-userdropdown-tab']")).click();
		
		w.quit();
		

	}

}
