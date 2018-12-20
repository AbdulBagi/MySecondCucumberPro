package steps_defention;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import utilities.Driver;

public class GoogleSearch_steps {
	
	@Given("user goes to google.com")
	public void user_goes_to_google_com(){
	Driver.getDriver().get("http:google.com");
	}
	
	@When("user searches for apple")
	public void users_searches_for_apple() {
		Driver.getDriver().findElement(By.name("q")).sendKeys("apple" + Keys.ENTER);
		
	}
	
	@Then("user should see apple related result")
	public void user_should_see_apple_related_result() {
		Assert.fail("This is failure on purpose");
	}
	
	
}
