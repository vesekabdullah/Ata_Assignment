Feature: RegisterPage

  Scenario: User wants to register the page with correct phone number  information

    Given The user lands on the website
    When  the user clicks on Giriş Yap veya üye olbutton
    And the user clicks on Üye ol button
    And the user enter phone number "05555555555"
    And the user clicks on Devam Et button
    And the user enter code "123456"
    And the user clicks on Üye ol button for result
    Then the user checks the result of register process



