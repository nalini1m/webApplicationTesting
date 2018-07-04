package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class TSRTC_HeardBlock_Testing {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.tsrtconline.in/oprs-web/");
		
		driver.manage().window().maximize();
		
		WebElement headerBlock=driver.findElement(By.className("menu-wrap"));
		
		List<WebElement>headerLinks=headerBlock.findElements(By.tagName("a"));
		
		System.out.println(headerLinks.size());
		
		for(int i=0;i<headerLinks.size();i++)
		{
			String headerLinkName=headerLinks.get(i).getText();
			System.out.println(i+"  "+headerLinkName);
			
			headerLinks.get(i).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			driver.navigate().back();
			
			Sleeper.sleepTightInSeconds(5);
			
			headerBlock=driver.findElement(By.className("menu-wrap"));
			headerLinks=headerBlock.findElements(By.tagName("a"));
			
		}
		
		driver.close();

	}

}
