package clarusway.tests;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day01_C01_DriverExample {

    /*
    Page Object Model /Pattern, Web UI(USer Interface) elementleri için oluşturulan,
test otomasyonunda yaygın olarak kullanılan bir tasarım
modelidir.
Herbir web sayfası için page class'ı olmalı ve burada o sayfaya ait
tüm WebElement'ler tanımlanmalıdır.
Page Object Model'in uygulanması test objeleriyle test scriptlerini
ayırmayı sağlar. Bu da birçok kolaylık ve avantaj sağlar.
Page Factory Class; Selenium WebDriver tarafından Page Object
Modelini uygulamak için kullanılan bir class'tır.

Niçin Page Object Model?
✓ Kod daha okunabilir ve anlaşılabilir bir modeldir.
✓ Büyüyen test paketinin bakımı daha kolaydır.
✓ Yeniden kullanılabilir(objects, classes, methods, data)
✓ Debugging daha kolay olması için bağımsız test senaryoları oluşturmamızı sağlar.
✓ Test execution(uygulama) süresini hızlandırır.
✓ Daha iyi, sürdürülebilir, daha hızlı ve anlaşılır olmasını sağlamak için tercih edilir
     */

    /*
    Day01_C01_DriverExample
Go to URL: https://opensource-demo.orangehrmlive.com/
Verify title contains OrangeHRM.
Use Driver Class.
     */

    @Test
    public void test() {
        Driver.getDriver().get("https://opensource-demo.orangehrmlive.com/");
        String title=Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("OrangeHRM"));
        Driver.closeDriver();
    }

    @Test//hangisini kullanmak istersen
    public void test02() {
        WebDriver driver=Driver.getDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        String title=Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("OrangeHRM"));
        Driver.closeDriver();

    }
}
