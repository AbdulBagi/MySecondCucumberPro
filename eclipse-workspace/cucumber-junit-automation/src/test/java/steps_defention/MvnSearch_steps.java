package steps_defention;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utilities.Config;
import utilities.Driver;

public class MvnSearch_steps {

	
	@Given("user goes to mvnrepository application")
	public void user_goes_to_mvnrepository_application() {
	  Driver.getDriver().get(Config.getProperty("mvnurl"));
	}

	@When("user searches for cucumber java")
	public void user_searches_for_cucumber_java() {
		Driver.getDriver().findElement(By.id("query")).sendKeys("cucumber java"+Keys.ENTER);
	
	}

	@Then("user should get Cucumber JVM: Java in first result")
	public void user_should_get_Cucumber_JVM_Java_in_first_result() {
	   WebElement firstResult = Driver.getDriver().findElement(By.xpath("(//div[@class='im-header'//a)[1]"));
	}

}
