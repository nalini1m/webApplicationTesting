package com.NewToursLogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInTest {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		// <input type="text" size="10" name="userName">
		
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		
		// <input type="password" size="10" name="password">
		
		driver.findElementByName("password").sendKeys("tutorial");
		
		//  name="login"
		
		WebElement logIn=driver.findElement(By.name("login"));
		logIn.click();

	}

}
