package com.testrunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.setup.WebSetup;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(features = "Features", format = { "pretty", "html:target/html/" }, glue = {"com.pagedefinitions"})
public class TestRunner extends AbstractTestNGCucumberTests {

	@BeforeClass
	@Parameters({ "browser" })
	public void beforeSetup(String browser) throws Exception {

		WebSetup.setBrowser(browser);

	}

	@AfterClass
	public void shutDown() {

		WebSetup.shutBrowser();
	}

}
