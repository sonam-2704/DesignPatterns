package com.design.browser.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser implements Driver {

	@Override
	public WebDriver getDriver() {
		return new InternetExplorerDriver();
	}

}
