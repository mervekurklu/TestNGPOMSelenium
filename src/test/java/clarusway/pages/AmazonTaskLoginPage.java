package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonTaskLoginPage {
    private WebDriver driver;

    public AmazonTaskLoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "ap_email")
    public WebElement emailsearch;

    @FindBy(id = "continue")
    public WebElement devamEtButon;

    @FindBy(id = "ap_password")
    public WebElement passwordtext;

    @FindBy(id = "signInSubmit")
    public WebElement girisButton;

    public void login(){
        emailsearch.sendKeys("mervekurklu9393@gmail.com");
        devamEtButon.click();
        passwordtext.sendKeys("merve710606");
        girisButton.click();
    }
}
