package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AmazonTaskListKontrolPage {

    private WebDriver driver;

    public AmazonTaskListKontrolPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "profile-list-name")
    public WebElement alisverisList;

    public void alisverisListKontrol(){
        Assert.assertTrue(alisverisList.isDisplayed());
    }
    @FindBy(name = "submit.deleteItem")
    public WebElement kaldırtxt;

    public void kaldırClick(){
        kaldırtxt.click();
    }

    @FindBy(xpath = "//div[text()='Silindi']")
    public WebElement silindi;

    public void silindiControl(){
        Assert.assertTrue(silindi.isDisplayed());
    }
    @FindBy(id = "nav-link-accountList")
    public WebElement hesapButton;

    @FindBy(partialLinkText = "Çıkış Yap")
    public WebElement cikisYap;

    public void cikisYapmaİslemi(){
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(hesapButton).perform();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(cikisYap)).click();

    }

}
