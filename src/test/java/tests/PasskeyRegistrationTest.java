package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class PasskeyRegistrationTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://dev.sovio.id/sign-up");
    }

    @Test
    public void testPasskeyRegistrationPageLoads() {
        // Assert page contains "Continue with email" (or Passkey text)
        Assert.assertTrue(driver.getPageSource().contains("Continue with email"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
