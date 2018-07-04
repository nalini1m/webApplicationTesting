package newToursApplicationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LogInTest
{
	FirefoxDriver driver;
	@Given("^Open FireFox Browser and navigate to Application$")
	public void Open_FireFox_Browser_and_navigate_to_Application() throws Throwable
	{
		driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
	}

	@When("^User enters valid \"([^\"]*)\" and \"([^\"]*)\" and click on SignIn button$")
	public void User_enters_valid_and_and_click_on_SignIn_button(String UserName, String Password) throws Throwable 
	{
		driver.findElement(By.name("userName")).sendKeys(UserName);
		driver.findElement(By.name("password")).sendKeys(Password);
		driver.findElement(By.name("login")).click();
	}

	@Then("^User should be able to successfully login and close the application$")
	public void User_should_be_able_to_successfully_login_and_close_the_application() throws Throwable
	{
		driver.close();
	}
	
}
