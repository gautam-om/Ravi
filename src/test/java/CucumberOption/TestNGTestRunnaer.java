package CucumberOption;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="./src/test/java/Features/FbLogin.feature",
		glue="StepDefination",
		plugin={"pretty",
                "json:reports/MyReports/report.json",
                "json:reports/MyReports/report.xml"
}
		)

public class TestNGTestRunnaer extends AbstractTestNGCucumberTests {

}
