package techproed.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import techproed.utilities.Driver;

public class Hook {

    @Before
    public void setUp() throws Exception {
        System.out.println("Hooks classtaki @Before methodu herbir scenariodan once calistirilir");
    }

    @Before("@iphone")
    public void setUp2() throws Exception {
        System.out.println("sadece @iphone tagina sahip olan scenariolardan ONCE calistirilir");
    }


    @After("@nokia")
    public void tearDown2() throws Exception {
        System.out.println("sadece @nokia tagina sahip olan scenariolardan SONRA calistirilir");

    }


    @After
    public void tearDown(Scenario scenario) throws Exception {
        if (scenario.isFailed()) {//eğer scenario fail olursa calisacak
            TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
            scenario.attach(ts.getScreenshotAs(OutputType.BYTES), "image/png", "scenario_" + scenario.getName());
            Driver.closeDriver();
        }
    }


}