package org.example;

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
import java.util.concurrent.TimeUnit;

import static javax.swing.UIManager.put;
import static org.junit.jupiter.api.Assertions.*;

class MtsHomePageTest {
    public static MtsHomePage mtsHomePage;
    public static WebDriver driver;
    public static final String PAGE_URL = "http://mts.by";
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

    @ParameterizedTest
    @DisplayName("Картинки платежных систем")
    @ValueSource(strings = {"visa.svg", "visa-verified.svg", "mastercard.svg", "mastercard-secure.svg", "belkart.svg"})
    void payPics(String src) {
        try {
            assertTrue(mtsHomePage.isDisplayedImg(src), "Картинка " + src + " не отображается");
            System.out.println("Картинка " + src + " отображается");
        } catch (NoSuchElementException e) {
            fail("Картинка " + src + " не найдена");
        }
    }

    @Test
    @DisplayName("Ссылка 'Подробнее о сервисе'")
    void detailLink() {
        String urlLink = null;
        try {
            urlLink = mtsHomePage.getLinkUrl();
            int linkResponseCode = mtsHomePage.getRespCode(urlLink);
            assertTrue(linkResponseCode < 400, "Ссылка " + urlLink + " битая (код: " + linkResponseCode + ")");
            System.out.println("Ссылка " + urlLink + " рабочая (код: " + linkResponseCode + ")");
        } catch (NoSuchElementException e) {
            fail("Нет ссылки");
        } catch (MalformedURLException e) {
            fail("Не корректный url: " + urlLink);
        } catch (IOException e) {
            fail("Проблема с соединением");
        }
    }

    @Test
    @DisplayName("Работа кнопки 'Продолжить'")
    void payForm() throws InterruptedException {
        String name = "Окно оплаты";
        try {
            mtsHomePage.setPhoneField("297777777");
            mtsHomePage.setSumField("10");
            mtsHomePage.clickPayBtn();
            wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[contains(@class, 'bepaid-iframe')]")));
            System.out.println(name + " открылось");
        } catch (NoSuchElementException e) {
            fail("Элемент не найден");
        }
    }

    @AfterEach
    void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


