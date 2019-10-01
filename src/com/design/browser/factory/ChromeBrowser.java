package com.design.browser.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser implements Driver {

	@Override
	public WebDriver getDriver() {
		return new ChromeDriver();
	}

}
