package com.pagedefinitions;

import com.contexts.TestContext;
import com.pageobjects.DashboardPage;
import com.pageobjects.SignInPage;
import com.setup.MobileSetup;

import cucumber.api.java.en.*;

public class DashboardPageStepDefinition extends MobileSetup {

	
	DashboardPage dashboardpage;
    TestContext testContext;


    public DashboardPageStepDefinition(TestContext context) {
    	
        testContext = context;
        dashboardpage = testContext.getPageObjectManager().getDashboardPage();
        		
    }
    
    @And("^Click on Search button$")
	public void click_On_Search_Button() {
		
    	dashboardpage.clickOnSearchButton();
	}
    


}
