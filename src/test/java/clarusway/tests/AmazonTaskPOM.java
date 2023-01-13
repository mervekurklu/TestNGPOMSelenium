package clarusway.tests;

import clarusway.pages.*;
import clarusway.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTaskPOM {
    /*
Amazon Senaryosu
o https://www.amazon.com.tr/ sitesi açılır.
o Ana sayfanın açıldığı kontrol edilir.
o  Çerez tercihlerinden Çerezleri kabul et seçilir.
o  Siteye login olunur.
o Login işlemi kontrol edilir.
o Arama butonu yanındaki kategoriler tabından bilgisayar seçilir.
o Bilgisayar kategorisi seçildiği kontrol edilir.
o Arama alanına MSI yazılır ve arama yapılır.
o Arama yapıldığı kontrol edilir.
o Arama sonuçları sayfasından 2. sayfa açılır.
o 2. sayfanın açıldığı kontrol edilir.
o Sayfadaki 2. ürün favorilere eklenir.
o 2. Ürünün favorilere eklendiği kontrol edilir.
o Hesabım > Favori Listem sayfasına gidilir.
o “Favori Listem” sayfası açıldığı kontrol edilir.
o Eklenen ürün favorilerden silinir.
o Silme işleminin gerçekleştiği kontrol edilir.
o Üye çıkış işlemi yapılır.
o Çıkış işleminin yapıldığı kontrol edilir.
     */

    @Test
    public void test() {
        Driver.getDriver().get("https://www.amazon.com.tr");
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("amazon"));
        AmazonTaskPOMPage tpp=new AmazonTaskPOMPage(Driver.getDriver());
        tpp.CerezKabul();
        tpp.girisYap();
        AmazonTaskLoginPage tlp=new AmazonTaskLoginPage(Driver.getDriver());
        tlp.login();
        AmazonHomePageTask hpt=new AmazonHomePageTask(Driver.getDriver());
        hpt.loginControl();
        hpt.selectSecim();
        hpt.txtsearchMSI();
        AmazonMSIProductTask mst=new AmazonMSIProductTask(Driver.getDriver());
        mst.txtMSI();
        mst.ikinciSayfa();
        AmazonIkinciSayfaTask ist=new AmazonIkinciSayfaTask(Driver.getDriver());
        ist.sayfaIkiDogrulama();
        ist.ikinciUrurunTikla();
        AmazonFavorikinciUrunEklemeTask uet=new AmazonFavorikinciUrunEklemeTask(Driver.getDriver());
        uet.listeyeEkleme();
        uet.favoriKontrol();
        uet.closeButtonClick();
        uet.favoriListClick();
        AmazonTaskListKontrolPage kp=new AmazonTaskListKontrolPage(Driver.getDriver());
        kp.kaldırClick();
        kp.silindiControl();
        kp.cikisYapmaİslemi();
        AmazonTaskLastPage lp=new AmazonTaskLastPage(Driver.getDriver());
        lp.CikisYapıldı();

    }
}
