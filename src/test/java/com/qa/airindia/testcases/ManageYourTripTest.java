package com.qa.airindia.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.airindia.base.TestBase;
import com.qa.airindia.pages.ManageYourTrip;

public class ManageYourTripTest extends TestBase {
	ManageYourTrip manage;

	public ManageYourTripTest() {
		super();
	}
	
	
	@BeforeMethod
	public void setUp() {
		intialization();
		manage=new ManageYourTrip();
		
	}
	
	
	
	
	
	
	@Test(priority=1)
	public void verifyManageYourTripTest() {
		
		String title=manage.selectmanageyourtrip();
		Assert.assertEquals(title, "AirIndia E-Commerce - Flight requirements");
		
	}
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
}
