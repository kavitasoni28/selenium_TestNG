package itviewFramework_PageObj;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	String baseURL="https://www.moneycontrol.com/personal-finance/tools";
	WebDriver w;
	
	public void openBrowser(String browserName)
	{
		if(browserName.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			w=new ChromeDriver();}
			
			else if(browserName.equalsIgnoreCase("Firefox")) {
				WebDriverManager.firefoxdriver().setup();
				w=new FirefoxDriver();
			}
			else{
				System.out.println("Enter browser name Chrome/Firefox for execution");
				}
	
	       w.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	       w.manage().window().maximize();
	}
		 public void closeBrowse() {
			w.quit();}
		 
		 public void openApplication(String pagePath) {
			 w.get(baseURL+"/"+pagePath);
		 }
		 public void handleTextBox(WebElement we, String value) {
			 we.clear();
			 we.sendKeys(value);
		 }
		 public void handleClick(WebElement we) {
			 we.click();
		 }
		 public void handleDropDown(WebElement we, String value) {
			 Select sel=new Select(we);
			 sel.selectByVisibleText(value);
		 }
		 public void waitForSec(int second) throws Exception {
			 Thread.sleep(second*1000);
		 }
		 
		 
				
			
		 
		 public String readPropertiesFile(String key) throws Exception {
			 FileInputStream fi=new FileInputStream(".\\Configaration\\congig.properties");
			  Properties prop = new Properties();
			  prop.load(fi);
			  String returnValue=prop.getProperty(key);
			  fi.close();
			  return returnValue;
			 
		 }
		}
	
	


