package clarusway.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AmazonIkinciSayfaTask {

    private WebDriver driver;

    public AmazonIkinciSayfaTask(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void sayfaIkiDogrulama(){
        Assert.assertTrue(driver.getCurrentUrl().contains("page=2"));
    }

    @FindBy(xpath = "(//h2/a)[2]")
    public WebElement ikinciUrun;

    public void ikinciUrurunTikla(){
        ikinciUrun.click();
    }

}
