package PageObject;
import SeleniumBase.SeleniumClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InitClass extends SeleniumClass {

    public InitClass(WebDriver driver) {
        super(driver);
    }

    // ввод логина почты
    @FindBy(xpath = ".//input[@name='login']")
    private WebElement loginMail;
    //ввести пароль
    @FindBy(xpath = ".//input[@value='Ввести пароль']")
    private WebElement passwordEntry;
    //ввод пароля
    @FindBy(xpath = ".//input[@name='password']")
    private WebElement passwordWrite;
    //входим в почту
    @FindBy(xpath = ".//input[@value='Ввести пароль']")
    private WebElement logInToMail;
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
    //закрыть
    @FindBy(xpath = ".//span[@title='Закрыть']")
    private WebElement  toClose;
    //проверка есть ли письмо в списке с указанной темой
    @FindBy(xpath = ".//span[contains(text(), 'Автотестирование')]")
    private WebElement  emailSubjectInTheList;
    //открыть письмо
    @FindBy(xpath = ".//div[@class='mt-h-c__content']")
    private WebElement  openLetter;
    @FindBy(xpath = "(.//div[@class='llc__container'])[1]")
    private WebElement  openL;
    //проверка соответствует ли тема письма
    @FindBy(xpath = ".//h2[contains(text(), 'Автотестирование')]")
    private WebElement  checkingEmailSubject;
    //проверка соответствует ли текст письма
    @FindBy(xpath = ".//div[contains(text(), 'Автоматизация тестирования')]")
    private WebElement  checkingTheEmailTest;
    //проверка есть ли файл в письме
    @FindBy(xpath = ".//div[@title='file.txt']")
    private WebElement  checkingFheFile;
    //скачать файл
    @FindBy(xpath = ".//a[contains(text(), 'Скачать')]")
    private WebElement  downloadFheFile;
    //проверка наличия файла в директории загрузки
    @FindBy(xpath = ".//a[contains(text(), 'file.txt')]")
    private WebElement  checkingTheUploadedEmail;
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
    //выбираем письма для удаления
    @FindBy(xpath = "(.//div[3]/button)[2]")
    private WebElement  deletedMessages1;
    @FindBy(xpath = "(.//div[3]/button)[3]")
    private WebElement  deletedMessages2;
    //удалить письма
    @FindBy(xpath = ".//span[@title= 'Удалить']")
    private WebElement  deleted;
    //проверка
    @FindBy(xpath = "//*[@id=\"app-canvas\"]/div/div[1]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/div/div/a[1]/div[4]")
    private WebElement  pr;













    public void setLoginMail(String text) {setText(loginMail, text); }
    public void clickPasswordEntry(){ click(passwordEntry); }
    public void setPasswordWrite(String text) { setText(passwordWrite, text); }
    public void clickLogInToMail(){ click(logInToMail); }

    public void clickWriteLetter(){ click(writeLetter); }
    public void waitVisibleEmailCreationForm(){ waitVisibilityOfElement(emailCreationForm); }

    public void setToField(String text) { setText(toField, text); }
    public void setMessageSubject(String text) { setText(messageSubject, text); }
    public void setWriteMessage(String text) { setText(writeMessage, text); }
    public void setA(String text) { setText(a, text); }
    public void clickSendFile() {click(sendFile); }
    public void clickToClose() {click(toClose); }
    public void waitVisibleEmailSubjectInTheList(){ waitVisibilityOfElement( emailSubjectInTheList); }
    public void clickOpenLetter() {click(openLetter); }
    public void clickOpenL() {click(openL); }
    public void waitVisibleCheckingEmailSubject(){ waitVisibilityOfElement( checkingEmailSubject); }
    public void waitVisibleCheckingTheEmailTest(){ waitVisibilityOfElement( checkingTheEmailTest); }
    public void waitVisibleCheckingFheFile(){ waitVisibilityOfElement( checkingFheFile); }
    public void clickDownloadFheFile(){ click(downloadFheFile); }
    public void waitVisibleCheckingTheUploadedEmail(){ waitVisibilityOfElement( checkingTheUploadedEmail); }
    public void clickCustomization(){ click(customization); }
    public void clickAllCustomization(){ click(allCustomization); }

    //public void clickNameAndSignature(){ click(nameAndSignature); }
    public void clickByDefault(){ click(byDefault); }
    public void setWriteSignature(String text) { setTextClear(writeSignature, text); }
    public void clickSaveSignature(){ click(saveSignature); }
    public void clickReturnMail(){ click( returnMail); }
    public void waitVisibleSignatureEmail(){ waitVisibilityOfElement( signatureEmail); }
    public void clickReturnIncomingMessages(){ click(returnIncomingMessages); }
    public void clickDeletedMessages1(){ click(deletedMessages1); }
    public void clickDeletedMessages2(){ click(deletedMessages2); }
    public void clickDeleted(){ click(deleted); }
    public void waitVisiblePr(){ waitVisibilityOfElement( pr); }














}
