package ata_company.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{
    @FindBy(xpath = "//input[@id='txtUserName']")
    WebElement emailOrPhoneBox;

    @FindBy(css = "button[type='submit']")
    WebElement submitButton;

    public void sendInfoToEmailOrPhoneBoxForRegister(String info){
        emailOrPhoneBox.sendKeys(info);
    }

public void clickOnSubmitButton(){
        submitButton.click();
}


}
