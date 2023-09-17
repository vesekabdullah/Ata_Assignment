package ata_company.step_definitions;

import ata_company.utilities.BrowserUtils;
import ata_company.utilities.ConfigurationReader;
import ata_company.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCase_01 extends BaseTest {

    @Given("The user lands on the website")
    public void the_user_lands_on_the_website() {
        String URL = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);
        System.out.println("Open ::" + URL);
        BrowserUtils.wait(1);
    }

    @When("the user clicks on Giriş Yap veya üye olbutton")
    public void the_user_clicks_on_giriş_yap_veya_üye_olbutton() {
        pages.mainPage().clickRegisterOrLoginButton();
    }

    @When("the user clicks on Üye ol button")
    public void the_user_clicks_on_üye_ol_button() {
        pages.mainPage().clickOnRegisterButton();
    }

    @When("the user enter phone number {string}")
    public void the_user_enter_phone_number(String info) {
        pages.registerPage().sendInfoToEmailOrPhoneBoxForRegister(info);
    }

    @When("the user clicks on Devam Et button")
    public void the_user_clicks_on_devam_et_button() {
        pages.registerPage().clickOnSubmitButton();

    }

    @When("the user enter code {string}")
    public void the_user_enter_code(String code) {
        pages.verificationPage().sendCodeToCodeBox(code);
    }

    @When("the user clicks on Üye ol button for result")
    public void the_user_clicks_on_üye_ol_button_for_result() {
        pages.verificationPage().clickOnSubmitButton();
    }

    @Then("the user checks the result of register process")
    public void the_user_checks_the_result_of_register_process() {
        pages.firstPage().clickOnExitButton();

    }

}
