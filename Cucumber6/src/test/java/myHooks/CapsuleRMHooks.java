package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class CapsuleRMHooks {
	
	@Before(order=1)
	public void setup_browser(Scenario scenario)
	{
		System.out.println("Opening the browser");
		System.out.println("Scenario name: "+scenario.getName());
		
	}
	
	@Before("@QAEnvironment")
	public void setup_database()
	{
		System.out.println("Establishing the database connection");
	}
	
	@After(order=1)
	public void tearDown_database()
	{
		System.out.println("Closing the database connection");
	}

	@After("@QAEnvironment")
	public void tearDown_browser(Scenario scenario)
	{
		System.out.println("Scenario Status: "+scenario.getStatus());
		System.out.println("Closing the browser");
	}
	
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("This is before executing the step");
		
	}
	
	@AfterStep
	public void afterStep()
	{
		System.out.println("This is after executing the step");
	}
}
