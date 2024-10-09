package test_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features", // Path to your feature files
    glue = "step_definitions",                // Path to your step definitions package
    plugin = {"pretty", "html:target/cucumber-reports", "json:target/cucumber.json"}, // Reporting
    monochrome = true                         // Makes console output more readable
)

public class testrun extends AbstractTestNGCucumberTests {
    // Inherit AbstractTestNGCucumberTests for TestNG integration
}

