package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class personaldetails {
public WebDriver ldriver;
	
	public personaldetails(WebDriver rdriver) {
		
		ldriver=rdriver;
		
		PageFactory.initElements(rdriver,this);
		
	}
	@FindBy(id = "frstNm")
	WebElement firstname;
	
	@FindBy(id="preferred_age_proof")
	WebElement ageproof;
	
	@FindBy(id="preferred_identity_proof")
	WebElement idprof;
	
	@FindBy(id="education")
	WebElement education;
	
	@FindBy(id="occ")
	WebElement occupation;
	
	@FindBy(id="panNo")
	WebElement panno;
	
	@FindBy(id="address1")
	WebElement adress;
	
	@FindBy(id="pinCode")
	WebElement pincode;
	
	@FindBy(id="preferred_address_proof")
	WebElement prefadress;
	
	@FindBy(id="nomineefrstNm")
	WebElement nomifname;
	
	@FindBy(id="nomineeDob")
	WebElement nomineedob;
	
	@FindBy(id="nominee-complete")
	WebElement next;
	
	
	
	
	
	
	
	
	
	
	public void enterfirstname(String frstnm) {
	firstname.sendKeys(frstnm);
	}
	
	public void selectidprf() {
		Select id=new Select(idprof);
		id.selectByIndex(3);
	}
	
	public void selectageproof() {
		Select age=new Select(ageproof);
		age.selectByIndex(3);
	}
	
	public void selecteducation() {
		Select edu=new Select(education);
		edu.selectByIndex(3);
	}
	
	public void selectoccupation() {
		Select occ=new Select(occupation);
		occ.selectByIndex(3);
	}
	
	public void enterpanno() {
		panno.sendKeys("DHOPG4455L");
	}
	
	public void enteradress() {
		adress.sendKeys("balaji nagar ");
	}
	
	public void enterpincode() {
		pincode.sendKeys("400001");
	}
	
	public void selectpreffadress() {
		Select prefadr=new Select(prefadress);
		prefadr.selectByIndex(3);
	}
	
	public void enterfname() {
		nomifname.sendKeys("ashish");
	}
	
	public void enterdob() {
		nomineedob.sendKeys("02/02/1999");
	}
	
	public void clickonnext() {
		next.click();
	}
	
	
	
	
	
	
	
}
