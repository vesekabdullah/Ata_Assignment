package ata_company.utilities;

import ata_company.pages.*;

public class Pages {
    private MainPage mainPage;
    private RegisterPage registerPage;
    public LoginPage loginPage;
    private VerificationPage verificationPage;
    private PasswordPageForEmail passwordPageForEmail;
    private FirstPage firstPage;
    private MyCartPage myCartPage;
    private PaymentPage paymentPage;


    public Pages() {
        this.mainPage = new MainPage();
        this.registerPage = new RegisterPage();
        this.loginPage = new LoginPage();
        this.verificationPage = new VerificationPage();
        this.passwordPageForEmail = new PasswordPageForEmail();
        this.firstPage = new FirstPage();
        this.myCartPage = new MyCartPage();
        this.paymentPage = new PaymentPage();


    }


    public MainPage mainPage() {
        return mainPage;
    }

    public FirstPage firstPage() {
        return firstPage;
    }

    public RegisterPage registerPage() {
        return registerPage;
    }

    public LoginPage loginPage() {
        return loginPage;
    }

    public VerificationPage verificationPage() {
        return verificationPage;
    }

    public PasswordPageForEmail passwordPageForEmail() {
        return passwordPageForEmail;
    }

    public MyCartPage myCartPage() {
        return myCartPage;
    }

    public PaymentPage paymentPage() {
        return paymentPage;
    }
}




