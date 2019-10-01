package com.design.browser.factory;

import org.openqa.selenium.WebDriver;

public class Factory {

	public static void main(String[] args) {

		Driver obj = BrowserFactory.getBrowser("Chrome");
		WebDriver driver = obj.getDriver();

		driver.get("http://google.com");

	}

}
