package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserRegistrationTest {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://dev.sovio.id/sign-up");
    }

    @Test
    public void testUserRegistrationPageLoads() {
        // Assert page contains "Create an account"
        Assert.assertTrue(driver.getPageSource().contains("Create an account"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
