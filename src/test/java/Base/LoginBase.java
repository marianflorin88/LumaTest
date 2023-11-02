package Base;

import TestData.User;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import java.time.Duration;

public class LoginBase {
    public static WebDriver driver;

    public static String url = "https://magento.softwaretestingboard.com/";

    @DataProvider(name = "valid-account")
    public Object[][] returnValidAccount() {
        return new Object[][]{
                {new User("marianaurelianflorin@gmail.com", "Aurelian88", "https://magento.softwaretestingboard.com/")}};
    }
    @DataProvider(name = "invalid-credentials")
    public Object[][]returnInvalidCredentials() {
        return new Object[][]{
                {new User("aaaass@gmail.com", "asasdsadsa", "https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/", "The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.")
                },
        };
    }

    @BeforeMethod
    public void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        final String driverChrome = "webdriver.chrome.driver";
        final String chromeDriverAddress = "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe";
        chromeOptions.addArguments("--remote-allow-origins=*");
        chromeOptions.addArguments("--no-sandbox");
        System.setProperty(driverChrome, chromeDriverAddress);

        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("Tests are completed, webdriver is closing.");
        driver.quit();
    }
}
