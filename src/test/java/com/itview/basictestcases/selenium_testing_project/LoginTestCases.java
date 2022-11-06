package com.itview.basictestcases.selenium_testing_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTestCases {
	
	//InterfaceName instance=new implementclass();

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver w = new ChromeDriver();
		
		//step1: open application with url
		
		w.get("http://altoromutual.com:8080/login.jsp");
		
		//step2: Enter the username
		
		w.findElement(By.id("uid")).sendKeys("admin");
		
		//step3: enter the password
		
		w.findElement(By.id("passw")).sendKeys("admin");
		
		//step4: click login
		
		w.findElement(By.name("btnSubmit")).click();
		
		//step5: click logout
		
		w.findElement(By.linkText("Sign Off")).click();
		
		//step5:close
		
		w.quit();
				

	}

}
