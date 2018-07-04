package newToursApplicationTesting;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewToursLogInTest 
{
	FirefoxDriver driver;
	
	@Given("^Open firefox browser and navigate to newTours application$")
	public void Open_firefox_browser_and_navigate_to_newTours_application()  
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	}

	@When("^User enters valid \"([^\"]*)\" and \"([^\"]*)\" and click on SignIn button$")
	public void User_enters_valid_and_and_click_on_SignIn_button(String UserName, String Password)
	 {
		driver.findElement(By.name("userName")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
		
		String expected_Title="Find";
		String actual_Title=driver.getTitle();
		
		if(actual_Title.contains(expected_Title))
		{
			System.out.println("LogIn Successfull -- PASS");
		}
		else
		{
			System.out.println("LogIn Failed -- FAIL");
		}
		
			
	}

	@Then("^User should be able to successfully login to the application and close the application$")
	public void User_should_be_able_to_successfully_login_to_the_application_and_close_the_application()  
	{
	    driver.close();
	}
	
	
}
