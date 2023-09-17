package ata_company.utilities;

import ata_company.pages.LoginPage;
import ata_company.pages.MainPage;
import ata_company.pages.RegisterPage;
import ata_company.pages.VerificationPage;

public class Pages {
    private MainPage mainPage;
    private RegisterPage registerPage;
    private LoginPage loginPage;
    private VerificationPage verificationPage;


    public Pages() {
        this.mainPage = new MainPage();
        this.registerPage = new RegisterPage();
        this.loginPage = new LoginPage();
        this.verificationPage = new VerificationPage();

    }


    public MainPage mainPage() {
        return mainPage;
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

}




