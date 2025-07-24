package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Frame {
    public WebDriver driver;

    public Frame(WebDriver driver, WebElement frameLocator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameLocator));
        // Ждем полной загрузки окна по одному из элементов формы
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[formcontrolname=creditCard] + label")));
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Определение локатора для пополняемой суммы в описании оплаты;
    @FindBy(xpath = "//span[contains(text(), '10.00 BYN')]")
    private WebElement payFrameDescriptionCost;

    //Локатор для кнопки "Оплатить";
    @FindBy(xpath = "//button[@class='colored disabled']")
    private WebElement payFrameBtn;

    //Локатор для номера телефона в описании оплаты;
    @FindBy(xpath = "//span[contains(text(), 'Оплата: Услуги связи')]")
    private WebElement payFrameDescriptionPhone;


    //Локатор для плейсхолдера поля ввода номера карты;
    @FindBy(xpath = "//div[@class='content ng-tns-c2312288139-1']")
    private WebElement creditCardPlaceholder;

    //Локатор для плейсхолдера поля ввода даты истечения карты;
    @FindBy(xpath = "//div[@class='content ng-tns-c2312288139-4']")
    private WebElement expirationDatePlaceholder;

    //Локатор для плейсхолдера поля ввода CVC;
    @FindBy(xpath = "//div[@class='content ng-tns-c2312288139-5'] ")
    private WebElement cvcPlaceholder;

    //Локатор для плейсхолдера поля ввода имени держателя карты;
    @FindBy(xpath = "//div[@class='content ng-tns-c2312288139-3'] ")
    private WebElement cardHolderPlaceholder;

    //Возвращает текст пополняемой суммы в описании оплаты;
    public String getFrameDescriptionCost() throws NoSuchElementException {
        return payFrameDescriptionCost.getText();
    }

    //Возвращает текст кнопки оплаты
    public String getFrameBtnText() throws NoSuchElementException {
        return payFrameBtn.getText();
    }

    //Возвращает текст номера телефона в описании оплаты;
    public String getFrameDescriptionPhone() throws NoSuchElementException {
        return payFrameDescriptionPhone.getText();
    }

    //Возвращает текст плейсхолдера поля ввода номера карты;
    public String getCreditCardPlaceholder() throws NoSuchElementException {
        return creditCardPlaceholder.getText();
    }

    //Возвращает текст плейсхолдера поля ввода даты истечения карты;
    public String getExpirationDatePlaceholder() throws NoSuchElementException {
        return expirationDatePlaceholder.getText();
    }

    //Возвращает текст плейсхолдера поля ввода CVC;
    public String getCvcPlaceholder() throws NoSuchElementException {
        return cvcPlaceholder.getText();
    }

    //Возвращает текст плейсхолдера поля ввода имени держателя карты;
    public String getCardHolderPlaceholder() throws NoSuchElementException {
        return cardHolderPlaceholder.getText();
    }
}
