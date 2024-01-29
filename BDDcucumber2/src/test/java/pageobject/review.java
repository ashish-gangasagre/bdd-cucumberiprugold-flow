package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class review {
	
	public WebDriver driver;
	
	public review(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
@FindBy(xpath="//*[contains(@class,'btnColor reviewScreenBtn reviewScreenBtn2')]")
	WebElement next;

@FindBy(xpath="//*[text()='I Agree']")
WebElement iagree;

public void clickonnext() {
	next.click();
}

public void clickoniagree() {
	iagree.click();
}
	
}
