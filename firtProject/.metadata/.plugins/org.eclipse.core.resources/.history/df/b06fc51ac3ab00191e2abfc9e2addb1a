package com.crm.qa.test;

import static org.testng.Assert.assertEquals;

import org.apache.http.util.Asserts;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	HomePage homePge;
	LoginPage logPage;
	
	public HomePageTest() {
		super();
	}
	@BeforeMethod
	private void setup() {
		initialization();
		homePge = new HomePage();

	}
	
	@Test(priority=1)
	private void verifyLoginPageTitleTest() {
		String title= homePge.validateHomePageTitle();
		Assert.assertEquals(title,"Book Flights from Sri Lanka | Qatar Airways");
	
	}
	@Test(priority=2)
	private void varifyLblTest() {
		boolean lable = homePge.verifyLoginPageLable();
		Assert.assertTrue(lable);
	
	}
	
	@Test
	private void clickOnProfileLoginButtonLoginlableTest() {

		logPage =homePge.clikOnProfileLoginLabel();		

	}

	@AfterMethod 
	private void tearDown() {

		driver.quit();

	}
}
