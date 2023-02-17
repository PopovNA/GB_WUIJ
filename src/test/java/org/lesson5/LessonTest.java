package org.lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.BooleanSupplier;

import static org.junit.jupiter.api.Assertions.*;

public class LessonTest extends AbstractTest{
    @Test
    void myTest1() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://mybook.ru"));
        assertTrue(getDriver().getTitle().contains("MyBook"), "Страница не доступна");

        // Создадим экземпляр класса Actions
        Actions search = new Actions(getDriver());

        getDriver().findElement(By.linkText("Войти")).click();
        search
                .pause(1000l)
                .sendKeys(getDriver().findElement(By.name("email")),"howil55606@quamox.com")
                .pause(1000l)
                .sendKeys(getDriver().findElement(By.name("password")),"37SL:%\"7NO-g#'B:a^dj")
                .pause(1000l)
                .click(getDriver().findElement(By.xpath("//button[contains(.,'Войти')]")))
                .build()
                .perform();

        Thread.sleep(5000);

        assertEquals((getDriver().findElement(By.linkText("Мои книги")) != null), true, "Вход не выполнен");
    }
    @Test
    void myTest2() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://mybook.ru"));
        assertTrue(getDriver().getTitle().contains("MyBook"), "Страница не доступна");

        // Создадим экземпляр класса Actions
        Actions search = new Actions(getDriver());

        getDriver().findElement(By.linkText("Войти")).click();
        getDriver().findElement(By.xpath("//span[contains(.,'Забыл пароль')]")).click();
        search
                .pause(1000l)
                .sendKeys(getDriver().findElement(By.xpath("//input[@value='']")),"howil55606@quamox.com")
                .pause(1000l)
                .click(getDriver().findElement(By.xpath("//button[contains(.,'Отправить')]")))
                .build()
                .perform();

        Thread.sleep(5000);

        assertEquals((getDriver().findElement(By.xpath("//button[contains(.,'Я ошибся с вводом')]")) != null), true, "Вход не выполнен");
    }
    @Test
    void myTest3() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://mybook.ru"));
        assertTrue(getDriver().getTitle().contains("MyBook"), "Страница не доступна");

        // Создадим экземпляр класса Actions
        Actions search = new Actions(getDriver());

    }
    @Test
    void myTest4() throws InterruptedException {
        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://mybook.ru"));
        assertTrue(getDriver().getTitle().contains("MyBook"), "Страница не доступна");

        // Создадим экземпляр класса Actions
        Actions search = new Actions(getDriver());

    }
}
