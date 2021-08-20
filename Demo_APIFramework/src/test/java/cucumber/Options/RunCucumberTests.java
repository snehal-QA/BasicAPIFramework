package cucumber.Options;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="src/test/java/features",
plugin ="html:target/cucumber-reports/cucumber-report.html"
,glue= {"stepDefinitions"})
public class RunCucumberTests extends AbstractTestNGCucumberTests {	

}
