package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features="Feature",glue="steps",dryRun=true,monochrome=true,plugin= {"pretty","html:test-out"})
public class Run1 extends AbstractTestNGCucumberTests
{

}
