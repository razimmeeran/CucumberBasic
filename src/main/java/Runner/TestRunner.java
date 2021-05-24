package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				
				features = "C:/Users/Home PC/eclipse-Myworkspace/CucumberBDD_FreeCRMTest1/src/main/java/Features", 
				glue= {"stepDefinition"},
				monochrome = true,plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" }
				
		)
	
public class TestRunner {

}
