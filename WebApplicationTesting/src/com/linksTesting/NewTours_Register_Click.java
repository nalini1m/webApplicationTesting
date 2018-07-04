package com.linksTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_Register_Click {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		/*
		 *
<a href="mercuryregister.php?osCsid=229fb55ab8f8d7b369a4987e461eab52">REGISTER</a>


 a - anchor tag
 href - Attribute

Element Type -- Link --

 locator -- linkText

 selector - REGISTER
		 */

		WebElement Register=driver.findElement(By.linkText("REGISTER"));
		Register.click();
		
		System.out.println(driver.getTitle());
		
		String expected_Title="Register";
		String actual_Title=driver.getTitle();
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("Navigated to Register Web page");
		}
		else
		{
			System.out.println("Failed to navigate to Register Web Page");
		}
		driver.close();
		
	}

}
