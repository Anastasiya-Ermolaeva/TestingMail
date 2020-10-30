package PageObject;
import SeleniumBase.SeleniumClass;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class SendEmail extends SeleniumClass {

    public SendEmail(WebDriver driver) {
        super(driver);
    }

    //написать письмо
    @FindBy(xpath = ".//a[@title='Написать письмо']")
    private WebElement writeLetter;
    //форма письма
    @FindBy(xpath = ".//div[@class='scrollview--SiHhk scrollview_main--3Vfg9 scrollview_mainCompressed--2IhQY']")
    private WebElement emailCreationForm;
    //адрес получателя письма
    @FindBy(xpath = ".//input[@class='container--H9L5q size_s_compressed--2c-eV']")
    private WebElement toField;
    //тема письма
    @FindBy(xpath = ".//input[@name='Subject']")
    private WebElement messageSubject;
    //поле сообщения
    @FindBy(xpath = ".//div[@role='textbox']")
    private WebElement writeMessage;
    //прикрепить файл
    @FindBy(xpath = ".//input[@class='desktopInput--3cWPE']")
    private WebElement a;
    //отправить файл
    @FindBy(xpath = ".//span[@title='Отправить']")
    private WebElement  sendFile;

    @Step("Кликаем по кнопке написать письмо")
    public void clickWriteLetter(){ click(writeLetter); }
    @Step("Выполняем проверку на открытие формы письма")
    public void waitVisibleEmailCreationForm(){ waitVisibilityOfElement(emailCreationForm); }
    @Step("Заполняем поле ввода адреса письма")
    public void setToField(String text) { setText(toField, text); }
    @Step("Заполняем поле ввода темы письма")
    public void setMessageSubject(String text) { setText(messageSubject, text); }
    @Step("Заполняем поле ввода содержания письма")
    public void setWriteMessage(String text) { setText(writeMessage, text); }
    @Step("Вставляем файл в письмо")
    public void setA() { mtdFile(a);}
    @Step("Кликаем по кнопке Отправить письмо")
    public void clickSendFile() {click(sendFile); }


}
