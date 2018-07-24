package com.qa.airindia.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.airindia.base.TestBase;

public class ManageYourTrip extends TestBase {

	
	
	@FindBy(xpath="//a[text()='Manage Your Trip'] ")
	WebElement Managetriplabel;
	
	@FindBy(xpath="//a[text()='Book a Flight'] ")
	WebElement bookflightlabel;
	



public ManageYourTrip() {
	PageFactory.initElements(driver,this);
}

public String selectmanageyourtrip() {
	Actions action=new Actions(driver);
	action.moveToElement( Managetriplabel ).build().perform();
	bookflightlabel.click();
	return driver.getTitle();
	
	
}
}