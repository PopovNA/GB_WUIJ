package org.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage extends AbstractPage {
    public ForgotPasswordPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@value='']")
    private WebElement emailField;

    @FindBy(xpath = "//button[contains(.,'Отправить')]")
    private WebElement sendButton;

    @FindBy(xpath = "//button[contains(.,'Я ошибся с вводом e-mail')]")
    private WebElement cancelButton;

    public void sendEmail(String email) {
        emailField.sendKeys(email);
        sendButton.click();
    }

    public boolean isCancelSending() {
        return cancelButton.isDisplayed();
    }

}
