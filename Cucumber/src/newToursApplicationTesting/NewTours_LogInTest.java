package newToursApplicationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewTours_LogInTest
{
	FirefoxDriver driver;
	@Given("^Open firefox browser and navigate to newtours application$")
	public void Open_firefox_browser_and_navigate_to_newtours_application()  
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
				
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	}
	
	@When("^User Enters Valid \"([^\"]*)\" and \"([^\"]*)\" and Click on SignIn button$")
	public void User_Enters_Valid_and_and_Click_on_SignIn_button(String UserName, String Password)
	{
	
		driver.findElement(By.name("userName")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
		
	}
	
	@Then("^User should be able to successfully login to the application and close the browser$")
	public void User_should_be_able_to_successfully_login_to_the_application_and_close_the_browser() 
	{
	 
		driver.close();
	}
}
