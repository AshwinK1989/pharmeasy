package com.managers;

import org.openqa.selenium.WebDriver;
import com.pageobjects.DashboardPage;
import com.pageobjects.SearchPage;
import com.pageobjects.SignInPage;

public class PageObjectManager {

	    WebDriver driver;
	    SignInPage signInPage;
	    DashboardPage dashboardpage;
	    SearchPage searchPage;

	    public PageObjectManager(WebDriver driver) {

	        this.driver = driver;
	    }

	    public SignInPage getSignInPage() {

	        return (signInPage == null) ? new SignInPage(driver) : signInPage;
	    }
	    
	    public DashboardPage getDashboardPage() {

	        return (dashboardpage == null) ? new DashboardPage(driver) : dashboardpage;
	    }
	    
	    public SearchPage getSearchPage() {

	        return (searchPage == null) ? new SearchPage(driver) : searchPage;
	    }

	
}
