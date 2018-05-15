package com.pageobjects;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import com.setup.ConstantLocators;
import com.setup.GenericMethods;

public class DashboardPage {

	WebDriver driver;

	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
   public void clickOnGotItButtons ()  {
		   
		   GenericMethods.click(driver, ConstantLocators.btnGotIt);
		   GenericMethods.click(driver, ConstantLocators.btnGotIt);

	   }
	
	public void clickOnSearchButton() {
     
		clickOnGotItButtons();
		GenericMethods.click(driver, ConstantLocators.tabSearch);

	}
	
}
