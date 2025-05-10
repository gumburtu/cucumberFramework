package techproed.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class AmazonStepDefs {

    @Given("Kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @When("Arama kutusunda iphone aratir")
    public void arama_kutusunda_iphone_aratir() {
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.searchBox.sendKeys("iphone");
        amazonPage.searchBox.submit();
    }

    @When("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }


}