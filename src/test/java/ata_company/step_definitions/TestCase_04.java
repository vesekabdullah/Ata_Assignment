package ata_company.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCase_04 extends BaseTest {
    @When("the user enter wrong code {string}")
    public void enterWrongCode(String code) {
        pages.verificationPage().sendCodeToCodeBox(code);
    }

    @Then("the user checks the process")
    public void checkTheProcess() {
        String s = pages.verificationPage().getAlertMessage();
        System.out.println(s);
    }

}
