package com.MouseHoverOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_HelloSignIn {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://amazon.in");
		
		WebElement HelloSignIn=driver.findElement(By.id("nav-link-yourAccount"));
		
		Actions act = new Actions(driver);
		act.moveToElement(HelloSignIn).build().perform();
		
		driver.close();

	}

}
