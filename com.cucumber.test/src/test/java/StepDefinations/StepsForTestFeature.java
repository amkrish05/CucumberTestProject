package StepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsForTestFeature {

	@Given("^Application \"([^\"]*)\" should be launched using \"([^\"]*)\"$")
	public void application_should_be_launched_using(String arg1, String arg2) throws Throwable {
		System.out.println("App url: "+arg1+" on "+arg2);
	}

	@Given("^User should have valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_should_have_valid_and(String arg1, String arg2) throws Throwable {
		System.out.println("username: "+arg1+" and password: "+arg2);
	}

	@When("^I launched application$")
	public void i_launched_application() throws Throwable {
		
	}

	@When("^click on login button$")
	public void click_on_login_button() throws Throwable {
	
	}

	@Then("^I should be able to logged into the application$")
	public void i_should_be_able_to_logged_into_the_application() throws Throwable {
	
	}

	@Then("^application should populated my \"([^\"]*)\" as a logged in user$")
	public void application_should_populated_my_as_a_logged_in_user(String arg1) throws Throwable {
	
	}


}
