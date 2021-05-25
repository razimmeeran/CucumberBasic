/*===================================================
We Will be learning following cucumber options in this video:
@CucumberOptions(
   features = the path of the feature files
   glue=the path of the step definition files
   format= to generate different types of reporting
   monochrome = display the console output in a proper readable format
   strict = it will check if any step is not defined in step definition file
   dryRun = to check the mapping is proper between feature file and step def file
   )

================================================*/

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
