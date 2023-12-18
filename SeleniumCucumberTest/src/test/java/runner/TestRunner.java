package runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome=true,
        features = "src/test/java/resources/features/",
        glue= {"src/test/java/StepDefinition.BasePage", "src/test/java/utility"},
        plugin= {"pretty", "html:target/cucumber-html-report","json:cucumber.json"},
        dryRun = true
                )
    public class TestRunner{
}
