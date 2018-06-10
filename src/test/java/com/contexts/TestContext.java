package com.contexts;

import com.managers.PageObjectManager;
import com.setup.MobileSetup;

public class TestContext extends MobileSetup {

	private PageObjectManager pageObjectManager;

	public TestContext() {

		pageObjectManager = new PageObjectManager(getDriver());

	}

	public PageObjectManager getPageObjectManager() {

		return pageObjectManager;
	}
}
