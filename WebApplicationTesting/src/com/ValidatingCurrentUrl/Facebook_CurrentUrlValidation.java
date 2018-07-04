package com.ValidatingCurrentUrl;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_CurrentUrlValidation {

	public static void main(String[] args)
	
	{
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://facebook.com");
		
	String	expected_Url="facebook.com";
	
	String actual_Url=driver.getCurrentUrl();
	
	System.out.println("Expected Url is : "+ expected_Url);
	System.out.println("Actual Url is :"+ actual_Url);
	
	if(actual_Url.contains(expected_Url))
	{
		System.out.println("URL matched -- PASS");
	}
	else
	{
		System.out.println("URL not matched -- FAIL");
	}
	
	driver.close();

	}

}
