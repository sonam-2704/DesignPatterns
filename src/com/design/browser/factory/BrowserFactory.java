package com.design.browser.factory;

public class BrowserFactory {

	public static Driver getBrowser(String browserName) {

		switch (browserName) {

		case "Firefox":

			return new FirefoxBrowser();

		case "IE":

			System.setProperty("webdriver.ie.driver", "C:\\Users\\abc\\Desktop\\Server\\IEDriverServer.exe");
			return new IEBrowser();

		case "Chrome":

			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/drivers/chromedriver.exe");
			return new ChromeBrowser();
			
			default:
				System.out.println("Invalid browser");

		}

		return null;
	}

}
