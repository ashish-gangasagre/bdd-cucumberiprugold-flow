package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class payment {
	
	
		
		public WebDriver driver;
		
		public payment(WebDriver driver) {
			this.driver=driver;
			
			PageFactory.initElements(driver, this);
			
		}
	@FindBy(id="okBtn")
		WebElement okbtn;

	@FindBy(id="sourceofFund")
	WebElement fund;
	
	@FindBy(xpath="//*[text()='MPOS']")
	WebElement mpos;
	
	@FindBy(id="csr_paypremium")
	WebElement paynow;

	public void clickonok() {
		okbtn.click();
	}

	public void selectfund() {
		Select fundoptn=new Select(fund);
		fundoptn.selectByIndex(2);
	}
	
	public void clickonmpos() {
		mpos.click();
	}
	
	public void clickonpaynow() {
		paynow.click();
	}
	}



