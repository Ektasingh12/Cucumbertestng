package Runners;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
		features = "src/test/java/features",
	    glue = {"code_bindings"},
	    plugin = {"pretty", "html:target/cucumber-html-report-ekta", "json:target/cucumber.json"}
)
public class LoginTest extends AbstractTestNGCucumberTests{

}
