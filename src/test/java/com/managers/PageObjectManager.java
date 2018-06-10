package com.managers;

import org.openqa.selenium.WebDriver;

import com.pageobjects.CartPage;
import com.pageobjects.DeliverToPage;
import com.pageobjects.MedicineDetailsPage;
import com.pageobjects.ResultsPage;
import com.pageobjects.UploadPrescriptionPage;

public class PageObjectManager {

	WebDriver driver;
	DeliverToPage signInPage;
	ResultsPage resultsPage;
	MedicineDetailsPage medicineDetailsPage;
	CartPage cartPage;
	UploadPrescriptionPage uploadPrescriptionPage;

	public PageObjectManager(WebDriver driver) {

		this.driver = driver;
	}

	public DeliverToPage getSignInPage() {

		return (signInPage == null) ? new DeliverToPage(driver) : signInPage;
	}

	public ResultsPage getResultsPage() {

		return (resultsPage == null) ? new ResultsPage(driver) : resultsPage;
	}

	public MedicineDetailsPage getMedicineDetailsPage() {

		return (medicineDetailsPage == null) ? new MedicineDetailsPage(driver) : medicineDetailsPage;
	}

	public CartPage getCartPage() {

		return (cartPage == null) ? new CartPage(driver) : cartPage;
	}

	public UploadPrescriptionPage getUploadPrescriptionPage() {

		return (uploadPrescriptionPage == null) ? new UploadPrescriptionPage(driver) : uploadPrescriptionPage;
	}

}
