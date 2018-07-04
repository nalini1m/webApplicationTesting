package com.HandlingAlert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DargAndDrop_Operation {

	public static void main(String[] args)
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// id="draggable"
		
		// <iframe class="demo-frame" src="/resources/demos/droppable/default.html">
		
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		WebElement Source=driver.findElement(By.id("draggable"));
		WebElement Destination=driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(Source, Destination).build().perform();
		

	}

}
