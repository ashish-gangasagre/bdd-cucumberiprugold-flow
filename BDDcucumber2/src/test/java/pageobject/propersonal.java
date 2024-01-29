package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class propersonal {

	
	public WebDriver driver;
	
	
	public propersonal(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="propfrstNm")
	WebElement profname;
	@FindBy(id="propDob")
	WebElement prdob;
	@FindBy(id="propEdu")
	WebElement predu;
	@FindBy(id="propocc")
	WebElement procc;
	@FindBy(id="propPreferred_identity_proof")
	WebElement pridprof;
	@FindBy(id="propPreferred_age_proof")
	WebElement prageprof;
	@FindBy(id="propPanNo")
	WebElement prpanno;
	
	@FindBy(id="prop_address1")
	WebElement pradress;
	@FindBy(id="prop_pinCode")
	WebElement prpincode;
	@FindBy(id="prop_preferred_address_proof")
	WebElement prpreferadressproff;
	
	@FindBy(id="preferred_address_proof")
	WebElement adress;
	
	@FindBy(id="mobileNumber")
	WebElement mobile;
	
	
	
	public void enterprofname() {
		profname.sendKeys("Shree");
	}
	public void enterprdob() {
		prdob.sendKeys("01/01/1999");
	}
	public void selectpredu() {
		Select prredu=new Select(predu);
	    prredu.selectByIndex(3);
	}
	public void selectocc() {
		Select prrocc=new Select(procc);
		prrocc.selectByIndex(3);
	}
	public void selectpridprof() {
		Select pridproff=new Select(pridprof);
		pridproff.selectByIndex(3);
	}
	public void selectprrage() {
		Select prrage=new Select(prageprof);
		prrage.selectByIndex(3);
	}
	public void enterprpannumber() {
		prpanno.sendKeys("DHOPG4455L");
	}
	
	
	public void enterpradress() {
		pradress.sendKeys("balaji nagar");
	}
	public void enterprpincode() {
		prpincode.sendKeys("400001");
	}
	public void selectprprefadressprof() {
		Select prprefadresspro=new Select(prpreferadressproff);
		prprefadresspro.selectByIndex(3);
	}
	
	
	public void selectadressproff() {
		Select adressprof=new Select(adress);
		adressprof.selectByIndex(3);
	}
	
	
	public void entermobilenumber() {
		mobile.sendKeys("8888888888");
	}
	
	
}
