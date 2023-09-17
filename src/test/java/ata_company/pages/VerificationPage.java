package ata_company.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerificationPage extends BasePage {

    @FindBy(xpath = "//label[contains(@class,'hb-fznKot bXTY siynd5psgip')]")
    WebElement codeBox;

    @FindBy(css = "button[type='submit']")
    WebElement submitButton;


    @FindBy(xpath = "//div[@class='hb-fzoXyF cMlttl s14k8qi9afo'] ")
    WebElement alertMessage;

    public void sendCodeToCodeBox(String code) {
        codeBox.sendKeys(code);
    }

    public void clickOnSubmitButton() {
        submitButton.click();
    }

    public String getAlertMessage() {
        String message = alertMessage.getText();
        return message;
    }
}
