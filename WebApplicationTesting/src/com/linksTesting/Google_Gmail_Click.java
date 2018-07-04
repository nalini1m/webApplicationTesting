package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_Gmail_Click {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		
		// Maximize the Browser
		
		driver.manage().window().maximize();
		
		//driver.findElementByLinkText("Gmail").click();
		
		driver.findElement(By.partialLinkText("Gma")).click();
		
		driver.close();

	}

}
