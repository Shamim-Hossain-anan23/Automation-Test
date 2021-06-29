import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
public class Base {
    public static String browser = "Firefox"; // This is come frome external file -XLS, CSV etc.
    public static WebDriver driver;
    public static WebDriver getDriver(){

        if(browser.equals("Firefox")){
            System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
            driver = new FirefoxDriver();

        } else if(browser.equals("Chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
            driver = new ChromeDriver();


        } else if (browser.equals("Edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\edge.exe");
            driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}

