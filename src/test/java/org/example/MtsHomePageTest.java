package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class MtsHomePageTest {
    public static WebDriver driver;
    public static MtsHomePage mtsHomePage;
    public static String PAGE_URL = "https://mts.by";

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        mtsHomePage = new MtsHomePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(PAGE_URL);
        mtsHomePage.clickCookieBtn();
    }

    @ParameterizedTest
    @DisplayName("Проверка плейсхолдера формы оплаты на главной странице")
    @CsvSource({
            "connection-phone, Номер телефона",
            "connection-sum, Сумма",
            "connection-email, E-mail для отправки чека",
            "internet-phone, Номер абонента",
            "internet-sum, Сумма",
            "internet-email, E-mail для отправки чека",
            "number-instalment, Номер счета на 44",
            "instalment-sum, Сумма",
            "instalment-email, E-mail для отправки чека",
            "number-arrears, Номер счета на 2073",
            "arrears-sum, Сумма",
            "arrears-email, E-mail для отправки чека"
    })
    public void checkPlaceholders(String id, String expectedPlaceholder) {
        String actualPlaceholder = "";
        try {
            switch (id) {
                case ("connection-phone"):
                    actualPlaceholder = mtsHomePage.getConnectionPhonePlaceholder();
                    break;
                case ("connection-sum"):
                    actualPlaceholder = mtsHomePage.getConnectionSumPlaceholder();
                    break;
                case ("connection-email"):
                    actualPlaceholder = mtsHomePage.getConnectionEmailPlaceholder();
                    break;
                case ("internet-phone"):
                    actualPlaceholder = mtsHomePage.getInternetPhonePlaceholder();
                    break;
                case ("internet-sum"):
                    actualPlaceholder = mtsHomePage.getInternetSumPlaceholder();
                    break;
                case ("internet-email"):
                    actualPlaceholder = mtsHomePage.getInternetEmailPlaceholder();
                    break;
                case ("number-instalment"):
                    actualPlaceholder = mtsHomePage.getInstallmentNumberPlaceholder();
                    break;
                case ("instalment-sum"):
                    actualPlaceholder = mtsHomePage.getInstallmentSumPlaceholder();
                    break;
                case ("instalment-email"):
                    actualPlaceholder = mtsHomePage.getInstallmentEmailPlaceholder();
                    break;
                case ("number-arrears"):
                    actualPlaceholder = mtsHomePage.getArrearsNumberPlaceholder();
                    break;
                case ("arrears-sum"):
                    actualPlaceholder = mtsHomePage.getArrearsSumPlaceholder();
                    break;
                case ("arrears-email"):
                    actualPlaceholder = mtsHomePage.getArrearsEmailPlaceholder();
                    break;
            }
            assertEquals(actualPlaceholder, expectedPlaceholder, id + " плейсхолдер не соответствует");
            System.out.println(id + " плейсхолдер соответствует");
        } catch (NoSuchElementException e) {
            fail(id + " плейсхолдер не найден");
        }
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
