package ata_company.step_definitions;

import io.cucumber.java.en.When;

public class TestCase_02 extends BaseTest {
    @When("the user enter same phone number {string}")
    public void iEnterThePhoneNumber(String phone) {
        pages.registerPage().sendInfoToEmailOrPhoneBoxForRegister(phone);
    }
}