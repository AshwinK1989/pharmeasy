package com.pageobjects;

import org.openqa.selenium.WebDriver;

import com.setup.GenericMethods;

public class MedicineDetailsPage {

	WebDriver driver;
	public String btnAddToCart = "//android.widget.TextView[@resource-id='com.phonegap.rxpal:id/md_detail_add_to_cart']";
	public String btnGoToCart = "//android.widget.TextView[@resource-id='com.phonegap.rxpal:id/tv_view_cart']";

	
	public MedicineDetailsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void addToCart ()  {
		
		GenericMethods.click(driver, btnAddToCart);

	}
	
   public void goToCart ()  {
		
		GenericMethods.click(driver, btnGoToCart);

	}
}
