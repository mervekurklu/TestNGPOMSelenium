package clarusway.pages;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TaskRadioButton {

    public TaskRadioButton() {
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "(//a[@role='button'])[2]")
    public WebElement acount;
    @FindBy(name = "firstname")
    public WebElement name;
    @FindBy(name = "lastname")
    public WebElement surname;
    @FindBy(name = "reg_email__")
    public WebElement email;
    @FindBy(name = "reg_email_confirmation__")
    public WebElement email2;
    @FindBy(id = "password_step_input")
    public WebElement password;
    @FindBy(id = "day")
    public WebElement drpDownDay;
    @FindBy(id = "month")
    public WebElement drpDownMonth;
    @FindBy(id = "year")
    public WebElement drpDownYear;
    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement womenClick;
    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement kayıtOl;

}
