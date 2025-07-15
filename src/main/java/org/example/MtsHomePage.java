package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MtsHomePage {
    public WebDriver driver;

    public MtsHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Локатор для кнопки "Принять" куки
    @FindBy(xpath = "//div[2]/button[3]")
    private WebElement cookieBtn;

    //Локатор для поля "Услуги связи - телефон";
    @FindBy(xpath = "//input[@id='connection-phone']")
    private WebElement connectionPhone;

    // Локатор для поля "Услуги связи - сумма";
    @FindBy(xpath = "//input[@id='connection-sum']")
    private WebElement connectionSum;

    //Локатор для поля "Услуги связи - E-mail";
    @FindBy(xpath = "//input[@id='connection-email']")
    private WebElement connectionEmail;

    //Локатор для поля "Домашний интернет - телефон";
    @FindBy(xpath = "//input[@placeholder='Номер абонента']")
    private WebElement internetPhone;

    //Локатор для поля "Домашний интернет - сумма";
    @FindBy(xpath = "//input[@id='connection-sum']")
    private WebElement internetSum;

    //Локатор для поля "Домашний интернет - E-mail";
    @FindBy(xpath = "//input[@id='connection-email']")
    private WebElement internetEmail;

    //Локатор дл поля "Рассрочка - номер счёта";
    @FindBy(xpath = "//input[@id='score-instalment']")
    private WebElement installmentNumber;

    //Локатор для поля "Рассрочка - сумма";
    @FindBy(xpath = "//input[@id='instalment-sum']")
    private WebElement installmentSum;

    //Локатор для поля "Рассрочка - E-mail";
    @FindBy(xpath = "//input[@id='instalment-email']")
    private WebElement instllmentEmail;

    //Локатор для поля "Задолженность - номер счёта";
    @FindBy(xpath = "//input[@id='score-arrears']")
    private WebElement arrearsNumber;

    //Локатор для поля "Задолженность - сумма";
    @FindBy(xpath = "//input[@id='arrears-sum']")
    private WebElement arrearsSum;

    //Локатор для поля "Задолженность - E-mail";
    @FindBy(xpath = "//input[@id='arrears-email']")
    private WebElement arrearsEmail;

    //Локатор для кнопки "Продолжить";
    @FindBy(xpath = "//form[1]/button")
    private WebElement payBtn;

    //Локатор для окна ввода реквизитов пополнения;
    @FindBy(css = "iframe.bepaid-iframe")
    private WebElement payFrame;

    //Метод нажатия на кнопку сохранения куков;
    public void clickCookieBtn() {
        cookieBtn.click();
    }


}
