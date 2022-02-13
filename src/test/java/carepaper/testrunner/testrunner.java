package carepaper.testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/testscenarios",
glue={"carepaper/teststepsdefinition"},
monochrome = true,
plugin = { "pretty", "html:target/HTMLreports/HTMLreport.html","json:target/JSONreports/JSONreport.json","junit:target/JUNITreports/jUnitreport.xml"},
tags = " @L_TC_1"
//dryRun=true

)

public class testrunner {

}
