package com.pageobjects;

import org.openqa.selenium.WebDriver;

import com.setup.ConstantLocators;
import com.setup.GenericMethods;

public class SignInPage {
	
	WebDriver driver;

	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}
	

	public void clickOnLoginButton ()  {
		
		GenericMethods.waitFor(9000);
		GenericMethods.click(driver, ConstantLocators.loginbutton);
	}
	
	public void enterUserNameAndPassword (String userName, String password)  {
		
		GenericMethods.input(driver, ConstantLocators.txtEmail, userName);
		GenericMethods.input(driver, ConstantLocators.txtPassword, password);
		
	}
	
   public void clickOnSignInButton ()  {
		
	   GenericMethods.clickAndroidBackButton(driver);
		GenericMethods.click(driver, ConstantLocators.signButton);
	}
   
 
}
