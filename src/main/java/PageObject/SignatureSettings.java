package PageObject;
import SeleniumBase.SeleniumClass;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SignatureSettings extends SeleniumClass {

    public SignatureSettings(WebDriver driver) {
        super(driver);
    }
    //переходим в настройки
    @FindBy(xpath = ".//span[@title='Настройки']")
    private WebElement  customization;
    //переходим во все настройки
    @FindBy(xpath = ".//div[contains(text(), 'Все настройки')]")
    private WebElement  allCustomization;
    //переходим в раздел имя и подпись
    //@FindBy(xpath = "//*[@id=\"general\"]/div[1]/span")
    //private WebElement  nameAndSignature;
    // выбираем по умолчанию
    @FindBy(xpath = ".//button[@data-test-id='edit']")
    private WebElement  byDefault;
    //поле изменения подписи
    @FindBy(xpath = ".//div[@role='textbox']")
    private WebElement writeSignature;
    //сохранить изменение подписи
    @FindBy(xpath = "(.//span[contains(text(), 'Сохранить')])[2]")
    private WebElement  saveSignature;
    //вернуться в почту
    @FindBy(xpath = ".//span[contains(text(), 'Вернуться в почту')]")
    private WebElement  returnMail;
    //проверка соответствия подписи в письме
    @FindBy(xpath = ".//div[contains(text(), 'Анастасия')]")
    private WebElement  signatureEmail;
    //вернуться во входящие сообщения
    @FindBy(xpath = ".//span[@title='Вернуться']")
    private WebElement  returnIncomingMessages;
    @Step("Кликаем по кнопке - перейти в настройки")
    public void clickCustomization(){ click(customization); }
    @Step("Кликаем по кнопке - перейти во все настройки")
    public void clickAllCustomization(){ click(allCustomization); }
    //public void clickNameAndSignature(){ click(nameAndSignature); }
    @Step("Кликаем по кнопке - настройки по умолчанию")
    public void clickByDefault(){ click(byDefault); }
    @Step("Заполняем поле ввода подписи")
    public void setWriteSignature(String text) { setTextClear(writeSignature, text); }
    @Step("Кликаем по кнопке - сохранить измененную подпись")
    public void clickSaveSignature(){ click(saveSignature); }
    @Step("Кликаем по кнопке для возврата на почту в раздел входящих сообщений")
    public void clickReturnMail(){ click( returnMail); }
    @Step("Выполняем проверку на соответствие заданной подписи письма")
    public void waitVisibleSignatureEmail(){ waitVisibilityOfElement( signatureEmail); }
    @Step("Кликаем по кнопке для возврата во входящие сообщения")
    public void clickReturnIncomingMessages(){ click(returnIncomingMessages); }
}