package com.POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercuryTours
{

	// Object Repository Class
	
	//WebElement register=driver.findElement(By.linkTest("REGISTER"));
	
	@FindBy(linkText="REGISTER")
	WebElement register;
	
	public void Register()
	{
		register.click();
	}
	
	@FindBy(linkText="SIGN-ON")
	WebElement signOn;
	
	public void SignOn()
	{
		signOn.click();
	}
	
	@FindBy(name="userName")
	WebElement UserName;
	
	@FindBy(name="password")
	WebElement Password;
	
	@FindBy(name="login")
	WebElement SignIn;
	
	public void LogInTest(String UName,String Pwd)
	{
		UserName.sendKeys(UName);
		Password.sendKeys(Pwd);
		SignIn.click();
	}
	
}
