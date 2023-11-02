package Login;

import Base.LoginBase;
import Pages.Login.LoginPage;
import TestData.User;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPositiveTest  extends LoginBase {
    @Test(description = "Login with valid credentials",dataProvider = "valid-account")
    public void testLoginSucccesWithValidCredentials(User user){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithEmailAndPassword(user.getEmail(), user.getPassword());
        Assert.assertEquals(driver.getCurrentUrl(), user.getExpectedUrl());
    }
}
