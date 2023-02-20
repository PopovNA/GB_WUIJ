package org.lesson6;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LessonTest extends AbstractTest {
    @Test
    void myTest1() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://mybook.ru"));
        assertTrue(getDriver().getTitle().contains("MyBook"), "Страница не доступна");

        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.goToLoginPage();
        loginPage.login("howil55606@quamox.com", "37SL:%\"7NO-g#'B:a^dj");

        Thread.sleep(5000);

        MyBooksPage myBooksPage = new MyBooksPage(getDriver());
        assertTrue(myBooksPage.isMyBooksDisplayed(), "Вход не выполнен");
    }
    @Test
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
