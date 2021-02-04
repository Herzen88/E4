import Core.Driver.DriverManager;
import Core.Driver.DriverManagerFactory;
import Core.Driver.DriverTypes;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;


public class SeleniumTest {
    DriverManager driverManager;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        driverManager = DriverManagerFactory.getManager(DriverTypes.CHROME);
        driver = driverManager.getDriver();
    }

    @Test
    public void HelloTest() {
        driver.get("https://google.com");
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

    }

    @AfterEach()
    public void shutDown() {
        driverManager.quitDriver();
    }
}
