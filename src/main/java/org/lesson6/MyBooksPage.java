package org.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyBooksPage extends AbstractPage {
    public MyBooksPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Мои книги")
    private WebElement myBooksLink;

    public boolean isMyBooksDisplayed() {
        return myBooksLink.isDisplayed();
    }

}
