package com.pageobjects;

import org.openqa.selenium.WebDriver;
import com.setup.GenericMethods;

public class DeliverToPage {
	
	public static String btnGetStarted="//android.widget.TextView[@resource-id='com.phonegap.rxpal:id/tv_get_started']";
    public static String btnCity = "(//android.widget.TextView[@resource-id='com.phonegap.rxpal:id/tv_city_name'])[1]";
    public static String txtSearch = "//android.widget.TextView[@resource-id='com.phonegap.rxpal:id/lblSearchMedicine']";
    public static String btnViewAllResults = "//android.widget.TextView[@resource-id='com.phonegap.rxpal:id/tv_search_view_all']";
    public static String txtEditSearch = "//android.widget.EditText[@resource-id='com.phonegap.rxpal:id/search_src_text']";
	WebDriver driver;

	public DeliverToPage(WebDriver driver) {
		this.driver = driver;
	}
	

	public void clickOnGetStartedButton ()  {
		
		GenericMethods.click(driver, btnGetStarted);
	}
	
	public void selectCity ()  {
		
		GenericMethods.click(driver, btnCity);
	}
	
   public void searchMedicine (String medicine)  {
		
	   GenericMethods.click(driver, txtSearch);
	   GenericMethods.input(driver, txtEditSearch, medicine);
	   GenericMethods.click(driver, btnViewAllResults);
		
	}
   
 
}
