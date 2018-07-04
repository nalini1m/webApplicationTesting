package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewToursHomePageTesting 
{

	FirefoxDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver= new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}
	
	@Test
	public void HomePageTesting()
	{
		WelcomeMercuryTours WMT = PageFactory.initElements(driver, WelcomeMercuryTours.class);
		
		WMT.Register();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		driver.navigate().back();
		
		WMT.SignOn();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		
		driver.navigate().back();
		
		WMT.LogInTest("tutorial", "tutorial");
		
		String expected_Title ="HelloTest";
		String actual_Title=driver.findElement(By.xpath("html/body/div[1]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/font")).getText();
		
		Assert.assertTrue(actual_Title.contains(expected_Title), "Text not Found -- FAIL");
		
		
		driver.close();
		
		
		
	}
	
	
	
}
