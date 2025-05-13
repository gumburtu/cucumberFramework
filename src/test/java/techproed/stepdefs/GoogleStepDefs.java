package techproed.stepdefs;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.GooglePage;
import techproed.utilities.Driver;
import techproed.utilities.WaitUtils;

public class GoogleStepDefs {

    GooglePage googlePage = new GooglePage();

    @When("google arama kutusunda {string} aratilir")
    public void googleAramaKutusundaAratilir(String str) {
        googlePage.searchBox.sendKeys(str+ Keys.ENTER);
    }

    @Then("sayfa basliginin {string} icerdigini test eder")
    public void sayfaBasligininIcerdiginiTestEder(String str) {
        WaitUtils.waitFor(2);
        Assert.assertTrue(Driver.getDriver().getTitle().contains(str));
    }

    @But("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int saniye) {
        WaitUtils.waitFor(saniye);
    }


}