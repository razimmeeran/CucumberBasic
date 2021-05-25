package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				
				features = "C:/Users/Home PC/eclipse-Myworkspace/CucumberBDD_FreeCRMTest1/src/main/java/Features", 
				glue= {"stepDefinition"},
				//format= {"pretty","html:test-output","json:json_output/cucumber.json"},
				plugin = {"pretty","html:target/cucumber-html-report", "json:target/cucumber-json-report.json", "junit:target/junit_xml/cucumber.xml" },
				monochrome = true,
				dryRun =false,
				strict=true
		)
	
public class TestRunner {

}
