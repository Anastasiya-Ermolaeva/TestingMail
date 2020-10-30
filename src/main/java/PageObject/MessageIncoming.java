package PageObject;
        import SeleniumBase.SeleniumClass;
        import io.qameta.allure.Step;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;


public class MessageIncoming extends SeleniumClass {

    public MessageIncoming(WebDriver driver) {
        super(driver);
    }

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
    @Step("Кликаем по кнопке закрытия формы")
    public void clickToClose() {click(toClose); }
    @Step("Выполняем проверку - есть ли письмо в списке с заданной темой")
    public void waitVisibleEmailSubjectInTheList(){ waitVisibilityOfElement( emailSubjectInTheList); }
    @Step("Кликаем по кнопке Открыть письмо")
    public void clickOpenLetter() {click(openLetter); }
    public void clickOpenL() {click(openL); }
    @Step("Выполняем проверку на соответствие заданной темы")
    public void waitVisibleCheckingEmailSubject(){ waitVisibilityOfElement( checkingEmailSubject); }
    @Step("Выполняем проверку на соответствие содержания текста письма")
    public void waitVisibleCheckingTheEmailTest(){ waitVisibilityOfElement( checkingTheEmailTest); }
    @Step("Выполняем проверку на наличие файла")
    public void waitVisibleCheckingFheFile(){ waitVisibilityOfElement( checkingFheFile); }
    @Step("Кликаем по кнопке - скачать файл")
    public void clickDownloadFheFile(){ click(downloadFheFile); }
    @Step("Выполняем проверку на наличие файла в директории загрузки")
    public void waitVisibleCheckingTheUploadedEmail(){ waitVisibilityOfElement( checkingTheUploadedEmail); }
    @Step("Кликаем по кнопке выбора писем для их удаления")
    public void clickDeletedMessages1(){ click(deletedMessages1); }
    public void clickDeletedMessages2(){ click(deletedMessages2); }
    @Step("Кликаем по кнопке удалить письма")
    public void clickDeleted(){ click(deleted); }
    @Step("Выполняем проверку что письмем в списке больше нет")
    public void waitVisiblePr(){ waitVisibilityOfElement(pr); }
}

