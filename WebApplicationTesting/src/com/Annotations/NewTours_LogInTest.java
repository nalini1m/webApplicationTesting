package com.Annotations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTours_LogInTest
{

	//FirefoxDriver driver;
	ChromeDriver driver;
	
	String url="http://newtours.demoaut.com";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sys\\Desktop\\9PMBatch\\WebApplicationTesting\\DriverFiles\\chromedriver.exe");
		// driver = new FirefoxDriver();
		
		driver = new ChromeDriver();
		driver.get(url);
		
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void LogIn()
	{
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
	}
	
	@AfterTest 
	public void tearDown()
	{
		driver.close();
	}
	
}
