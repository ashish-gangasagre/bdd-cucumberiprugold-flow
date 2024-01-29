package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class payoutdetails {
	
	public WebDriver ldriver;
	
	
	public payoutdetails(WebDriver rdriver) {
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this);
		
	}
@FindBy(id="acNo")
WebElement accno;

@FindBy(id="ifscCode")
WebElement ifsc;

@FindBy(id="payout-complete")
WebElement next;

public void enteraccno(String acco) {
	accno.sendKeys(acco);
}
public void enterifsc(String ifsccode) {
	ifsc.sendKeys(ifsccode);
}	
public void clickonnext() {
	next.click();
}
	
	
}
