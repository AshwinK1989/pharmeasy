package com.pageobjects;

import org.openqa.selenium.WebDriver;

import com.setup.GenericMethods;

public class UploadPrescriptionPage {

	public static String btnUploadPrescription = "//android.widget.ImageView[@resource-id='com.phonegap.rxpal:id/imgPrescriptionP']";
	public static String btnCamera = "//android.widget.LinearLayout[@resource-id='com.phonegap.rxpal:id/ll_camera_photo']";
	public static String btnProceedCheckout = "//android.widget.TextView[@resource-id='com.phonegap.rxpal:id/tv_bottom_button']";
	public static String btnCameraClick = "//android.view.View[@resource-id='com.motorola.cameraone:id/preview_surface']";
	WebDriver driver;

	public UploadPrescriptionPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void uploadPrescription ()  {
		
		GenericMethods.click(driver, btnUploadPrescription);
	    GenericMethods.click(driver, btnCamera);
	    GenericMethods.capturePicture(driver,btnCameraClick);
	    
	    	}
	
	public void clickOnProceedToCheckout ()  {
		
		GenericMethods.click(driver, btnProceedCheckout);
	}
}
