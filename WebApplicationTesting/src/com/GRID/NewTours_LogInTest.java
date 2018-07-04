package com.GRID;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTours_LogInTest
{

	@Parameters("Browser")
	@Test
	public void LogIn(String b) throws MalformedURLException
	{
		System.out.println(b);
		
		DesiredCapabilities cap=null;
		
		if(b.equals("firefox"))
		{
			cap= new DesiredCapabilities();
			cap.setBrowserName("firefox");
			cap.setPlatform(Platform.WINDOWS);
		}
		else
			if(b.equals("chrome"))
			{
				cap=new DesiredCapabilities();
				cap.setBrowserName("chrome");
				cap.setPlatform(Platform.WINDOWS);
								
			}
		
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.126.141:4444/wd/hub"),cap);
		
		driver.get("http://newtours.demoaut.com");
		// <input type="text" size="10" name="userName">
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		// <input type="password" size="10" name="password">
		
		driver.findElementByName("password").sendKeys("tutorial");
		
		//  name="login"
		
		WebElement logIn=driver.findElement(By.name("login"));
		logIn.click();
		
		String expected_Title="Find";
		String actual_Title=driver.getTitle();
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("TItle Matched -- PASS");
		}
		else
		{
			System.out.println("Title not matched  -- FAIL");
		}
		
		driver.close();
		
	}
	
	
	
	
	
}
