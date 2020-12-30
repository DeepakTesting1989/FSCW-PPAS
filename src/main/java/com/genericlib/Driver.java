package com.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
	
	public static WebDriver driver;
	public void getDriver()
	{
		if(constants.browser.equalsIgnoreCase("firefox"))
				{
			     driver = new FirefoxDriver();
				}
		else if(constants.browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\root\\Desktop\\chromedriver.exe");
			driver  = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(constants.url);
			System.out.println("Title of the new window: " + driver.getTitle());
	           	
		}
		
		driver.manage().window().maximize();
		
		//return driver;
	}

}
