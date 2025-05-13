package techproed.stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import techproed.pages.CarRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;

public class CarRentalStepDefs {

    @Given("kullanici rentalCar safyasina gider")
    public void kullaniciRentalCarSafyasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("carRentalUrl"));
    }

    @When("login butonuna tiklar")
    public void loginButonunaTiklar() {
        CarRentalPage carRentalPage = new CarRentalPage();
        carRentalPage.loginRegisterButton.click();
    }


    @And("email ve password bilgileri ile login olur")
    public void emailVePasswordBilgileriIleLoginOlur() {
        CarRentalPage carRentalPage = new CarRentalPage();
        carRentalPage.emailTextBox.sendKeys(ConfigReader.getProperty("carRentalEmail"));
        carRentalPage.passwordTextBox.sendKeys(ConfigReader.getProperty("carRentalPassword"));
        carRentalPage.loginButton.click();

    }

    @When("registerlogin butonuna tiklar")
    public void registerloginButonunaTiklar() {
        CarRentalPage carRentalPage = new CarRentalPage();
        carRentalPage.loginRegisterButton.click();
    }

    @And("kullanici gecerli {string} ve {string} bilgilerini girer")
    public void kullaniciGecerliVeBilgileriniGirer(String email, String password) {
        CarRentalPage carRentalPage = new CarRentalPage();
        carRentalPage.emailTextBox.sendKeys(email);
        carRentalPage.passwordTextBox.sendKeys(password);
        carRentalPage.loginButton.click();

    }

    @Then("kullanici login oldugunu dogrular")
    public void kullaniciLoginOldugunuDogrular() {
        CarRentalPage carRentalPage = new CarRentalPage();
        Assert.assertFalse(carRentalPage.loginVerify.getText().contains("Login"));


    }
}