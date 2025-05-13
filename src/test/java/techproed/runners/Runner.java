package techproed.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)//Cucumber ile junitin entegre bir sekilde feature file daki scenariolarimiiz calistirmayi saglar
@CucumberOptions(//Bu notasyon sayesinde hangi scenariolari calistiracagimizi, hangi raporlari alacağımızı belirtiriz
        plugin = {
                "html:target/default-cucumber-report.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
        },
        features = "src/test/resources/features",
        glue = "techproed/stepdefs",
        tags = "@US007",
        dryRun = false
)
public class Runner {
}
/*
dryRun = true secilirse scenariolari calistirmadan feature file daki eksik
stepdefinitionlari kontrol eder, browser acilmaz
 */