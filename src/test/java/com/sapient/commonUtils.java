package com.sapient;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class commonUtils {
	
	
	public static boolean launchBrowser(WebDriver driver, String url) {
		try {
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}catch (Exception e) {
		e.printStackTrace();
		return false;
		
	}return true;
	
	}
	

}
