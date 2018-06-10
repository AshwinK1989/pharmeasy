package com.pageobjects;

import org.openqa.selenium.WebDriver;
import com.setup.GenericMethods;

public class ResultsPage {
	
	WebDriver driver;
	public String imgRxResourceId = "//android.widget.ImageView[@resource-id='com.phonegap.rxpal:id/iv_rx_label']";
	public String imgRxClass = "android.widget.ImageView";

	public ResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectRxMedicine ()  {
		
		
		System.out.println("Hello Sir");
		GenericMethods.scrollDown(driver, imgRxResourceId);
		GenericMethods.click(driver, imgRxResourceId);
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
