package clarusway.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AmazonTaskLastPage {
    private WebDriver driver;

    public AmazonTaskLastPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(tagName = "h1")
    public WebElement cikisKontrol;

    public void CikisYapıldı(){
        Assert.assertTrue(cikisKontrol.isDisplayed());
    }
}
