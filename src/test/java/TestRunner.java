import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:./reports/html", "json:./reports/json/TestResults", "config.CucumberEventListener"},
		features = "src/test/java/features",
		glue = "steps")
public class TestRunner {
}
