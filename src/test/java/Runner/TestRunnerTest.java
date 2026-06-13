//package Runner;
//
//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import org.junit.runner.RunWith;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//        features = "src/test/resources/features/login.feature",
//        glue = "StepDefinitions",
//        plugin = {
//                "pretty",
//                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
//        },
//        tags="@smoke",
//        monochrome = true
//)
//public class TestRunnerTest {
//}


package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
       // features = "src/test/resources/features/api_test.feature",
        features = "src/test/resources/features/login.feature",
        glue = "StepDefinitions",
        plugin = {
                "pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
       // tags="@smoke",

        monochrome = true
)
public class TestRunnerTest {
}
//mvn clean test