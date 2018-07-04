package com.linksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewToursHomePage_DisplayingLinkNames {

	public static void main(String[] args)
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
		}
		
		driver.close();

	}

}
