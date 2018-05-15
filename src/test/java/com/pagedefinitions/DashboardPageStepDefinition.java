package com.pagedefinitions;

import com.pageobjects.DashboardPage;
import com.setup.WebSetup;
import cucumber.api.java.en.*;

public class DashboardPageStepDefinition extends WebSetup {
	//DashboardPage dp;

	@Given("^You enter \"([^\"]*)\"$")
	public void you_enter(String arg1) throws Throwable {
	   
		System.out.println("Hello");
	}

	@And("^Click on Login button$")
	public void click_on_Login_button() throws Throwable {
		System.out.println("Hello");

	}

	@And("^And you enter \"([^\"]*)\"$")
	public void and_you_enter(String arg1) throws Throwable {
		System.out.println("Hello");

	}

	@Then("^Check show you are on Dashboard Page$")
	public void check_show_you_are_on_Dashboard_Page() throws Throwable {
		System.out.println("Hello");

	}
	

}
