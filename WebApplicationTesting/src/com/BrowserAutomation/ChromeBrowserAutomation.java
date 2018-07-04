package com.BrowserAutomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ChromeBrowserAutomation {

	public static void main(String[] args)
	{
		// Chrome Browser automation
		/*System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sys\\Desktop\\9PMBatch\\WebApplicationTesting\\DriverFiles\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://facebook.com");*/
		
		// FireFox browser automation
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Sys\\Desktop\\9PMBatch\\WebApplicationTesting\\DriverFiles\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://gmail.com");
		
		// Edge Browser automation
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sys\\Desktop\\9PMBatch\\WebApplicationTesting\\DriverFiles\\MicrosoftWebDriver.exe");
		EdgeDriver driv = new EdgeDriver();
		driv.get("http://google.com");
		
		// Internet Explorer
		System.setProperty("webdriver.ie.driver","C:\\Users\\Sys\\Desktop\\9PMBatch\\WebApplicationTesting\\DriverFiles\\IEDriverServer.exe");
		InternetExplorerDriver dri = new InternetExplorerDriver();
		dri.get("http://yahoo.com");
		
		
		
		

	}

}
