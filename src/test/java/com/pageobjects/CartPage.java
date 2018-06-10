package com.pageobjects;

import org.openqa.selenium.WebDriver;

import com.setup.GenericMethods;

public class CartPage {

	
	public static String btnContinue = "//android.widget.TextView[@resource-id='com.phonegap.rxpal:id/btnNext']";
	WebDriver driver;

	public CartPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickOnContinue ()  {
		
		GenericMethods.click(driver, btnContinue);
	}
}
