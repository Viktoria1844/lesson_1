package org.example;

import dev.failsafe.internal.util.Assert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static javax.swing.UIManager.put;
import static org.junit.jupiter.api.Assertions.*;

class MtsHomePageTest {
    private static MtsHomePage mtsHomePage;
    private static WebDriver driver;
    private static final String PAGE_URL = "http://mts.by";
    WebDriverWait wait;


    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        mtsHomePage = new MtsHomePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(PAGE_URL);
        mtsHomePage.clickCookieBtn();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

    }

    @Test
    @DisplayName("Заголовок формы")
    public void title() {
        String expectedTitle = "Онлайн пополнение без комиссии";
        Assertions.assertTrue(mtsHomePage.getTitleBlock().contains(expectedTitle));
    }

    @Test
    @DisplayName("Картинки платежных систем")
    void Pics() {
        Map<String, String> logos = new HashMap<>();
        logos.put("Visa", "visa-logo");
        logos.put("MasterCard", "mastercard-logo");
        logos.put("mastercard-secure", "mastercard-secure-logo");
        logos.put("belkart", "belkart-logo");
        logos.put("visa-verified", "visa-verified-logo");

        WebElement logoElement = driver.findElement(By.xpath("//section[@class='pay']//img"));
        assertTrue(logoElement.isDisplayed());

    }

    @Test
    @DisplayName("Ссылка 'Подробнее о сервисе'")
    void detailLink() throws IOException {
        String urlLink = null;
        urlLink = mtsHomePage.getLinkUrl();
        int linkResponseCode = mtsHomePage.getRespCode(urlLink);
        assertTrue(linkResponseCode < 400);
    }

    @Test
    @DisplayName("Работа кнопки 'Продолжить'")
    void payForm() {
        String name = "Окно оплаты";
        mtsHomePage.setPhoneField("297777777");
        mtsHomePage.setSumField("10");
        mtsHomePage.clickPayBtn();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@class, 'bepaid-iframe')]")));
        System.out.println(name + " открылось");
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


