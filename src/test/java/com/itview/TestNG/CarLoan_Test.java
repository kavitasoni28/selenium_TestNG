package com.itview.TestNG;

import org.testng.annotations.Test;

import itviewFramework_PageObj.CarLoan_PageObj;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class CarLoan_Test {
	
	CarLoan_PageObj CarLoan = new CarLoan_PageObj();
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  CarLoan.openBrowser(CarLoan.readPropertiesFile("browser"));
	  CarLoan.call_CarLoan_PageObj();
  }
  
  @Test
  public void f() throws Exception {
	  CarLoan.openApplication("url_carLoan");
	  CarLoan.handleClick(CarLoan.no_Thanks_Window);
	  
	  CarLoan.waitForSec(5);
	  CarLoan.handleTextBox(CarLoan.Loan_amt, "100000");
	  CarLoan.handleTextBox(CarLoan.Loan_period, "5");
	  CarLoan.handleDropDown(CarLoan.emi, "From next month after disbursement");
	  CarLoan.handleTextBox(CarLoan.interest_rate, "9");
	  CarLoan.handleTextBox(CarLoan.UpfrontCharge, "10000");
	  CarLoan.handleClick(CarLoan.submit_btn);
	  CarLoan.waitForSec(3);
	  String print_EMIvalue=CarLoan.EMI.getText();
	  
	  System.out.println("EMI:"+print_EMIvalue);
	  Assert.assertEquals(print_EMIvalue," 2,150.94");
	  CarLoan.waitForSec(5);
  }

  @AfterTest
  public void afterTest() {
	  
	  CarLoan.closeBrowse();
  }

}
