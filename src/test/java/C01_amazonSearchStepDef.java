import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_amazonSearchStepDef {
    AmazonPage amazonPage = new AmazonPage();

    @Given("kullanici amazon websitesine gider")
    public void kullanici_amazon_websitesine_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }

    @Then("kullanici amazon websitesinde Nutella urununu aratir")
    public void kullanici_amazon_websitesinde_nutella_urununu_aratir() {
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);

    }

    @Then("kullanici sonuclarin Nutella icerdigini test eder")
    public void kullanici_sonuclarin_nutella_icerdigini_test_eder() {
        String expectedResult = "Nutella";
        String actualResult = amazonPage.aramaSonucElementi.getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}
