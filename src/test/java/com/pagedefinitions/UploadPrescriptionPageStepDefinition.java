package com.pagedefinitions;

import com.contexts.TestContext;
import com.pageobjects.UploadPrescriptionPage;

import cucumber.api.java.en.And;

public class UploadPrescriptionPageStepDefinition {

	UploadPrescriptionPage uploadPrescriptionPage;
    TestContext testContext;


    public UploadPrescriptionPageStepDefinition(TestContext context) {
    	
        testContext = context;
        uploadPrescriptionPage = testContext.getPageObjectManager().getUploadPrescriptionPage();
        		
    }
    
    @And("^Upload Prescription$")
   	public void goToCart() {
   		
    	uploadPrescriptionPage.uploadPrescription();
    	
   	}
    
    @And("^Click on Proceed to Checkout$")
   	public void proceedToCheckout() {
   		
    	uploadPrescriptionPage.clickOnProceedToCheckout();
   	}
    
    
}
