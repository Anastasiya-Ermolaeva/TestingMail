package TestMail;
import PageObject.LoginMail;
import PageObject.MessageIncoming;
import PageObject.SendEmail;
import PageObject.SignatureSettings;
import org.testng.annotations.Test;

public class TestClass extends ChromeClass{
    @Test
    public void test_mail() {
        //войти на почту
        getDriver().get("https://mail.ru/");
        // форма страницы на весь экран
        getDriver().manage().window().maximize();
        LoginMail lm = new LoginMail(getDriver());
        SendEmail sm = new SendEmail(getDriver());
        MessageIncoming mi = new MessageIncoming(getDriver());
        SignatureSettings ss = new SignatureSettings(getDriver());
        //ввод логина почты
        lm.setLoginMail("n.ermm");
        // нажатие кнопки "Ввод пароля"
        lm.clickPasswordEntry();
        //ввести пароль почты
        lm.setPasswordWrite("fozuha48");
        //нажатие кнопки для входа в почту
        lm.clickLogInToMail();
        // нажатие нопки - написать письмо
        sm.clickWriteLetter();
        //проверка - окрылась ли форма письма
        sm.waitVisibleEmailCreationForm();
        //ввести адрес получателя письма
        sm.setToField("n.ermm@mail.ru");
        //ввести тему письма
        sm.setMessageSubject("Автотестирование");
        //ввести текст сообщения
        sm.setWriteMessage("Автоматизация тестирования приложений – это процесс проверки программного обеспечения, который включает проведение таких основных функций и шагов теста, как запуск, инициализация, выполнение, анализ и выдача результата, автоматически посредством специализированных инструментов.\n");
        //вставка файла в письмо
        sm.setA();
        //отправка письма
        sm.clickSendFile();
        // закрыть форму для перехода  входящим сообщениям
        mi.clickToClose();
        // проверить есть ли письмо с указанной темой
        mi.waitVisibleEmailSubjectInTheList();
        //открыть письмо
        mi.clickOpenLetter();
        mi.clickOpenL();
        //проверка соответствует ли тема письма
        mi.waitVisibleCheckingEmailSubject();
        //проверк соответствует ли текст письма
        mi.waitVisibleCheckingTheEmailTest();
        //проверка наличия файла
        mi.waitVisibleCheckingFheFile();
        // скачать файл
        mi.clickDownloadFheFile();
        //перейти в раздел загрузки
        getDriver().get("chrome://downloads/");
        //проверка есть ли файл в директории загрузки
        mi.waitVisibleCheckingTheUploadedEmail();
        //вернуться на страницу почты
        getDriver().get("https://e.mail.ru/inbox");
        //перейти в настройки
        ss.clickCustomization();
        //перейти во все настройки
        ss.clickAllCustomization();
        getDriver().get("https://e.mail.ru/settings/general#messages");
        // in.clickNameAndSignature();
        //выбираем настройки по умолчанию
        ss.clickByDefault();
        //вводим новую подпись
        ss.setWriteSignature(" --\n Анастасия");
        //сохраняем новую подпись
        ss.clickSaveSignature();
        //возвращаемся на почту в раздел входящих сообщений
        ss.clickReturnMail();
        // нажатие нопки - написать письмо
        sm.clickWriteLetter();
        //проверка - окрылась ли форма письма
        sm.waitVisibleEmailCreationForm();
        // проверка соответствует ли заданная подпись письма
        ss.waitVisibleSignatureEmail();
        //ввести адрес получателя письма
        sm.setToField("n.ermm@mail.ru");
        //ввести тему письма
        sm.setMessageSubject("Автотестирование");
        //ввести текст сообщения
        sm.setWriteMessage("Автоматизация тестирования приложений – это процесс проверки программного обеспечения, который включает проведение таких основных функций и шагов теста, как запуск, инициализация, выполнение, анализ и выдача результата, автоматически посредством специализированных инструментов.\n");
        //отправка письма
        sm.clickSendFile();
        // закрыть форму для перехода  входящим сообщениям
        mi.clickToClose();
        // проверить есть ли письмо с указанной темой
        mi.waitVisibleEmailSubjectInTheList();
        //открыть письмо
        mi.clickOpenLetter();
        mi.clickOpenL();
        //проверка соответствует ли тема письма
        mi.waitVisibleCheckingEmailSubject();
        //проверк соответствует ли текст письма
        mi.waitVisibleCheckingTheEmailTest();
        // проверка соответствует ли заданная подпись письма
        ss.waitVisibleSignatureEmail();
        //вернуться во входящие сообщения
        ss.clickReturnIncomingMessages();
        //выбираем 2 письма для удаления
        mi.clickDeletedMessages1();
        mi.clickDeletedMessages2();
        //удаляем письма
        mi.clickDeleted();
        //проверяем что писем больше нет на почте
        mi.waitVisiblePr();
    }
}
