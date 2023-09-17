Feature: RegisterPage

  Scenario:User wants to register the page with wrong code

  Given The user lands on the website
  When the user clicks on Giriş Yap veya üye olbutton
  And the user clicks on Üye ol button
  And the user enter phone number "0555555555"
  And the user clicks on Devam Et button
  And the user enter wrong code "2222222"
  Then the user checks the process




