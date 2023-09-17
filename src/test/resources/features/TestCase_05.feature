Feature: Register Page

  Scenario: User wants to register the page with registered email

  Given The user lands on the website
  When the user clicks on Giriş Yap veya üye olbutton
  And the user clicks on Üye ol button
  And the user enter email "abc@gmail.com"
  And the user clicks on Devam Et button
  Then the user checks the result of register process




