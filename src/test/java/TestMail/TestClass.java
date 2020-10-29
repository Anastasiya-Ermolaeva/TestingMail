package TestMail;

import PageObject.InitClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class TestClass extends ChromeClass{
    @Test
    public void test_mail() {
        //зайти на почту
        getDriver().get("https://mail.ru/");
        getDriver().manage().window().maximize();
        InitClass in = new InitClass(getDriver());
        in.setLoginMail("n.ermm");
        in.clickPasswordEntry();
        in.setPasswordWrite("fozuha48");
        in.clickLogInToMail();
        in.clickWriteLetter();
        in.waitVisibleEmailCreationForm();
        in.setToField("n.ermm@mail.ru");
        in.setMessageSubject("Автотестирование");
        in.setWriteMessage("Автоматизация тестирования приложений – это процесс проверки программного обеспечения, который включает проведение таких основных функций и шагов теста, как запуск, инициализация, выполнение, анализ и выдача результата, автоматически посредством специализированных инструментов.\n");
        in.setA("C:\\file.txt");
        in.clickSendFile();
        in.clickToClose();
        in.waitVisibleEmailSubjectInTheList();
        in.clickOpenLetter();
        in.clickOpenL();
        in.waitVisibleCheckingEmailSubject();
        in.waitVisibleCheckingTheEmailTest();
        in.waitVisibleCheckingFheFile();
        in.clickDownloadFheFile();
        getDriver().get("chrome://downloads/");
        in.waitVisibleCheckingTheUploadedEmail();
        getDriver().get("https://e.mail.ru/inbox");
        in.clickCustomization();
        in.clickAllCustomization();
        getDriver().get("https://e.mail.ru/settings/general#messages");
       // in.clickNameAndSignature();
        in.clickByDefault();
        in.setWriteSignature(" --\n Анастасия");
        in.clickSaveSignature();
        in.clickReturnMail();
       // getDriver().get("https://e.mail.ru/inbox");

        in.clickWriteLetter();
        in.waitVisibleEmailCreationForm();
        in.waitVisibleSignatureEmail();
        in.setToField("n.ermm@mail.ru");
        in.setMessageSubject("Автотестирование");
        in.setWriteMessage("Автоматизация тестирования приложений – это процесс проверки программного обеспечения, который включает проведение таких основных функций и шагов теста, как запуск, инициализация, выполнение, анализ и выдача результата, автоматически посредством специализированных инструментов.\n");
        in.clickSendFile();
        in.clickToClose();
        in.waitVisibleEmailSubjectInTheList();
        in.clickOpenLetter();
        in.clickOpenL();
        in.waitVisibleCheckingEmailSubject();
        in.waitVisibleCheckingTheEmailTest();
        in.waitVisibleSignatureEmail();
        in.clickReturnIncomingMessages();
        in.clickDeletedMessages1();
        in.clickDeletedMessages2();
        in.clickDeleted();
        in.waitVisiblePr();






              
        
    }


}
