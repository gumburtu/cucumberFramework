package techproed.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)//Cucumber ile junitin entegre bir sekilde feature file daki scenariolarimiiz calistirmayi saglar
@CucumberOptions(//Bu notasyon sayesinde hangi scenariolari calistiracagimizi, hangi raporlari alacağımızı belirtiriz
        plugin = {
                "pretty",//console da scenariolarimiz ile ilgili ayrintili bilgi almamizi saglar
                "html:target/default-cucumber-report.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml",
                "rerun:TestOutput/failed_scenario.txt"
        },
        features = "@TestOutput/failed_scenario.txt",
        glue = {"techproed/stepdefs", "techproed/hooks"}

)
public class FailedRunner {
}
/*
Bu classta sadece fail olan scenariolarimizi calistiracağmız icin features package yolu yerine fail olan scenariolarimizin
depolandigi failed_scenario.txt dosyamizin yolunu belirtiriz. Dosya yolu belirttigimiz icin basina @ sembolu koymaliyizi
ayrica tags parametresine de ihtiyacimiz yok */