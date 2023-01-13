package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AmazonMSIProductTask {
    private WebDriver driver;

    public AmazonMSIProductTask(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[.='MSI']")
    public WebElement MSItxt;

    public void txtMSI(){
        Assert.assertTrue(MSItxt.getText().contains("MSI"));
    }
    @FindBy(xpath = "(//a[@class='s-pagination-item s-pagination-button'])[1]")
    public WebElement sayfaiki;

    public void ikinciSayfa(){
        JavascriptExecutor jse=(JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView();" ,sayfaiki);
        sayfaiki.click();
    }
}
