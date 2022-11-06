package itviewFramework_PageObj;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CarLoan_PageObj extends TestBase {
	
	@FindBy(id="carhome_loan")
	public WebElement Loan_amt;
	
	@FindBy(id="loan_period")
	public WebElement Loan_period;
	
	@FindBy(id="emi_start_from")
	public WebElement emi;
	
	@FindBy(id="interest_rate")
	public WebElement interest_rate;
	
	@FindBy(id="upfront_charges")
	public WebElement UpfrontCharge;
	
	@FindBy(id="total_payment")
	public WebElement totalPayment;
	
	@FindBy(id="interest_charges")
	public WebElement interestCharges;
	
	@FindBy(id="emi")
	public WebElement EMI;
	
	@FindBy(linkText="Submit")
	public WebElement submit_btn;
	
	@FindBy(id="reset_btn")
	public WebElement Reset_btn;
	
	@FindBy(id="wzrk-cancel")
	public WebElement no_Thanks_Window;
	
	public void call_CarLoan_PageObj() {
		PageFactory.initElements(w, this);
	}
	
	

}
