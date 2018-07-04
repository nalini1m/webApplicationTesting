package com.Annotations;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 
{
	@BeforeTest
	public void BrowserLaunchAndLogIN() 
	{
		System.out.println("Firefox Browser launch and LogIn");
	}
	
	@Test(priority=0)
	public void  Inbox()
	{
		System.out.println("Testing Inbox Functionality");
	}
	
	@Test(priority=1)
	public void ComposeMail()
	{
		System.out.println("Testing Compose Mail Functionality");
	}
	
	@AfterTest
	public void ApplicationClose()
	{
		System.out.println("Close Gmail Application");
	}
	
	
}