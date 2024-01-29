package stepdefination;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;


import pageobject.healthdetails;
import pageobject.leadpage;
import pageobject.payment;
import pageobject.payoutdetails;
import pageobject.personaldetails;
import pageobject.propersonal;
import pageobject.quotepage;
import pageobject.review;


public class Base {

	public WebDriver driver;
	
	public leadpage lp;
	
	public quotepage qp;
	
	public personaldetails pp;
	
	public propersonal prp;
	
	public healthdetails hp;
	
	public payoutdetails pop;
	
	public review rp;
	
	public payment pay;
	
	
	//created for generating random String for unique email
	public static String randomestring() {
		String genratedString1 =RandomStringUtils.randomAlphabetic(5);
		return(genratedString1);
	}
}
