package com.itview.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Auth_code {

	public static void main(String[] args) {
		String username="admin";
		String password="admin";
		
		WebDriverManager.chromedriver().setup();
		WebDriver w=new ChromeDriver();
		
		//https://username:password@URL
		w.get("https://"+username+":"+password+"@"+"the-internet.herokuapp.com/basic_auth");
		

	}

}
