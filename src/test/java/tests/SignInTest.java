package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SignInTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://dev.sovio.id/sign-in");
    }

    @Test
    public void testSignInPageLoads() {
        // Assert page contains "Sign in to your account"
        Assert.assertTrue(driver.getPageSource().contains("Sign in to your account"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
