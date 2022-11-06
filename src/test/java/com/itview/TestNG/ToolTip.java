package com.itview.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolTip {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver w=new ChromeDriver();
		w.get("www.google.com");
		String GoogleSearchTool_Tip=w.findElement(By.id("input")).getAttribute("title");
		System.out.println("ToolTip:"+GoogleSearchTool_Tip);

	}

}
