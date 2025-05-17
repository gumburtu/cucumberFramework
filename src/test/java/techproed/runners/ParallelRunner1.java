package techproed.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)//Cucumber ile junitin entegre bir sekilde feature file daki scenariolarimiiz calistirmayi saglar
@CucumberOptions(//Bu notasyon sayesinde hangi scenariolari calistiracagimizi, hangi raporlari alacağımızı belirtiriz
        plugin = {
                "pretty",//console da scenariolarimiz ile ilgili ayrintili bilgi almamizi saglar
                "html:target/default-cucumber-report1.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-reports/cucumber1.xml",
                "rerun:TestOutput/failed_scenario.txt"
        },
        features = "src/test/resources/features",
        glue = {"techproed/stepdefs", "techproed/hooks"},
        tags = "@US011",
        dryRun = false,
        monochrome = false//true iken console daki ciktilari tek renk olarak verir
)
public class ParallelRunner1 {
}
/*
dryRun = true secilirse scenariolari calistirmadan feature file daki eksik
stepdefinitionlari kontrol eder, browser acilmaz
==> rerun plugini sayesinde fail olan scenariolari (TestOutput/failed_scenario.txt) konumunda
bir txt dosyasi icinde tutabilir ve olusturacağımız bir özel runner class ile calistirabiliriz
 */


