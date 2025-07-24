package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOfElementLocated;

class FrameTest extends BasePage {

    @Test
    @DisplayName("Сумма в заголовке")
    void descriptionCost() {
        String actualValue = frame.getFrameDescriptionCost();
        assertEquals(TEST_SUM, actualValue);
    }

    @Test
    @DisplayName("Текст кнопки оплаты")
    void btnText() {
        String actualValue = frame.getFrameBtnText();
        assertEquals("Оплатить " + TEST_SUM + " BYN", actualValue);
    }

    @Test
    @DisplayName("Номер телефона в заголовке")
    void descriptionPhone() {
        String actualValue = frame.getFrameDescriptionPhone();
        assertEquals("Оплата: Услуги связи Номер:375" + TEST_PHONE_NUMBER, actualValue);
    }

    @Test
    @DisplayName("Картинки платежных систем")
    void payPics() {
        WebElement logoElement = driver.findElement(By.cssSelector("div.cards-brands img"));
        assertTrue(logoElement.isDisplayed());

    }

    @ParameterizedTest
    @DisplayName("Плейсхолдеры реквизитов карты")
    @CsvSource({
            "Поле ввода номера карты, Номер карты",
            "Поле ввода срока действия карты, Срок действия",
            "Поле ввода CVC, CVC",
            "Поле ввода имени держателя, Имя и фамилия на карте"})
    void checkPlaceholders(String name, String expectedPlaceholder) {
        String actualPlaceholder = "";
        switch (name) {
            case ("Поле ввода номера карты"):
                actualPlaceholder = frame.getCreditCardPlaceholder();
                break;
            case ("Поле ввода срока действия карты"):
                actualPlaceholder = frame.getExpirationDatePlaceholder();
                break;
            case ("Поле ввода CVC"):
                actualPlaceholder = frame.getCvcPlaceholder();
                break;
            case ("Поле ввода имени держателя"):
                actualPlaceholder = frame.getCardHolderPlaceholder();
                break;
        }
        assertEquals(expectedPlaceholder, actualPlaceholder, name + " не совпадает");
        System.out.println(name + " совпадает: " + actualPlaceholder);
    }
}