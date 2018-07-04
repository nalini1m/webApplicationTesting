package com.ScreenShots;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewTours_LinksTesting_ScreenShots {

	public static void main(String[] args) throws IOException
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		
		// <a href="mercurysignon.php">SIGN-ON</a>
	    // <a href="mercuryregister.php">REGISTER</a>
		// <a href="mercuryunderconst.php">SUPPORT</a>
		
		List<WebElement>links=driver.findElements(By.tagName("a"));
		
		int links_Count=links.size();
		System.out.println(links_Count);
		
		for(int i=0;i<links.size();i++)
		{
			String linkName=links.get(i).getText();
			System.out.println(i+"  "+linkName);
			
			links.get(i).click();
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();
			
			File Source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(Source, new File("C:\\Users\\Sys\\Desktop\\9PMBatch\\WebApplicationTesting\\ScreenShots\\"+linkName+".png"));
			
			driver.navigate().back();
			links=driver.findElements(By.tagName("a")); // re-create the array
			
		}
		
		driver.close();


	}

}
