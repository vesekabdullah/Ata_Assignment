package ata_company.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyCartPage extends BasePage{
    @FindBy(id = "continue_step_btn")
    WebElement completeMyOrderButton;

public void clickOnCompleteMyOrderButton(){
    completeMyOrderButton.click();
}





}

