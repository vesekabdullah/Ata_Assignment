package ata_company.step_definitions;

import io.cucumber.java.en.When;

public class TestCase_03 extends BaseTest {
    @When("the user enter email {string}")
    public void theUserEnterTheEmailAddress(String emailAddress) {
        pages.registerPage().sendInfoToEmailOrPhoneBoxForRegister(emailAddress);
    }

   @When("the user verify email")
    public void verifyEmail(){
       System.out.println("verification is completed");

   }
}