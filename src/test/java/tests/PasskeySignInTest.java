package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PasskeySignInTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://dev.sovio.id/sign-in");
    }

    @Test
    public void testPasskeySignInPageLoads() {
        // Assert page contains "Continue with passkey"
        Assert.assertTrue(driver.getPageSource().contains("Passkey"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
