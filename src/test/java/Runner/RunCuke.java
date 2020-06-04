package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (features = {"src/test/resources/Feature"},
glue = {"Steps"},
monochrome = true,tags = {"@Survey"}
		)
public class RunCuke extends AbstractTestNGCucumberTests{

}
