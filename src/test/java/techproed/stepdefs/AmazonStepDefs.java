package techproed.stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import techproed.pages.AmazonPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

import java.util.List;

public class AmazonStepDefs {

    @Given("Kullanici amazon sayfasina gider")
    public void kullanici_amazon_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @When("Arama kutusunda iphone aratir")
    public void arama_kutusunda_iphone_aratir() {
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.handleCaptcha();
        amazonPage.searchBox.sendKeys("iphone");
        amazonPage.searchBox.submit();
    }

    @When("Arama kutusunda samsung aratir")
    public void aramaKutusundaSamsungAratir() {
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.handleCaptcha();
        amazonPage.searchBox.sendKeys("samsung");
        amazonPage.searchBox.submit();
    }


    @When("Arama kutusunda nokia aratir")
    public void aramaKutusundaNokiaAratir() {
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.handleCaptcha();
        amazonPage.searchBox.sendKeys("nokia");
        amazonPage.searchBox.submit();
    }

    @When("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();
    }


    @When("Arama kutusunda {string} aratir")
    public void aramaKutusundaAratir(String str) {
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.handleCaptcha();
        amazonPage.searchBox.sendKeys(str);
        amazonPage.searchBox.submit();
    }


    @Given("Kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String url) {
        Driver.getDriver().get(url);
    }


    @When("verilen bilgiler ile arama yapar")
    public void verilenBilgilerIleAramaYapar(DataTable dataTable) {

        List<String> list = dataTable.asList();
        System.out.println("list = " + list);//list = [tablet, mouse, keyboard]

        AmazonPage amazonPage = new AmazonPage();
        amazonPage.handleCaptcha();

        for (int i = 0; i < list.size(); i++) {
            amazonPage.searchBox.sendKeys(list.get(i), Keys.ENTER);
            amazonPage.searchBox.clear();
        }
    }


    @When("verilen bilgiler ile arama yapar ikinci yol")
    public void verilenBilgilerIleAramaYaparIkinciYol(List<String> list) {
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.handleCaptcha();
        for (String w : list) {
            amazonPage.searchBox.sendKeys(w, Keys.ENTER);
            amazonPage.searchBox.clear();
        }
    }

}