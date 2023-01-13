package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonTaskPOMPage {

    private WebDriver driver;

    public AmazonTaskPOMPage(WebDriver driver) {
        this.driver=driver;
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "accept")
    public WebElement cerezleriKabulEt;

    public void CerezKabul(){
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(cerezleriKabulEt)).click();
    }

    @FindBy(id = "nav-link-accountList")
    public WebElement hesapButon;

    @FindBy(partialLinkText = "Giriş yap")
    public WebElement girisYapButon;

    public void girisYap(){
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(hesapButon).perform();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(girisYapButon)).click();
    }
}
