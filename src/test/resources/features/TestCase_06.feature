Feature: LoginPage

  Scenario: User wants to login the website with correct phone number  information

  Given The user lands on the website
  When the user clicks on Giriş Yap veya üye olbutton
  And the user clicks on Giriş yap button
  And the user enter phone number "0555555555"
  And the user clicks on Devam Et button
  And the user enter code "2222222"
  Then the user checks the result of login process



