package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class leadpage {

	public WebDriver ldriver;
	
	public leadpage(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this);
		
	}
	@FindBy(xpath = "//*[@id='ageItem']")
	WebElement dob;
	
	@FindBy(xpath="(//*[@class='ant-radio-button-wrapper ant-radio-button-wrapper-in-form-item'])[1]")
	WebElement spouse;
	@FindBy(xpath="//*[text()='Child']")
	WebElement child;
	@FindBy(xpath="//*[text()='Grandchild']")
	WebElement grandchild;
	@FindBy(xpath="//*[text()='Female']")
	WebElement female;
	
	@FindBy(xpath = "//*[@id='annualItem']")
	WebElement annual;
	
	@FindBy(xpath = "//*[text()='7.5L - 9.9L']")
	WebElement annualitm;
	
	@FindBy(xpath= "//*[@id='mobileItem']")
	WebElement mobile;
	
	@FindBy(xpath= "//*[@id='emailItem']")
	WebElement email;
	
	@FindBy(xpath="//*[@id='suitCheckbox']")
	WebElement check;
	
	@FindBy(xpath="(//*[@type='submit'])[1]")
	WebElement clculate;
	
	 public String getpagetitle() {
		   return ldriver.getTitle();
	   }
	 
	public void setdob(String dobb) {
		dob.clear();
	dob.sendKeys(dobb);
	}
	public void clickonspouse() {
		spouse.click();
	}
	public void clickonchild() {
		child.click();
	}
	public void clickongrandchild() {
		grandchild.click();
	}
	public void clickonfemale() {
		female.click();
	}
	public void setannual() {
		annual.click();
		annualitm.click();
		
	}
	public void setmobile(String mob) {
		mobile.sendKeys(mob);
	}
	public void setemail(String mail) {
		email.sendKeys(mail);
	}
	public void clickonchekbox() {
		check.click();
	}
	public void clickoncalculate() {
		clculate.click();
	}
	
	
}
