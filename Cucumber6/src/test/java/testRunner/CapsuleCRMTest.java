package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/appFeatures" },
glue = { "stepDefinitions"},
//glue = { "stepDefinitions","myHooks"},
plugin = { "pretty", "json:target/MyReports/testreport.json", "junit:target/MyReports/testreport.xml" },
//tags = "@QAEnvironment or @UATEnvironment or @ProductionEnvironment",
dryRun = false

//tags = "@QAEnvironment and @UATEnvironment and @ProductionEnvironment"
//tags = "@QAEnvironment or @UATEnvironment or @ProductionEnvironment"
//tags = "not @ProductionEnvironment"
//tags = "@All"

)
public class CapsuleCRMTest {

}
