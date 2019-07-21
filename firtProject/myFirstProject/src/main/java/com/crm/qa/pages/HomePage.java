package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath = "//a[@id=\"loginMenuHeader\"] ")
	WebElement loginButton;
	
	public HomePage() {
		
		PageFactory.initElements(driver,this);
		
	}
	
	public LoginPage clikOnProfileLoginLabel() {		
		loginButton.click();		
		return new LoginPage();
		
	}
	public String validateHomePageTitle() {
		return driver.getTitle();
		
	}
	public boolean verifyLoginPageLable() {
		return loginButton.isDisplayed(); 
	}

	
}
