package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\Resources",
		glue = "stepdef",
		tags = {"@chrome_geolocation"},
		dryRun = false,
		monochrome = true
		
		
		)
public class Class {

}
