package org.example;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class MtsHomePage {
    protected WebDriver driver;


    public MtsHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    //Локатор для заголовка
    @FindBy(xpath = "//section/div/h2")
    private WebElement titleBlock;

    //Локатор для ссылки "Подробнее о сервисе"
    @FindBy(xpath = "//section[@class='pay']//a[contains(text(),'Подробнее о сервисе')]")
    private WebElement link;

    //Локатор для поля телефон
    @FindBy(xpath = "//input[@id='connection-phone']")
    private WebElement phoneField;

    //Локатор для поля сумма
    @FindBy(xpath = "//input[@id='connection-sum']")
    private WebElement sumField;

    //Локатор для кнопки "Продолжить"
    @FindBy(css = "#pay-connection > button")
    private WebElement payBtn;


    //локатора для кнопки "Принять" куки
    @FindBy(xpath = "//div[2]/button[3]")
    private WebElement cookieBtn;


    //Метод возвращает заголовок формы оплаты
    public String getTitleBlock() {
        return titleBlock.getText().replaceAll("\n|\r\n", " ");
    }

    //Метод возвращает url ссылки "Подробнее о сервисе"
    public String getLinkUrl() throws NoSuchElementException {
        return link.getAttribute("href");
    }

    //Метод возвращает код ответа ссылки
    public int getRespCode(String urlLink) throws IOException {
        URL url = new URL(urlLink);
        HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
        httpURLConnect.setConnectTimeout(10000);
        httpURLConnect.connect();
        return httpURLConnect.getResponseCode();
    }

    //Метод заполняет поле телефона формы пополнения счета
    public void setPhoneField(String phoneNumber) throws NoSuchElementException {
        phoneField.sendKeys(phoneNumber);
    }

    //Метод заполняет поле суммы формы пополнения счета
    public void setSumField(String sum) throws NoSuchElementException {
        sumField.sendKeys(sum);
    }

    //Метод нажимает на кнопку оплаты
    public void clickPayBtn() throws NoSuchElementException {
        payBtn.click();
    }

    // Метод прожимает куки
    public void clickCookieBtn() {
        cookieBtn.click();
    }
}



