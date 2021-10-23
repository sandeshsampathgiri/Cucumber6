package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class BillingSteps {
	
	double billingAmount;
	double taxAmount;
	double finalAmount;
	
	
	
	@Given("the user is on the billing page")
	public void the_user_is_on_the_billing_page() {
	   
	}

	@When("the user enters the billing amount {string}")
	public void the_user_enters_the_billing_amount(String billingAmount) {
	    
		this.billingAmount = Double.parseDouble(billingAmount);
	}

	@When("the user enters the tax amount {string}")
	public void the_user_enters_the_tax_amount(String taxAmount) {
		this.taxAmount = Double.parseDouble(taxAmount);
	}

	@When("the user clicks on Calculate button")
	public void the_user_clicks_on_calculate_button() {
	   
	}

	@Then("it should display the final amount {string}")
	public void it_should_display_the_final_amount(String expectedFinalAmount) {
		
		this.finalAmount = this.billingAmount + this.taxAmount;
		
		System.out.println("Expected Final Amount="+Double.parseDouble(expectedFinalAmount));
		System.out.println("Actual Amount="+this.finalAmount);
		Assert.assertTrue(this.finalAmount == Double.parseDouble(expectedFinalAmount));
		
		
	}
}
