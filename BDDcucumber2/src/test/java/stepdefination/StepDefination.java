package stepdefination;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.protobuf.util.TimeUtil;

import pageobject.healthdetails;
import pageobject.leadpage;
import pageobject.payment;
import pageobject.payoutdetails;
import pageobject.personaldetails;
import pageobject.propersonal;
import pageobject.quotepage;
import pageobject.review;


public class StepDefination extends Base {

	@Given("User Lanch Chrome Browser")
	public void user_lanch_chrome_browser() {
	
//		ChromeOptions chromeOptions = new ChromeOptions();
	//WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver(chromeOptions);
		
	//	ChromeOptions chromeOptions = new ChromeOptions();
	//	chromeOptions.addArguments("--remote-allow-origins=*","ignore-certificate-errors");

		driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  lp =new leadpage(driver);
	  qp =new quotepage(driver);
	  pp =new personaldetails(driver);
	 prp =new propersonal(driver);
	  hp =new healthdetails(driver);
	 pop =new payoutdetails(driver);
	  rp =new review(driver);
	 pay =new payment(driver);
	  }

	@When("User open url {string}")
	public void user_open_url(String url) 
	{
		  driver.get(url);
    }

@When("User enter dob as {string}")
public void user_enter_dob_as(String mobile) {
	
	lp.setdob(mobile);
    
}
@When("User click on spouse")
public void user_click_on_spouse() {
    lp.clickonspouse();
}
@When("User click on child")
public void user_click_on_child() {
    lp.clickonchild();
}
@When("User click on grandchild")
public void user_click_on_grandchild() {
    lp.clickongrandchild();
}

@When("User click on female")
public void user_click_on_female() throws InterruptedException {
   lp.clickonfemale();
   Thread.sleep(3000);
}


@When("User select annual from drop down")
public void user_select_annual_from_drop_down() {
   lp.setannual();
}

@When("User enters mobile number as {string}")
public void user_enters_mobile_number_as(String mob) {
   lp.setmobile(mob);
}

@When("user enters email as {string}")
public void user_enters_email_as(String email) {
  lp.setemail(email);
}

@When("User click on checkbox")
public void user_click_on_checkbox() {
    lp.clickonchekbox();
}

@When("User click on letscalculate")
public void user_click_on_letscalculate() throws InterruptedException {
  lp.clickoncalculate();
  Thread.sleep(2000);
}

	
	
	@Then("page title should be {string}")
	public void page_title_should_be(String title)  {
	   if(driver.getPageSource().contains("Thank You Page")) {
		   driver.close();
		   Assert.assertTrue(false);
	   }else {
		   Assert.assertEquals(title, driver.getTitle());
	   }
	}
	
	//quotepage
	

	
	@Then("User click on proceed")
	public void user_click_on_proceed() throws InterruptedException {
		Thread.sleep(2000);
		qp.clickonproceed();
		Thread.sleep(3000);
	}
	// ekyc
	
	@Then("User click on procced without adhar")
	public void user_click_on_procced_without_adhar() throws InterruptedException {
	    qp.clickonwithoutadhar();
	    
	   
	}

	@Then("User click on proceed to appform")
	public void user_click_on_proceed_to_appform() {
	   qp.clickonprocceedtoappfrm();
	   qp.clickonfillformmanually();
	}
	
	
	
	// personal details
	
	@When("User enters personal details")
	public void user_enters_personal_details() {
	    pp.enterfirstname("ashish");
	    pp.selectidprf();
	    pp.selectageproof();
	    pp.selecteducation();
	    pp.selectoccupation();
	    pp.enterpincode();
	    pp.enteradress();
	    pp.enterpanno();
	    pp.selectpreffadress();
	    pp.enterfname();
	    pp.enterdob();
	    
	    
	    
	}
	@When("User enters personal details for proposer")
	public void user_enters_personal_details_for_proposer() {
		  
		    prp.enterprofname();
		    prp.enterprdob();
		    prp.selectpredu();
		    prp.selectocc();
		    prp.selectpridprof();
		    prp.selectprrage();
		    prp.enterprpannumber();
		    
		    prp.enterpradress();
		    prp.enterprpincode();
		    prp.selectprprefadressprof();
		   
		    pp.enterfirstname("ashish");
		    pp.selectidprf();
		    pp.selectageproof();
		    pp.selecteducation();
		    pp.selectoccupation();
		   
		    prp.selectadressproff();
		    
		    prp.entermobilenumber();
	}

	@When("user click on next")
	public void user_click_on_next() {
	   pp.clickonnext();
	}



	
	
	

	//health page
	
	@Then("User enters weight as {string}")
	public void user_enters_weight_as(String string) {
	   hp.enterweight();
	}

	@Then("Select height from drop down")
	public void select_height_from_drop_down() {
	    hp.selecthight();
	}

	@Then("User click on nextfrom health page")
	public void user_click_on_nextfrom_health_page() {
	    hp.clickonnext();
	}
	@Then("close browser")
	public void close_browser() {
	   driver.quit();
	}
	
	//payout page
	
	@Then("User enter accno as {string}")
	public void user_enter_accno_as(String accno) {
	   pop.enteraccno(accno);
	}

	@Then("User enter ifsc cod as {string}")
	public void user_enter_ifsc_cod_as(String ifscc) {
	    pop.enterifsc(ifscc);
	}

	@Then("user click on next from payout page")
	public void user_click_on_next_from_payout_page() {
	  pop.clickonnext();
	}
	
	//review page
	
	@Then("User click on next from review page")
	public void user_click_on_next_from_review_page() {
	   rp.clickonnext();
	}
	
	@Then("user click on i agree")
	public void user_click_on_i_agree() {
	   rp.clickoniagree();
	}

   //payment page
	

@Then("User click on ok from conformation popup")
public void user_click_on_ok_from_conformation_popup() throws InterruptedException {
   pay.clickonok();
   Thread.sleep(3000);
}

@Then("User select source of fund")
public void user_select_source_of_fund() throws InterruptedException {
   pay.selectfund();
   Thread.sleep(2000);
}

@Then("click on MPOS")
public void click_on_mpos() throws InterruptedException {
   pay.clickonmpos();
   Thread.sleep(3000);
}

@Then("click on pay")
public void click_on_pay()  {
  pay.clickonpaynow();
  
}

	
	
	

}