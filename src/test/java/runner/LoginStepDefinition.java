package runner;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	//initialization of webdriver
	WebDriver driver;
	
	@Given("^user opens facebook website on firefox web browser$")
	public void user_opens_facebook_website_on_firefox_web_browser() throws Throwable {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}


	@When("^user inputs username$")
	public void user_inputs_username() throws Throwable {
		driver.findElement(By.id("email")).sendKeys("rovensocialmedia@gmail.com");
	}

	@When("^user inputs password$")
	public void user_inputs_password() throws Throwable {
		driver.findElement(By.id("pass")).sendKeys("");
		driver.findElement(By.id("loginbutton")).click();
	}

	@Then("^user will be logged-in$")
	public void user_will_be_logged_in() throws Throwable {

	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {

	}
}
