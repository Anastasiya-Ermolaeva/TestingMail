package TestMail;

import PageObject.InitClass;
import org.testng.annotations.Test;

public class TestClass extends ChromeClass{
    @Test
    public void test_mail() {
        //войти на почту
        getDriver().get("https://mail.ru/");
        // форма страницы на весь экран
        getDriver().manage().window().maximize();
        InitClass in = new InitClass(getDriver());
        //ввод логина почты
        in.setLoginMail("n.ermm");
        // нажатие кнопки "Ввод пароля"
        in.clickPasswordEntry();
        //ввести пароль почты
        in.setPasswordWrite("fozuha48");
        //нажатие кнопки для входа в почту
        in.clickLogInToMail();
        // нажатие нопки - написать письмо
        in.clickWriteLetter();
        //проверка - окрылась ли форма письма
        in.waitVisibleEmailCreationForm();
        //ввести адрес получателя письма
        in.setToField("n.ermm@mail.ru");
        //ввести тему письма
        in.setMessageSubject("Автотестирование");
        //ввести текст сообщения
        in.setWriteMessage("Автоматизация тестирования приложений – это процесс проверки программного обеспечения, который включает проведение таких основных функций и шагов теста, как запуск, инициализация, выполнение, анализ и выдача результата, автоматически посредством специализированных инструментов.\n");
        //вставка файла в письмо
        in.setA("C:\\file.txt");
        //отправка письма
        in.clickSendFile();
        // закрыть форму для перехода  входящим сообщениям
        in.clickToClose();
        // проверить есть ли письмо с указанной темой
        in.waitVisibleEmailSubjectInTheList();
        //открыть письмо
        in.clickOpenLetter();
        in.clickOpenL();
        //проверка соответствует ли тема письма
        in.waitVisibleCheckingEmailSubject();
        //проверк соответствует ли текст письма
        in.waitVisibleCheckingTheEmailTest();
        //проверка наличия файла
        in.waitVisibleCheckingFheFile();
        // скачать файл
        in.clickDownloadFheFile();
        //перейти в раздел загрузки
        getDriver().get("chrome://downloads/");
        //проверка есть ли файл в директории загрузки
        in.waitVisibleCheckingTheUploadedEmail();
        //вернуться на страницу почты
        getDriver().get("https://e.mail.ru/inbox");
        //перейти в настройки
        in.clickCustomization();
        //перейти во все настройки
        in.clickAllCustomization();
        getDriver().get("https://e.mail.ru/settings/general#messages");
        // in.clickNameAndSignature();
        //выбираем настройки по умолчанию
        in.clickByDefault();
        //вводим новую подпись
        in.setWriteSignature(" --\n Анастасия");
        //сохраняем новую подпись
        in.clickSaveSignature();
        //возвращаемся на почту в раздел входящих сообщений
        in.clickReturnMail();
        // нажатие нопки - написать письмо
        in.clickWriteLetter();
        //проверка - окрылась ли форма письма
        in.waitVisibleEmailCreationForm();
        // проверка соответствует ли заданная подпись письма
        in.waitVisibleSignatureEmail();
        //ввести адрес получателя письма
        in.setToField("n.ermm@mail.ru");
        //ввести тему письма
        in.setMessageSubject("Автотестирование");
        //ввести текст сообщения
        in.setWriteMessage("Автоматизация тестирования приложений – это процесс проверки программного обеспечения, который включает проведение таких основных функций и шагов теста, как запуск, инициализация, выполнение, анализ и выдача результата, автоматически посредством специализированных инструментов.\n");
        //отправка письма
        in.clickSendFile();
        // закрыть форму для перехода  входящим сообщениям
        in.clickToClose();
        // проверить есть ли письмо с указанной темой
        in.waitVisibleEmailSubjectInTheList();
        //открыть письмо
        in.clickOpenLetter();
        in.clickOpenL();
        //проверка соответствует ли тема письма
        in.waitVisibleCheckingEmailSubject();
        //проверк соответствует ли текст письма
        in.waitVisibleCheckingTheEmailTest();
        // проверка соответствует ли заданная подпись письма
        in.waitVisibleSignatureEmail();
        //вернуться во входящие сообщения
        in.clickReturnIncomingMessages();
        //выбираем 2 письма для удаления
        in.clickDeletedMessages1();
        in.clickDeletedMessages2();
        //удаляем письма
        in.clickDeleted();
        //проверяем что писем больше нет на почте
        in.waitVisiblePr();
    }
}
