package itviewFramework_PageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EductionLoan_PageObj extends TestBase {
	
	@FindBy(id="educ_loan")
	public WebElement eduLoan_amt;
	
	@FindBy(id="loan_period")
	public WebElement eduLoan_period;
	
	@FindBy(id="emi_start_from")
	public WebElement eduEmiStart;
	
	@FindBy(id="interest_rate")
	public WebElement eduinterest_rate;
	
		
	@FindBy(id="total_payment")
	public WebElement edutotalPayment;
	
	@FindBy(id="interest_charges")
	public WebElement eduinterestCharges;
	
	@FindBy(id="emi")
	public WebElement eduEMI;
	
	@FindBy(linkText="Submit")
	public WebElement edusubmit_btn;
	
	@FindBy(id="reset_btn")
	public WebElement eduReset_btn;
	
	@FindBy(id="wzrk-cancel")
	public WebElement no_Thanks_Window;
	
	public void call_EducationLoan_PageObj() {
		PageFactory.initElements(w, this);
	}
	

}
