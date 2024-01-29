package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class healthdetails {
	
public WebDriver ldriver;

public healthdetails(WebDriver rdriver) {
	ldriver=rdriver;
	
	PageFactory.initElements(rdriver, this);
	
}

@FindBy(id="weight")
WebElement weight;

@FindBy(id="HQ01")
WebElement height;

@FindBy(id="health-complete")
WebElement next;




public void enterweight() {
weight.sendKeys("88");
}

public void selecthight() {
	Select hight=new Select(height);
	hight.selectByIndex(6);
}
public void clickonnext() {
	next.click();
}
}
