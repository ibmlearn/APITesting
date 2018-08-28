package com.ibm.runner.app;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = "com.ibm.step.definition.app", dryRun = false, strict = false, monochrome = true,
		// tags = {"@tag1"},
		plugin = { "html:target/cucumber/html", "json:target/cucumber/cucumber-json.json",
				"pretty:target/cucumber/cucumber-pretty.txt", "usage:target/cucumber/cucumber-usage.json",
				"junit:target/cucumber/cucumber-junit.xml",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber/cucumber-extentreport.html" })
public class TargetingSupportEndPointRunner {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("*************************************************");
	}

	@AfterClass
	public static void writeExtentReport() {
		String reportConfigPath = System.getProperty("user.dir") + "/src/test/resources/report/extent-config.xml";
		Reporter.loadXMLConfig(new File(reportConfigPath));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
		Reporter.setSystemInfo("Selenium", "3.7.0");
		Reporter.setSystemInfo("Maven", "3.5.2");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");
		Reporter.setTestRunnerOutput("Cucumber reporting using Extent reports");
	}

}
