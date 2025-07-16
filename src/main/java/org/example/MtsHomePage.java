package org.example;

import org.openqa.selenium.NoSuchElementException;
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
    protected WebElement Frame;

    //Метод нажатия на кнопку сохранения куков;
    public void clickCookieBtn() {
        cookieBtn.click();
    }

    //Метод возвращает текст плейсхолдера поля "Услуга связи - Номер телефона";
    public String getConnectionPhonePlaceholder() throws NoSuchElementException {
        return connectionPhone.getAttribute("placeholder");
    }

    //Метод возвращает текст плейсхолдера поля "Услуга связи - Сумма";
    public String getConnectionSumPlaceholder() throws NoSuchElementException {
        return connectionSum.getAttribute("placeholder");
    }

    //Метод возвращает текст плейсхолдера поля "Услуга связи - E-mail";
    public String getConnectionEmailPlaceholder() throws NoSuchElementException {
        return connectionEmail.getAttribute("placeholder");
    }

    //Метод возвращает текст плейсхолдера поля "Домашний интернет - Номер телефона";
    public String getInternetPhonePlaceholder() throws NoSuchElementException {
        return internetPhone.getAttribute("placeholder");
    }

    //Метод возвращает текст плейсхолдера поля "Домашний интернет - Сумма";
    public String getInternetSumPlaceholder() throws NoSuchElementException {
        return internetSum.getAttribute("placeholder");
    }

    //Метод возвращает текст плейсхолдера поля "Домашний интернет - E-mail";
    public String getInternetEmailPlaceholder() throws NoSuchElementException {
        return internetEmail.getAttribute("placeholder");
    }

    //Метод возвращает текст плейсхолдера поля "Рассрочка - номер счёта";
    public String getInstallmentNumberPlaceholder() throws NoSuchElementException {
        return installmentNumber.getAttribute("placeholder");
    }

    //Метод возвращает текст плейсхолдера поля "Рассрочка - Сумма";
    public String getInstallmentSumPlaceholder() throws NoSuchElementException {
        return installmentSum.getAttribute("placeholder");
    }

    //Метод возвращает текст плейсхолдера поля "Рассрочка - E-mail";
    public String getInstallmentEmailPlaceholder() throws NoSuchElementException {
        return instllmentEmail.getAttribute("placeholder");
    }

    //Метод возвращает текст плейсхолдера поля "Задолженность - Номер счета";
    public String getArrearsNumberPlaceholder() throws NoSuchElementException {
        return arrearsNumber.getAttribute("placeholder");
    }

    //Метод возвращает текст плейсхолдера поля "Задолженность - Сумма";
    public String getArrearsSumPlaceholder() throws NoSuchElementException {
        return arrearsSum.getAttribute("placeholder");
    }

    //Метод возвращает текст плейсхолдера поля "Задолженность - E-mail";
    public String getArrearsEmailPlaceholder() throws NoSuchElementException {
        return arrearsEmail.getAttribute("placeholder");
    }

    //Метод заполняет поле "Услуга связи - Номер телефона";
    public void setConnectionPhone(String phoneNumber) throws NoSuchElementException {
        connectionPhone.sendKeys(phoneNumber);
    }

    //Метод заполняет поле "Услуга связи - Сумма";
    public void setСonnectionSum(String sum) throws NoSuchElementException {
        connectionSum.sendKeys(sum);
    }

    //Метод нажимает на кнопку "Продолжить";
    public void clickPayBtn() throws NoSuchElementException {
        payBtn.click();
    }
}
