package ata_company.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    @FindBy(xpath = "//div[@id='myAccount']")
    WebElement registerOrLoginButton;

    @FindBy(xpath = "//a[@id='register']")
    WebElement registerButton;

    @FindBy(xpath = "//a[@id='login']")
    WebElement loginButton;

    public void clickRegisterOrLoginButton() {
        registerOrLoginButton.click();
    }

    public void clickOnRegisterButton() {
        registerButton.click();
    }

    public void clickOnLoginButton() {
        loginButton.click();
    }


}
