package com.Annotations;

import org.testng.annotations.Test;

public class Annotations1 
{
	@Test(priority=0)
	public void BrowserLaunch()
	{
		System.out.println("FireFox Browser launch");
	}
	
	@Test(priority=1)
	public void OpenAnApplication()
	{
		System.out.println("Gmail Application Launch");
	}
	
	@Test(priority=2)
	public void LogIN()
	{
		System.out.println("LogIn Testing");
	}
	
	@Test(priority=3)
	public void InBox()
	{
		System.out.println("Testing InBox Functionality");
	}
	
	@Test(enabled=false)
	public void ComposeMail()
	{
		System.out.println("Compose Mail Functionality Testing");
	}
	
}
