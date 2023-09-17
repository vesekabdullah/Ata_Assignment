package ata_company.step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestCase_06 extends BaseTest {
    @When("the user clicks on Giriş yap button")
    public void clickOnGirişYapButton() {
        pages.mainPage().clickOnLoginButton();
    }

    @Then("the user checks the result of login process")
    public void check() {
        pages.firstPage().clickOnExitButton();
    }


}
