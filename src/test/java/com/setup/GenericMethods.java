package com.setup;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;



public class GenericMethods {

	public static void click(WebDriver driver, String sLocator) {
		waitToClickMethod(driver, sLocator);
		driver.findElement(By.xpath(sLocator)).click();
	}
		
	public static void input(WebDriver driver, String sLocator, String inputValue) {
		waitToClickMethod(driver, sLocator);
		driver.findElement(By.xpath(sLocator)).sendKeys(inputValue);
	}


	public static MobileElement scrollDown(WebDriver driver, String sLocator) {
		
		try {
		
			while (getElement(driver,sLocator )==null)  {
				
			Dimension size = driver.manage().window().getSize();
			int starty = (int) (size.height * 0.80);
			int endy = (int) (size.height * 0.20);
			int startx = size.width / 2;
			((AndroidDriver) driver).swipe(startx, starty, startx, endy, 3000);
			}
		}
		catch(Exception e)  {
			
			
    }
		return null;

	}
	
	public static WebElement getElement (WebDriver driver,String sLocators)  {
		
		try  {
			
			return driver.findElement(By.xpath(sLocators));
		}
		catch (Exception e)  {
			
			e.getMessage();
		}
		
		return null;
	}
	
	public static void waitMethod(WebDriver driver, String sLocators) {

		WebDriverWait wait = new WebDriverWait(driver, 120);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sLocators)));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(sLocators)));

	}

	public static void waitToClickMethod(WebDriver driver, String sLocators) {

		WebDriverWait wait = new WebDriverWait(driver, 260);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(sLocators)));

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(sLocators)));

		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(sLocators)));

	}
	
	
	public static void capturePicture (WebDriver driver, String sLocator)  {
		
		waitToClickMethod(driver,sLocator);
		((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.KEYCODE_CAMERA);
		waitFor(2000);
	    ((AndroidDriver) driver).tap(1, 644, 1564, 1);

	}

	public static void waitFor(int time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
