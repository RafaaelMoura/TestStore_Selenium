package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features/2-login2.feature",
        glue = "steps",
        plugin = {"pretty", "html:target/cucumber-reports"}
)

public class TestRunner {
    
}
