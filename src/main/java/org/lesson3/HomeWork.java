package org.lesson3;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.name;

public class HomeWork {
    public static void main(String[] args) {

        Test_1_login();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Test_2_pass_recovery();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Test_3_pass_change();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Test_4_alert_settings_change();
    }

    private static void Test_4_alert_settings_change() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://mybook.ru");

        WebElement webElement1 = driver.findElement(By.linkText("Войти"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.name("email"));
        webElement2.sendKeys("howil55606@quamox.com");

        WebElement webElement3 = driver.findElement(By.name("password"));
        webElement3.sendKeys("37SL:%\"7NO-g#'B:a^dj");

        WebElement webElement4 = driver.findElement(By.xpath("//button[contains(.,'Войти')]"));
        webElement4.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.get("https://mybook.ru/account/edit/");

        webElement1 = driver.findElement(By.xpath("//p[contains(.,'Игры, конкурсы, тесты')]"));
        webElement1.click();

        webElement2 = driver.findElement(By.xpath("//span[contains(.,'Сохранить')]"));
        webElement2.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        webElement1.click();
        webElement2.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();
    }

    private static void Test_3_pass_change() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://mybook.ru");

        WebElement webElement1 = driver.findElement(By.linkText("Войти"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.name("email"));
        webElement2.sendKeys("howil55606@quamox.com");

        WebElement webElement3 = driver.findElement(By.name("password"));
        webElement3.sendKeys("37SL:%\"7NO-g#'B:a^dj");

        WebElement webElement4 = driver.findElement(By.xpath("//button[contains(.,'Войти')]"));
        webElement4.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.get("https://mybook.ru/account/edit/");

        webElement1 = driver.findElement(By.name("oldPassword"));
        webElement1.sendKeys("37SL:%\"7NO-g#'B:a^dj");

        webElement2 = driver.findElement(By.name("newPassword"));
        webElement2.sendKeys("Y0:k98I/;_tYyY5Gn[Vn");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        webElement3 = driver.findElement(By.xpath("//div[3]/div/div/div/form/div[3]/button/div"));
        webElement3.click();

        //webElement1 = driver.findElement(By.name("oldPassword"));
        webElement1.sendKeys("Y0:k98I/;_tYyY5Gn[Vn");

        //webElement2 = driver.findElement(By.name("newPassword"));
        webElement2.sendKeys("37SL:%\"7NO-g#'B:a^dj");

        //webElement3 = driver.findElement(By.xpath("//div[3]/div/div/div/form/div[3]/button/div"));
        webElement3.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();
    }

    private static void Test_2_pass_recovery() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://mybook.ru");

        WebElement webElement1 = driver.findElement(By.linkText("Войти"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.xpath("//span[contains(.,'Забыл пароль')]"));
        webElement2.click();

        WebElement webElement3 = driver.findElement(By.xpath("//input[@value='']"));
        webElement3.sendKeys("howil55606@quamox.com");

        WebElement webElement4 = driver.findElement(By.xpath("//button[contains(.,'Отправить')]"));
        webElement4.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();
    }

    private static void Test_1_login() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://mybook.ru");

        WebElement webElement1 = driver.findElement(By.linkText("Войти"));
        webElement1.click();

        WebElement webElement2 = driver.findElement(By.name("email"));
        webElement2.sendKeys("howil55606@quamox.com");

        WebElement webElement3 = driver.findElement(By.name("password"));
        webElement3.sendKeys("37SL:%\"7NO-g#'B:a^dj");

        WebElement webElement4 = driver.findElement(By.xpath("//button[contains(.,'Войти')]"));
        webElement4.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.close();
    }

}
