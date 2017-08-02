package settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by DMLA0416 on 13.07.2017.
 */
public class Connector {

    public Connector() {
    }

    public WebDriver connect(Browser browser){

        WebDriver driver;

        String PathChrome = PropertySite.driverPathChrome;
        String PathMozila = PropertySite.driverPathMozila;

        switch (browser){

            case CHROME:
                System.setProperty("webdriver.chrome.driver", PathChrome);
                driver = new ChromeDriver();
              break;
            case MOZILA:
                System.setProperty("webdriver.gecko.driver", PathMozila);
                driver = new FirefoxDriver();
                break;
            default:
                System.setProperty("webdriver.chrome.driver", PathChrome);
                driver = new ChromeDriver();
        }
        
        return driver;
    };


}
