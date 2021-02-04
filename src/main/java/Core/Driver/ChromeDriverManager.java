package Core.Driver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;

public class ChromeDriverManager extends DriverManager {
    private ChromeDriverService chromeDriverService;

    @Override
    protected void startService() {
        if (chromeDriverService == null) {
            try {
                final String driverLocation = "src/main/resources/chromedriver.exe";
                System.setProperty("webdriver.chrome.driver", driverLocation);
                chromeDriverService = new ChromeDriverService.Builder()
                        .usingDriverExecutable(new File(driverLocation))
                        .usingAnyFreePort()
                        .build();
                chromeDriverService.start();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void stopService() {
        if (chromeDriverService != null && chromeDriverService.isRunning()) {
            chromeDriverService.stop();
        }
    }

    @Override
    protected void createDriver() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
    }
}
