package com.osa.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;



public class Base {
	public static WebDriver dr = null;

		
	
	
@BeforeMethod
	public static WebDriver openBrowser(String Browser) {
		if (System.getProperty("os.name").toLowerCase().contains("windows")) {

			Base.openForWindows(Browser);

		} else {

			Base.openForMac(Browser);
		}

		return dr;
	}

	public static void openForWindows(String Browser) {
		if (Browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/Drivers/Win/chromedriver.exe");
			dr = new ChromeDriver();
		} else if (Browser.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/Drivers/Win/geckodriver.exe");
			dr = new FirefoxDriver();
		} else {
			System.out
					.println("Check Spelling " + Browser + " or Please enter either browser name chrome or firefox  ");
		}

	}

	public static void openForMac(String Browser) {
		if (Browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./src/test/resources/Drivers/Mac/chromedriver.exe");
			dr = new ChromeDriver();
		} else if (Browser.contains("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./src/test/resources/Drivers/Mac/geckodriver.exe");
			dr = new FirefoxDriver();
		} else {
			System.out.println("Check Spelling " + Browser + " or Please enter either browser name chrome or firefox  ");
		}

	}

}
