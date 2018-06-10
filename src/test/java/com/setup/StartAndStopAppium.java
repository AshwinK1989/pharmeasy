package com.setup;

import java.io.File;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class StartAndStopAppium {

	
	private static AppiumDriverLocalService service;
	

	public static void startAppiumServer(String sPlatformIpAddress, String port) {

		service = AppiumDriverLocalService
				.buildService(new AppiumServiceBuilder()
						.usingDriverExecutable(new File("/usr/local/bin/node"))
						.withAppiumJS(
								new File(
										"/usr/local/lib/node_modules/appium/build/lib/main.js"))
						.withIPAddress("127.0.0.1").usingPort(4723));
		service.start();
	
	}

	public static void stopAppiumServer() {

		service.stop();

	}

}
