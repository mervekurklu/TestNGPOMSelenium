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

public class AmazonFavorikinciUrunEklemeTask {

    private WebDriver driver;

    public AmazonFavorikinciUrunEklemeTask(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "add-to-wishlist-button-submit")
    public WebElement listeyeEkle;

    public void listeyeEkleme(){
        listeyeEkle.click();
    }

    @FindBy(id = "huc-item-link")
    public WebElement txtGoruntuleme;

    public void favoriKontrol(){
        Assert.assertTrue(txtGoruntuleme.isDisplayed());
    }
    @FindBy(tagName = "button")
    private WebElement closeButton;

    public void closeButtonClick(){
        closeButton.click();
    }

    @FindBy(id = "nav-link-accountList")
    public WebElement hesapButon;

    @FindBy(linkText = "Alışveriş Listesi")
    public WebElement favoriList;

    public void favoriListClick(){
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(hesapButon).perform();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(hesapButon));
        favoriList.click();
    }


}
