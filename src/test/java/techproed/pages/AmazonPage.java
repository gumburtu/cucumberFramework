package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;
import techproed.utilities.ReusableMethods;

public class AmazonPage {

    /* PageFactory .initElements(Driver.getDriver(),this);
    kodu bu classtaki ögeleri driver ile eslestirir, bu sayede
    page factory ye yardimci olan notasyonlar kullanilabilir hale gelir
     */
    public AmazonPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath ="//*[contains(text(),'Try different image')]" )
    public WebElement captchaHandling;

    public void handleCaptcha(){
        try {
            ReusableMethods.click(captchaHandling);
        } catch (Exception e) {
            //captcha cıkmamasi durumunda alacağımız exceptionu burayı bos bırakarak ignore ettik
        }
    }



}