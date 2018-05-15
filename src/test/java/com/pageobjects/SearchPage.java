package com.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.setup.ConstantLocators;
import com.setup.GenericMethods;
import com.setup.Helpers;

public class SearchPage {
	
	WebDriver driver;
	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void selectMaritalStatus (String maritalStatus)  {
		
		GenericMethods.scrollDown(driver,maritalStatus, ConstantLocators.resourceId, ConstantLocators.className );
		GenericMethods.click(driver, ConstantLocators.ddMaritialStatus);
		GenericMethods.click(driver, ConstantLocators.btnApply);
	}

	public void selectReligion(String religion) {

		GenericMethods.scrollDown(driver,religion, ConstantLocators.resourceId, ConstantLocators.className);
		GenericMethods.click(driver, ConstantLocators.ddReligion);
		GenericMethods.click(driver, ConstantLocators.btnApply);

	}

	public void selectMotherTongue(String motherTongue) {

		GenericMethods.scrollDown(driver,motherTongue, ConstantLocators.resourceId, ConstantLocators.className);
		GenericMethods.click(driver, ConstantLocators.ddMotherTongue);
		GenericMethods.click(driver, ConstantLocators.btnApply);
	}

	public void selectCommunity(String community) {

		GenericMethods.click(driver, ConstantLocators.ddCommunity);
		GenericMethods.click(driver, ConstantLocators.chk96KKokanastha);	
		GenericMethods.scrollDown(driver,Helpers.splitString(community, ",")[1], ConstantLocators.resourceIdCommunity, ConstantLocators.classNameCommunity);
		GenericMethods.click(driver, ConstantLocators.chkAgri);
		GenericMethods.click(driver, ConstantLocators.btnApply);

	}

	public void selectCountry(String country) {

		GenericMethods.scrollDown(driver,Helpers.splitString(country, ",")[0], ConstantLocators.resourceId, ConstantLocators.className);
		GenericMethods.click(driver, ConstantLocators.ddCountry);
		GenericMethods.click(driver, ConstantLocators.chkUsa);	
		GenericMethods.click(driver, ConstantLocators.btnApply);


	}

	public void selectState(String state) {
		
		GenericMethods.click(driver, ConstantLocators.ddState);
		GenericMethods.click(driver, ConstantLocators.chkAndhraPradesh);	
		GenericMethods.scrollDown(driver,Helpers.splitString(state, ",")[0], ConstantLocators.resourceIdCommunity, ConstantLocators.classNameCommunity);
		GenericMethods.click(driver, ConstantLocators.chkMaharashtra);	
		GenericMethods.click(driver, ConstantLocators.btnApply);

		
	}

	public void selectCity(String city) {

		GenericMethods.click(driver, ConstantLocators.ddCity);
		GenericMethods.scrollDown(driver,Helpers.splitString(city, ",")[0], ConstantLocators.resourceIdCommunity, ConstantLocators.classNameCommunity);
		GenericMethods.click(driver, ConstantLocators.chkMumbai);	
		GenericMethods.scrollDown(driver,Helpers.splitString(city, ",")[1], ConstantLocators.resourceIdCommunity, ConstantLocators.classNameCommunity);
		GenericMethods.click(driver, ConstantLocators.chkPune);	
		GenericMethods.click(driver, ConstantLocators.btnApply);

		
	}

	public void selectManglikStatus(String manglikStatus) {

		GenericMethods.click(driver, ConstantLocators.ddManglikStatus);
		GenericMethods.click(driver, ConstantLocators.chkNoManglik);	
		GenericMethods.click(driver, ConstantLocators.btnApply);

	}

	public void clickOnSearchNow(String button) {

		GenericMethods.scrollDown(driver,button, ConstantLocators.resourceId, ConstantLocators.className);
		GenericMethods.click(driver, ConstantLocators.btnSearchNow);

		
	}

}
