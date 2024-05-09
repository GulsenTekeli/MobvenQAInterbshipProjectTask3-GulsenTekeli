package dr.hooks;

import dr.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Hook {

    public static class Hooks{
        protected WebDriver driver;
        @Before()
        public void setUp() throws Exception {
            Dimension size = new Dimension(412, 915);
            Driver.getDriver().manage().window().setSize(size);
            Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }


        @After()
        public void tearDown(Scenario scenario) throws Exception {
            if( scenario.isFailed()){
                TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
                scenario.attach(ts.getScreenshotAs(OutputType.BYTES),"image/png","scenario"+scenario.getName());
                //Driver.closeDriver();
            }
        }


    }
}
