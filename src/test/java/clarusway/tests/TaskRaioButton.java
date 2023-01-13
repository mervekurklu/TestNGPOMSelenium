package clarusway.tests;

import clarusway.pages.TaskRadioButton;
import clarusway.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class TaskRaioButton {

    /*
    // Go to URL:  https://www.facebook.com/
// Click on Create an Account button.
//  Then click on the radio buttons.
// Click 'Kadın'
// Click 'Erkek'
     */

    @Test
    public void test() {
        Driver.getDriver().get("https://www.facebook.com/");
        TaskRadioButton fcbk=new TaskRadioButton();
        fcbk.acount.click();
        fcbk.name.sendKeys("merve");
        fcbk.surname.sendKeys("yıldırım");
        fcbk.email.sendKeys("ebikgabık@gmail.com"+Keys.TAB);
        fcbk.email2.sendKeys("ebikgabık@gmail.com");
        fcbk.password.sendKeys("123456");
        Select select=new Select(fcbk.drpDownDay);
        Select select2=new Select(fcbk.drpDownMonth);
        Select select3=new Select(fcbk.drpDownYear);
        select.selectByValue("10");
        select2.selectByIndex(5);
        select3.selectByVisibleText("1997");
        fcbk.womenClick.click();
        fcbk.kayıtOl.click();
        Driver.closeDriver();










    }
}
