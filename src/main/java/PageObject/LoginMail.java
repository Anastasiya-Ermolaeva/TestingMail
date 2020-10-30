package PageObject;
import SeleniumBase.SeleniumClass;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginMail extends SeleniumClass {

    public LoginMail(WebDriver driver) {
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

    @Step("Заполняем поле ввода логина почты")
    public void setLoginMail(String text) {setText(loginMail, text); }
    @Step("Кликаем по кнопке Ввод пароля")
    public void clickPasswordEntry(){ click(passwordEntry); }
    @Step("Заполняем поле ввода пароля почты")
    public void setPasswordWrite(String text) { setText(passwordWrite, text); }
    @Step("Кликаем по кнопке Войти в почту")
    public void clickLogInToMail(){ click(logInToMail); }

}