package com.setup;

import org.openqa.selenium.WebDriver;

import io.appium.java_client.AppiumDriver;

public class WebSetup {

	public static ThreadLocal<WebDriver> dr = new ThreadLocal<WebDriver>();

	public static void setBrowser(String browser) throws Exception {

		  if (browser.equalsIgnoreCase("Chrome")) {
			System.out.println(browser);
			
			System.setProperty("webdriver.chrome.driver", "Log4jConfiguration/chromedriver");
			WebDriver driver = new WebDriverFactory().create(browser);
			setWebDriver(driver);

	}
	}

	public static void setWebDriver(WebDriver driver) {
		dr.set(driver);
	}

	public static WebDriver getDriver()  {
		return dr.get();
	}

	public static void shutBrowser() {
		WebDriver driver = getDriver();
		driver.quit();

	}

}
