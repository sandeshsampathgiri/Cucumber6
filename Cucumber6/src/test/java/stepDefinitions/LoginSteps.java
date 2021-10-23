package stepDefinitions;

import CapsuleCRMImplementation.Login;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	Login login;

	@Given("the user accesses the CapsuleCRM website")
	public void the_user_accesses_the_capsule_crm_website() {

	}

	@When("the user logs in with the username {string} and password {string}")
	public void the_user_logs_in_with_the_username_and_password(String username, String password) {

		login = new Login(username, password);

	}

	@Then("the home page should be displayed successfully")
	public void the_home_page_should_be_displayed_successfully() {

	}

	@Then("the user should not be able to home page successfully")
	public void the_user_should_not_be_able_to_home_page_successfully() {

	}

	@When("^the user enters only the password \"([a-zA-Z0-9]+)\" and tries to login$")
	public void the_user_enters_only_the_password_and_tries_to_login(String string) {

		System.out.println("he user enters only the password and tries to login");

	}

	@Then("the validation message should be displayed to the user")
	public void the_validation_message_should_be_displayed_to_the_user() {

	}

	@When("^the user enters only the username \"([a-zA-Z0-9]+)\" and tries to login$")
	public void the_user_enters_only_the_username_and_tries_to_login(String string) {

		System.out.println("he user enters only the username and tries to login");

	}

}
