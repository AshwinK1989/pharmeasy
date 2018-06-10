package com.pagedefinitions;

import com.pageobjects.DeliverToPage;
import com.setup.MobileSetup;
import com.contexts.TestContext;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

public class DeliverToPageStepDefinition extends MobileSetup {

	DeliverToPage deliverToPage;
	TestContext testContext;

	public DeliverToPageStepDefinition(TestContext context) {
		testContext = context;
		deliverToPage = testContext.getPageObjectManager().getSignInPage();

	}

	@Given("^Click on GET Started Button$")
	public void click_On_Login_In_Button() {

		deliverToPage.clickOnGetStartedButton();

	}

	@And("^Select the City$")
	public void selectTheCity() {

		deliverToPage.selectCity();
	}

	@And("^Search for \"([^\"]*)\"$")
	public void search_for(String medicine) {

		deliverToPage.searchMedicine(medicine);
	}
}
