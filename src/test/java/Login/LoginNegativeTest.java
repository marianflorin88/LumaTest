package Login;

import Base.LoginBase;
import Pages.Login.LoginPage;
import TestData.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginNegativeTest extends LoginBase {
    @Test(description = "Login with invalid credentials", dataProvider = "invalid-credentials")
    public void testWithInvalidCredentials(User user){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithEmailAndPassword(user.getEmail(), user.getPassword());
        String actualErrorMessage = loginPage.returnLoginErrorMessage();

        Assert.assertEquals(driver.getCurrentUrl(), user.getExpectedUrl());
        Assert.assertEquals(actualErrorMessage, user.getExpectedErrorMessage());
    }
}
