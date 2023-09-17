package ata_company.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage{
    @FindBy(id = "continue_step_btn")
    WebElement confirmMyOrder;

    @FindBy(css = "input[name='cardNumber']")
    WebElement cardNumberBox;

    @FindBy(css = "input[name='holderName']")
    WebElement cardHolderNameBox;

    @FindBy(css = "input[name='expireDate']")
    WebElement expireDateBox;

    @FindBy(css = "input[name='cvv']")
    WebElement cvvBox;

    public void clickOnConfirmMyOrderButton(){
        confirmMyOrder.click();
    }

   public void sendCardNumber(String number){
        cardNumberBox.sendKeys(number);
   }
    public void sendCardName(String name){
        cardNumberBox.sendKeys(name);
    }

    public void sendCardDate(String date){
        cardNumberBox.sendKeys(date);
    }
    public void sendCvv(String cvv){
        cardNumberBox.sendKeys(cvv);
    }

}
