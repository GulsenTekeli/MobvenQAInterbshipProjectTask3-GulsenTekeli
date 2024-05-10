package dr.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"dr/stepDefinitions", "dr/hooks"},
        tags = "@showCaseProduct",
        dryRun = false

)
public class Runner {

}

