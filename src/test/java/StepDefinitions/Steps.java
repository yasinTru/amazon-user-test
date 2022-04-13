package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Steps {

    WebDriver driver= null;


    @Given("Kullanıcının bilgileri sitede kayıtlıdır.")
    public void kullanicinin_bilgileri_sitede_kayitlidir() {

        System.out.println("Kulllanıcı siteye giriş yapti.");
        String projectPath=System.getProperty("user.dir");
        System.out.println("Path: "+ projectPath);
        System.setProperty("webdriver.chrome.driver","C:/Users/yasin/IdeaProjects/BddProject1/src/test/drivers/chromedriver.exe");
        driver= new ChromeDriver();
        // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


    }
    @And("Kullanıcı siteye giriş yapar.")
    public void kullanıcı_siteye_giriş_yapar() {
        driver.navigate().to("https://amazon.com.tr");
        driver.manage().window().maximize();
    }
    @When("Kullanıcı sitede ürün aramak için textbox'a ürün adını yazar.")
    public void kullanıcı_sitede_ürün_aramak_için_textboxa_ürün_adını_yazar() {
        driver.findElement(By.name("field-keywords")).sendKeys("Bisiklet");

    }
    @And("Arama butonuna basar.")
    public void arama_butonuna_basar() {
        driver.findElement(By.name("field-keywords")).sendKeys(Keys.ENTER);

    }
    @Then("Kullanıcı arama sonucuna göre filtrelenen sayfaya ulaşır.")
    public void kullanıcı_arama_sonucuna_göre_filtrelenen_sayfaya_ulaşır() {
       driver.getPageSource().contains("bisiklet");

    }
    @When("Kullanıcı seçtiği bir ürüne tıklar.")
    public void kullanıcı_seçtiği_bir_ürüne_tıklar() {
        driver.findElement(By.className("s-image")).click();

    }
    @Then("Kullanıcı ürün detaylarının olduğu sayfaya yönlendirilir.")
    public void kullanıcı_ürün_detaylarının_olduğu_sayfaya_yönlendirilir() {

        System.out.println("kullanıcı ürünün bulunduğu sayfaya yönlendiriliyor.");
        driver.findElement(By.id("add-to-cart-button"));
    }
    @When("Kullanıcı ürünü sepete ekler.")
    public void kullanıcı_ürünü_sepete_ekler() {

        driver.findElement(By.id("add-to-cart-button")).click();


    }

}
