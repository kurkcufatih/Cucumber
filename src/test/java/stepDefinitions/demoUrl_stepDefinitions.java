package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.demoPageTekrar;
import utilities.ConfigReader;
import utilities.Driver;

import java.time.Duration;

public class demoUrl_stepDefinitions {
    demoPageTekrar demoPageTekrar = new demoPageTekrar();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(15));


    @Given("kullanici {string} anasayfasina gider")
    public void kullanici_anasayfasina_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("demoUrl"));
    }

    @When("kullanici allert uzerinde visible after five seconds yazisini gorur")
    public void kullanici_allert_uzerinde_visible_after_five_seconds_yazisini_gorur() {
        demoPageTekrar.alertAfter5Seconds.click();
        wait.until(ExpectedConditions.alertIsPresent());


    }

    @When("kullanici alert uzerindeki yazinin gorunur oldugunu test eder")
    public void kullanici_alert_uzerindeki_yazinin_gorunur_oldugunu_test_eder() {
    }

    @When("kullanici ok tusuna basarak alerti kapatir")
    public void kullanici_ok_tusuna_basarak_alerti_kapatir() {
        Driver.getDriver().switchTo().alert().accept();
    }
}
