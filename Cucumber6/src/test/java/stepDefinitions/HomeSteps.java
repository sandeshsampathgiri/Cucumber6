package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {
	
	@Given("the user has already logged in")
	public void the_user_has_already_logged_in() {
		
		System.out.println("The user has already logged in");
	   
	}

	@When("the user chooses the option to log out")
	public void the_user_chooses_the_option_to_log_out() {
		
		System.out.println("The user chooses the option to log out");
	    
	}

	@Then("the user should be logged out successfully")
	public void the_user_should_be_logged_out_successfully() {
		
		System.out.println("The user should be logged out successfully");
	    
	}

	@And("the login page should be displayed to the user")
	public void the_login_page_should_be_displayed_to_the_user() {
		
		System.out.println("The login page should be displayed to the user");
	    
	}

}
