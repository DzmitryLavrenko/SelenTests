
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import processors.CatalogProduct;
import processors.Login;
import settings.Browser;
import settings.Connector;
import settings.PropertySite;


/**
 * Created by DMLA0416 on 07.07.2017.
 */
public class Main {

    public static void main(String[] args) {

      final Logger log = Logger.getLogger(Main.class);

        log.info("Set properties");
        PropertySite.setPropertySite();
        log.info("Connect");
        Connector connector = new Connector();
        log.info("Set browser");
        WebDriver driver = connector.connect(Browser.MOZILA);
        log.info("Navigate to url");
        driver.get(PropertySite.URL);

      //  Login login = new Login(driver, PropertySite.URL, PropertySite.Login, PropertySite.Password);


        CatalogProduct products = new CatalogProduct(driver);

        driver.quit();


    }

}
