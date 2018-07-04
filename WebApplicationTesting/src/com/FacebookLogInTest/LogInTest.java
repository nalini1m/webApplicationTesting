package com.FacebookLogInTest;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LogInTest {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
		// <input id="email" class="inputtext" type="email" data-testid="royal_email" tabindex="1" name="email">
		// locator="selector"
		
		//driver.findElement(By.id("email")).sendKeys("Nalini");
		
		driver.findElement(By.className("inputtext")).sendKeys("hiii");
		
		// <input id="pass" class="inputtext" type="password" data-testid="royal_pass" tabindex="2" name="pass">
		
		//driver.findElement(By.id("pass")).sendKeys("Hello");
		
		driver.findElement(By.name("pass")).sendKeys("Hello");
		
		// <label id="loginbutton" class="uiButton uiButtonConfirm" for="u_0_2">
		
		driver.findElement(By.id("loginbutton")).click();
		
		//driver.close();
		
		

	}

}
