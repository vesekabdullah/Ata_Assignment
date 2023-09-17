package ata_company.step_definitions;

import io.cucumber.java.en.When;

public class TestCase_08 extends BaseTest{
    @When("the user enter  password {string}")
        public void enterPassword(String s){
        pages.loginPage.sendemail(s);
    }
    @When("the user add to cart a product")
    public void the_user_add_to_cart_a_product() {
        pages.firstPage().clickOnAddToCartButton();

    }
    @When("the user clicks on cart item")
    public void the_user_clicks_on_cart_item() {
        pages.firstPage().clickOnCartItem();
    }

    @When("the user clicks on Alışverişi tamamla button")
    public void the_user_clicks_on_alışverişi_tamamla_button() {
        pages.myCartPage().clickOnCompleteMyOrderButton();
    }
    @When("the user fills card number information {string}")
    public void the_user_fills_card_number_information(String card) {
       pages.paymentPage().sendCardNumber(card);
    }
    @When("the user enter expire date {string}")
    public void the_user_enter_expire_date(String string) {
        pages.paymentPage().sendCardDate(string);
    }
    @When("the user enter cvv {string}")
    public void the_user_enter_cvv(String string) {
        pages.paymentPage().sendCvv(string);
    }
    @When("the user clicks Siparişimi tamamla button")
    public void the_user_clicks_siparişimi_tamamla_button() {
        pages.paymentPage().clickOnConfirmMyOrderButton();
    }


}
