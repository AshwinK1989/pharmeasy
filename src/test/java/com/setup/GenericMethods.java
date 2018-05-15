package com.setup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;



public class GenericMethods {

	public static void click(WebDriver driver, String sLocator) {
		waitToClickMethod(driver, sLocator);
		driver.findElement(By.xpath(sLocator)).click();
	}

	public static void input(WebDriver driver, String sLocator, String inputValue) {
		waitToClickMethod(driver, sLocator);
		driver.findElement(By.xpath(sLocator)).sendKeys(inputValue);
	}

	public static void clickAndroidBackButton(WebDriver driver) {
		((AndroidDriver) driver).pressKeyCode(4);
	}

	public static String getElementText(WebDriver driver, String sLocator) {
		waitMethod(driver, sLocator);
		String elementText = driver.findElement(By.xpath(sLocator)).getText();
		return elementText;
	}

	 public static void swipeLeft (WebDriver driver) {

       int screenWidth = driver.manage ().window ().getSize ().getWidth ();
       int screenHeight = driver.manage ().window ().getSize ().getHeight ();
       // Swipe Left
       int startx = screenWidth / 9;
       int endx = screenWidth * 8 / 9;
       int starty = screenHeight / 2;
       int endy = screenHeight / 2;
       ((AppiumDriver) driver).swipe (startx, starty, endx, endy, 5000);

     }
	    
	 
	

	public static MobileElement scrollDown(WebDriver driver, String text, String resourceid, String sClassName) {
		
		try {
		
		MobileElement element = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().resourceId(\""+resourceid+"\")).getChildByText("
				+ "new UiSelector().className(\""+sClassName+"\"),\""+text+"\")"));
		return element;
		
		}
		catch(Exception e)  {
			
			
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
	

	public static List<WebElement> getElements(WebDriver driver, String sLocator) {

        try {

            if (sLocator.contains("//")) {
                return driver.findElements(By.xpath(sLocator));
            } 

        } catch (Exception e) {

           e.printStackTrace();
        }

        return null;
    }

	public static void waitFor(int time) {

		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
