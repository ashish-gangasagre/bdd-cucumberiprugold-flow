package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Then;

public class quotepage {
	
public WebDriver ldriver;
	
	public quotepage(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this);
		
	}
	@FindBy(xpath = "//*[@class='ant-btn ant-btn-round ant-btn-primary ant-btn-lg calculateFormDiv proccedAppForm']")
	WebElement proceed;
	
	@FindBy(xpath="(//*[contains(@class,'select-circle-outline')])[2]")
	WebElement witoutadhhar;
	
	@FindBy(xpath="//*[@id='ekyc-submit-btn']")
	WebElement proceedtoappform;
	
     @FindBy(xpath="//*[@class='buttonFillByMyself']")
     WebElement fllfrom;
	
	
	
	public void clickonproceed() {
		
		proceed.click();
	}
	public void clickonwithoutadhar() {
		witoutadhhar.click();
	}
	
	public void clickonprocceedtoappfrm() {
		proceedtoappform.click();
		
	}
	public void clickonfillformmanually() {
		fllfrom.click();
	}

	
}
