package com.pagedefinitions;

import com.contexts.TestContext;
import com.pageobjects.DashboardPage;
import com.pageobjects.SearchPage;

import cucumber.api.java.en.And;

public class SearchPageStepDefinition {

	SearchPage searchPage;
    TestContext testContext;


    public SearchPageStepDefinition(TestContext context) {
    	
        testContext = context;
        searchPage = testContext.getPageObjectManager().getSearchPage();
        		
    }
    
    @And("^Select Maritial Status as \"([^\"]*)\"$")
    public void select_Maritial_Status_as(String maritalStatus)  {
       
    	   searchPage.selectMaritalStatus(maritalStatus);
    	
    }
    
    @And("^Select Religion as \"([^\"]*)\"$")
    public void select_Religion_as(String religion)  {
       
    	   searchPage.selectReligion(religion);
    	
    }
    
    @And("^Select Mother Tongue as \"([^\"]*)\"$")
    public void select_Mother_Tongue_as(String motherTongue)  {
       
    	   searchPage.selectMotherTongue(motherTongue);
    	
    }
    
    @And("^Select Community as \"([^\"]*)\"$")
    public void select_Community_as(String community)  {
       
    	   searchPage.selectCommunity(community);
    	
    }
    
    @And("^Select Country as \"([^\"]*)\"$")
    public void select_Country_as(String country)  {
       
    	   searchPage.selectCountry(country);
    	
    }
    
    @And("^Select State as \"([^\"]*)\"$")
    public void select_State_as(String state)  {
       
    	   searchPage.selectState(state);
    	
    }
    
    @And("^Select City as \"([^\"]*)\"$")
    public void select_City_as(String city)  {
       
    	   searchPage.selectCity(city);
    	
    }
    
    @And("^Select manglik/chevai dosham as \"([^\"]*)\"$")
    public void select_ManglikStatus_as(String manglikStatus)  {
       
    	   searchPage.selectManglikStatus(manglikStatus);
    	
    }
    
    @And("^Click on \"([^\"]*)\" button$")
    public void click_on_button(String button)  {
    	
 	   searchPage.clickOnSearchNow(button);
 	
    }
    
 

}
