Feature: Payment

  Scenario: User wants to login succesfully and buy a product

    Given The user lands on the website
    And the user clicks on Giriş Yap veya üye olbutton
    And the user clicks on Giriş yap button
    And the user enter email "abc@gmail.com"
    And the user enter  password "2222222"
    And the user clicks on Giriş yap button
    And the user add to cart a product
    And the user clicks on cart item
    And the user clicks on Alışverişi tamamla button
    And the user fills card number information "12654569879562"
    And the user enter expire date "0227"
    And the user enter cvv "1234"
    Then the user clicks Siparişimi tamamla button




