package com.sapient;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverManager {
	public static WebDriver driver;

	public static WebDriver getWebDriver() {
		String browser = "chrome";
		if (driver == null) {

			synchronized (WebdriverManager.class) {
				initDriver(browser);
			}
		}
		return driver;
	}

	private static void initDriver(String browser) {
		if (driver == null) {
			try {
				if (browser.equalsIgnoreCase("chrome")) {
					System.setProperty("webdriver.chrome.driver",
							"C:\\Users\\Jotonia\\Desktop\\drivers\\chromedriver.exe");
					driver = new ChromeDriver();
				} else if (browser.equalsIgnoreCase("Firefox")) {
					System.setProperty("webdriver.firefox.marionette", "C:\\Users\\Jotonia\\Desktop\\drivers");
					driver = new FirefoxDriver();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}
}
