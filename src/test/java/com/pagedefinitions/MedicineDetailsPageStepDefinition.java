package com.pagedefinitions;

import com.contexts.TestContext;
import com.pageobjects.MedicineDetailsPage;

import cucumber.api.java.en.And;

public class MedicineDetailsPageStepDefinition {

	MedicineDetailsPage medicineDetailsPage;
	TestContext testContext;

	public MedicineDetailsPageStepDefinition(TestContext context) {
		testContext = context;
		medicineDetailsPage = testContext.getPageObjectManager().getMedicineDetailsPage();

	}

	@And("^Add Product to Cart$")
	public void addToCart() {

		medicineDetailsPage.addToCart();
	}

	@And("^Go to Cart$")
	public void goToCart() {

		medicineDetailsPage.goToCart();
	}

}
