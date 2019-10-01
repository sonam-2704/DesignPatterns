package com.design.browser.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowser implements Driver {

	@Override
	public WebDriver getDriver() {
		return new FirefoxDriver();
	} 

}
