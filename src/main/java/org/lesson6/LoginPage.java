package org.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    @FindBy(linkText = "Войти")
    private WebElement loginLink;
    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(xpath = "//button[contains(.,'Войти')]")
    private WebElement loginButton;

    @FindBy(xpath = "//span[contains(.,'Забыл пароль')]")
    private WebElement forgotPasswordLink;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goToLoginPage() {
        //driver.get("https://mybook.ru");
        loginLink.click();
    }

    public void login(String email, String password) {
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();
    }

    public void clickForgotPasswordLink() {
        forgotPasswordLink.click();
    }
}