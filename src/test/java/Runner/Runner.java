package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Feature",
glue = "StepDefination", monochrome = true, plugin= {"pretty", "html:target/saraReportr.html", "json:target/SaraJsonReport.json"}) //tags="@smoke and @regression")
public class Runner extends AbstractTestNGCucumberTests{

}
