package com.suhairhabib.qa.tests;

import com.suhairhabib.qa.base.BaseTest;
import com.suhairhabib.qa.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginRegressionTest extends BaseTest {

    private static final String TEST_URL = "https://the-internet.herokuapp.com/login";

    @Test(priority = 1, description = "Verify valid user credentials grant access")
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateTo(TEST_URL);
        loginPage.login("tomsmith", "SuperSecretPassword!");

        String message = loginPage.getStatusMessage();
        Assert.assertTrue(message.contains("You logged into a secure area!"),
                "Expected success banner, but got: " + message);
    }

    @Test(priority = 2, description = "Verify invalid password triggers error message")
    public void testInvalidPasswordLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.navigateTo(TEST_URL);
        loginPage.login("tomsmith", "WrongPassword123");

        String message = loginPage.getStatusMessage();
        Assert.assertTrue(message.contains("Your password is invalid!"),
                "Expected invalid password error, but got: " + message);
    }
}
