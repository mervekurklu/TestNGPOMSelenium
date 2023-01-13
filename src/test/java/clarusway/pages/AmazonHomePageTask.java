package clarusway.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AmazonHomePageTask {
    private WebDriver driver;

    public AmazonHomePageTask(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "nav-link-accountList-nav-line-1")
    public WebElement txtloginControl;

    public void loginControl(){
        Assert.assertTrue(txtloginControl.getText().toLowerCase().contains("merve"));
    }

    @FindBy(id = "searchDropdownBox")
    public WebElement drpDownSelect;

    public void selectSecim(){
        Select select=new Select(drpDownSelect);
        select.selectByVisibleText("Bilgisayarlar");
    }
    @FindBy(id = "twotabsearchtextbox")
    public WebElement searchbox;

    public void txtsearchMSI(){
        searchbox.sendKeys("MSI"+ Keys.ENTER);
    }
}
