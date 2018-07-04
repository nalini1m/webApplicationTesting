package com.NavigateToUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Navigate_FaceBook {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		driver.navigate().to("http://google.com");
		
		// close the Browser
		driver.close();
	

	}

}
