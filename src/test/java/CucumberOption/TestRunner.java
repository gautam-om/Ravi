package CucumberOption;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/test/java/Features/FbLogin.feature",
				glue="StepDefination",
				plugin={"pretty",
		                "json:reports/MyReports/report.json",
		                "json:reports/MyReports/report.xml"
		},
				//tags="SmokeTest",
				stepNotifications = true	
		)
public class TestRunner  {

}
