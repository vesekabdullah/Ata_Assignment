package ata_company.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PasswordPageForEmail extends BasePage{
    @FindBy(css = "input[type='password']")
    WebElement passwordBox;

    @FindBy(id = "btnEmailSelect")
    WebElement submitButton;


}
