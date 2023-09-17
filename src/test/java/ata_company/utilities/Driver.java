package ata_company.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {


    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<WebDriver>();


    private Driver() {
    }


    public synchronized static WebDriver getDriver() {

        if (driverPool.get() == null) {

            String browser = ConfigurationReader.getProperty("browser").toLowerCase();
            switch (browser) {
                case "chrome":
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    WebDriver driver = new ChromeDriver(options);
                    options.addArguments("--start-maximized");
                    driverPool.set(new ChromeDriver(options));
                    break;
                case "chromeheadless":
                    //to run chrome without interface (headless mode)
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions optionss = new ChromeOptions();
                    optionss.setHeadless(true);
                    driverPool.set(new ChromeDriver(optionss));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    break;
                default:
                    throw new RuntimeException("Wrong browser name !");
            }
        }
        return driverPool.get();
    }


    public static void closeDriver() {
        if (driverPool != null) {
            driverPool.get().quit();
            driverPool.remove();
        }
    }
}
