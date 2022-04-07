package com.bitm.SeleniumOnlineProject2.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverManager {

	static {

		System.setProperty("webdriver.gecko.driver",
				"C:\\Users\\Imran\\Desktop\\Selenium Files\\geckodriver-v0.27.0-win64\\geckodriver.exe");
		
	}
	public static WebDriver driver = new FirefoxDriver();
		
	private DriverManager()
	{
		
	}
}
