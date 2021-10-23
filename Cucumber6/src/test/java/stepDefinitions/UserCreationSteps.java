package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;

public class UserCreationSteps {

	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {

		System.out.println("the user is on the home page");

	}

	@When("the user enters the following details")
	public void the_user_enters_the_following_details(DataTable dataTable) {

		List<List<String>> userList = dataTable.asLists(String.class);

		for (List<String> e : userList) {
			System.out.println(e);
		}

	}

	@When("the user enters the following details with the columns")
	public void the_user_enters_the_following_details_with_the_columns(DataTable dataTable) {

		List<Map<String, String>> userList = dataTable.asMaps(String.class, String.class);

		// System.out.println(userList);
		System.out.println("****************************");

		for (Map<String, String> e : userList) {
			System.out.println(e.get("firstname"));
			System.out.println(e.get("lastname"));
			System.out.println(e.get("Email Address"));
			System.out.println(e.get("Mobile"));
			System.out.println(e.get("City"));

			System.out.println("****************************");

		}

	}

	@Then("the user should be created successfully")
	public void the_user_should_be_created_successfully() {
		System.out.println("the user should be created successfully");
	}

}
