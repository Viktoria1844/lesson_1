package org.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {
    protected static WebDriver driver;
    protected static MtsHomePage mtsHomePage;
    protected static Frame frame;
    protected static final String PAGE_URL = "https://mts.by";
    protected static final String TEST_PHONE_NUMBER = "297777777";
    protected static final String TEST_SUM = "10.00";

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
        mtsHomePage = new MtsHomePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(PAGE_URL);
        mtsHomePage.clickCookieBtn();
        mtsHomePage.setConnectionPhone(TEST_PHONE_NUMBER);
        mtsHomePage.setСonnectionSum(TEST_SUM);
        mtsHomePage.clickPayBtn();
        frame = new Frame(driver, mtsHomePage.Frame);
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
