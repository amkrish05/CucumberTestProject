package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:feature/TestFeature.feature",glue= {"StepDefinations"},tags= {"@tag1"})
public class TestRunner {

}
