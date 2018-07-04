package com.Selection;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Monster_CurrentLocation_Industry_Select {

	public static void main(String[] args) 
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://my.monsterindia.com/sponsered_popup.html");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement currentLocation=driver.findElement(By.className("border_grey1"));
		
		// Select class is used to perform selection of an element
		
		Select selection = new Select(currentLocation);
		//selction.selectByIndex(2);
		
		//selection.selectByValue("3");
		
		selection.selectByVisibleText("Delhi");
		
		WebElement industry=driver.findElement(By.id("id_industry"));
		
		Select sel = new Select(industry);
		
		sel.selectByIndex(2);
		sel.selectByValue("65");
		sel.selectByVisibleText("Banking/ Financial Services");

	}

}
