package org.lesson7;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.lesson6.ForgotPasswordPage;
import org.lesson6.LoginPage;
import org.lesson6.MyBooksPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Story("Домашка за 7 урок")
public class LessonTest extends AbstractTest {
    @Test
    @DisplayName("Тест 1 - логин")
    @Description("Проверяет доступность и возможность входа")
    @Link("https://mybook.ru")
    @Issue("")
    @TmsLink("")
    @Severity(SeverityLevel.NORMAL)
    void myTest1() throws InterruptedException, IOException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://mybook.ru"));
        assertTrue(getDriver().getTitle().contains("MyBook"), "Страница не доступна");

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.goToLoginPage();
        loginPage.login("howil55606@quamox.com", "37SL:%\"7NO-g#'B:a^dj");

        Thread.sleep(5000);

        MyBooksPage myBooksPage = new MyBooksPage(getDriver());

        File file = MyUtils.makeScreenshot(getDriver(),"failure- org.example.bbc.MyShowTest.testFalse" + System.currentTimeMillis() + ".png");
        Files.readAllBytes(file.toPath());

        assertTrue(myBooksPage.isMyBooksDisplayed(), "Вход не выполнен");
    }

    @Test
    @DisplayName("Тест 2 - восстановление пароля")
    @Description("Проверяет доступность и возможность смены пароля")
    @Link("https://mybook.ru")
    @Issue("")
    @TmsLink("")
    @Severity(SeverityLevel.MINOR)
    void myTest2() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10))
                .until(ExpectedConditions.urlContains("https://mybook.ru"));
        assertTrue(getDriver().getTitle().contains("MyBook"), "Страница не доступна");

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.goToLoginPage();
        loginPage.clickForgotPasswordLink();
        ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage(getDriver());
        forgotPasswordPage.sendEmail("howil55606@quamox.com");

        Thread.sleep(5000);

        assertTrue(forgotPasswordPage.isCancelSending(), "Письмо не отправлено");
    }

    @Test
    void myTest3() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://mybook.ru"));
        assertTrue(getDriver().getTitle().contains("MyBook"), "Страница не доступна");

        // myTest3

    }
    @Test
    void myTest4() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://mybook.ru"));
        assertTrue(getDriver().getTitle().contains("MyBook"), "Страница не доступна");

        // myTest4

    }
}
