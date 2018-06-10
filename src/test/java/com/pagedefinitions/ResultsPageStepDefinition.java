package com.pagedefinitions;

import com.contexts.TestContext;
import com.pageobjects.ResultsPage;

import cucumber.api.java.en.And;

public class ResultsPageStepDefinition {

	ResultsPage resultsPage;
    TestContext testContext;


    public ResultsPageStepDefinition(TestContext context) {
    	
        testContext = context;
        resultsPage = testContext.getPageObjectManager().getResultsPage();
        		
    }
    
    @And("^Select medicine with Rx Batch")
    public void select_Medicine()  {
       
    	resultsPage.selectRxMedicine();
    	
    }
 
 

}
