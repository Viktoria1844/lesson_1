package org.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePageMtsHome {
    public static WebDriver driver;
    public static MtsHomePage mtsHomePage;
    public static String PAGE_URL = "https://mts.by";

    @BeforeAll
    static void before() {
        driver = new ChromeDriver();
        mtsHomePage = new MtsHomePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(PAGE_URL);
        mtsHomePage.clickCookieBtn();
    }

    @AfterAll
    static void after() {
        driver.quit();
    }
}
