package com.pagedefinitions;


import com.pageobjects.DashboardPage;
import com.pageobjects.SignInPage;
import com.setup.MobileSetup;
import com.contexts.TestContext;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class SignInPageStepDefinition extends MobileSetup {
	
	SignInPage signInPage;
    TestContext testContext;


    public SignInPageStepDefinition(TestContext context) {
        testContext = context;
        signInPage = testContext.getPageObjectManager().getSignInPage();
        		
    }
    
 	@Given("^You Click on Login In button$")
	public void click_On_Login_In_Button() {
		
		signInPage.clickOnLoginButton();

	}
	
	@And("^You enter \"(.*)\" and \"(.*)\"$")
	public void you_enter_username_password(String userName, String password) {
		
		signInPage.enterUserNameAndPassword(userName, password);
	}
	
	@And("^Click on Sign In button$")
	public void click_On_Sign_In_Button() {
		
		signInPage.clickOnSignInButton();

	}

	

}
