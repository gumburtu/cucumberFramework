package techproed.stepdefs;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import techproed.pages.CarRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelUtils;

import java.util.List;

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

    @And("Verilen gecerli email ve password bilgileri ile login olur")
    public void verilenGecerliEmailVePasswordBilgileriIleLoginOlur(DataTable dataTable) {
        List<List<String>> lists = dataTable.asLists();
        System.out.println("lists = " + lists);
        /*lists = [[email, password], [ayhancan@cars.com, Aa1234567!], [beyhancan@cars.com, Aa1234567!], [ceyhancan@cars.com, Aa1234567!]]         */
        CarRentalPage carRentalPage = new CarRentalPage();
        for (int i = 1; i < lists.size(); i++) {
            carRentalPage.loginRegisterButton.click();
            String email = lists.get(i).get(0);//email
            String password = lists.get(i).get(1);//password
            carRentalPage.emailTextBox.sendKeys(email);
            carRentalPage.passwordTextBox.sendKeys(password);
            carRentalPage.loginButton.click();
            carRentalPage.loginVerify.click();
            Assert.assertTrue(carRentalPage.logout.isDisplayed());
            carRentalPage.logout.click();
            carRentalPage.yesButton.click();
        }
    }

    @And("Verilen gecerli email ve password bilgileri ile login olur ikinci yol")
    public void verilenGecerliEmailVePasswordBilgileriIleLoginOlurIkinciYol(DataTable dataTable) {
        CarRentalPage carRentalPage = new CarRentalPage();
        for (int i = 1; i < dataTable.asLists().size(); i++) {
            carRentalPage.loginRegisterButton.click();
            String email = dataTable.row(i).get(0);
            String password = dataTable.row(i).get(1);
            carRentalPage.emailTextBox.sendKeys(email);
            carRentalPage.passwordTextBox.sendKeys(password);
            carRentalPage.loginButton.click();
            carRentalPage.loginVerify.click();
            Assert.assertTrue(carRentalPage.logout.isDisplayed());
            carRentalPage.logout.click();
            carRentalPage.yesButton.click();
        }

    }

    @Then("exceldeki {string} sayfasindaki kullanici bilgileri ile login olunur")
    public void exceldekiSayfasindakiKullaniciBilgileriIleLoginOlunur(String sayfaIsmi) {

        CarRentalPage carRentalPage = new CarRentalPage();
        ExcelUtils excelUtils = new ExcelUtils("src/test/resources/smoketestdata.xlsx", sayfaIsmi);

        for (int i = 1; i <= excelUtils.rowCount(); i++) {
            String email = excelUtils.getCellData(i, 0);
            String password = excelUtils.getCellData(i, 1);
            carRentalPage.emailTextBox.sendKeys(email);
            carRentalPage.passwordTextBox.sendKeys(password);
            carRentalPage.loginButton.click();
            carRentalPage.loginVerify.click();
            Assert.assertTrue(carRentalPage.logout.isDisplayed());
            carRentalPage.logout.click();
            carRentalPage.yesButton.click();
            carRentalPage.loginRegisterButton.click();
        }


    }


}