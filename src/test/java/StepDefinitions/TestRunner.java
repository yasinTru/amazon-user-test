package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Features/login.feature",
        glue={"StepDefinitions"},
        monochrome = true,
        plugin = {"pretty", "json:target/JsonReports/report.json",
        "html:target/HtmlReports"})
public class TestRunner {

}
