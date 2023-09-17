package ata_company.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FirstPage extends BasePage {
    @FindBy(xpath = "//a[@title='AC&Co / Altınyıldız Classics Erkek Siyah %100 Pamuk Slim Fit Dar Kesim Bisiklet Yaka Kısa Kollu Tişört']//div[@class='sf-dod-jxwicI cIONYC svk9h1ag1mc sc-fzozJi dteCCc']")
    WebElement addToCartButton;

    @FindBy(css = "a[href='https://checkout.hepsiburada.com/sepetim']")
    WebElement cartItem;

    @FindBy(xpath = "//a[contains(text(),'Çıkış Yap')]")
    WebElement exitButton;

    public void clickOnAddToCartButton() {
        addToCartButton.click();
    }

    public void clickOnCartItem() {
        cartItem.click();
    }

    public void clickOnExitButton() {
        exitButton.click();
    }

}
