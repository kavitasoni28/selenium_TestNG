package com.itview.TestNG;

import org.testng.annotations.Test;

import itviewFramework_PageObj.EductionLoan_PageObj;

import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class EducationLoanTest {
	
	EductionLoan_PageObj EduLoan= new EductionLoan_PageObj();
  
  @BeforeTest
  public void beforeTest() throws Exception {
	  
	  EduLoan.openBrowser(EduLoan.readPropertiesFile("browser"));
	  EduLoan.call_EducationLoan_PageObj();
	  
	  EduLoan.waitForSec(5);
	  }
  
  @Test
  public void educationLoan() throws Exception {
	  EduLoan.openApplication("education-loan-emi-calculator.html");  
	  EduLoan.handleTextBox(EduLoan.eduLoan_amt, "1000000");
	  EduLoan.handleTextBox(EduLoan.eduinterest_rate, "10");
	  EduLoan.handleTextBox(EduLoan.eduLoan_period, "10");
	  EduLoan.handleTextBox(EduLoan.eduEmiStart, "24");
	  EduLoan.handleClick(EduLoan.edusubmit_btn);
	  
	  EduLoan.waitForSec(5);
	  
	  String EMIvalue= EduLoan.eduEMI.getText();
	  System.out.println("EMI:" +EMIvalue);
	  Assert.assertEquals(EMIvalue, "33,163.8");
	  
	    }

  @AfterTest
  public void afterTest() {
	  
	  EduLoan.closeBrowse();  
  }

}
