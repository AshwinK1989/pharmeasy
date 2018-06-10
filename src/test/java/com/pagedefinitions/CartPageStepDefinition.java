package com.pagedefinitions;

import com.contexts.TestContext;
import com.pageobjects.CartPage;

import cucumber.api.java.en.And;

public class CartPageStepDefinition {

	CartPage cartPage;
	TestContext testContext;

	public CartPageStepDefinition(TestContext context) {
		testContext = context;
		cartPage = testContext.getPageObjectManager().getCartPage();

	}

	@And("^Click on Continue$")
	public void clickOnContinue() {

		cartPage.clickOnContinue();

	}

}
