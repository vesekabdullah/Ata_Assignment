package ata_company.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "txtUserName")
    WebElement emailOrPhoneBox;

    @FindBy(css = "button[type='submit']")
    WebElement submitButton;

    public void sendemail(String email) {
        emailOrPhoneBox.sendKeys(email);
    }


}
