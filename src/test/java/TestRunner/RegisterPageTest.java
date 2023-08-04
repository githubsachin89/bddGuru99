package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"AllFeatureFiles"},
		glue= {"StepDefinitions"},
		dryRun=false,
		tags="@EndToEndTesting",
		plugin= {"json:Reports/abc.json","junit:Reports/abc.xml","html:Reports/abc.html","pretty:Reports/abc.txt","pretty:Reports/abc.pdf"}
		)
public class RegisterPageTest {

}
