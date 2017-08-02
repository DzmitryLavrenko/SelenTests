package settings;

import org.apache.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Dimas on 16.07.2017.
 */
public class PropertySite {

    public static String driverPathChrome;
    public static String driverPathMozila;

    public static String URL;
    public static String Login;
    public static String Password;


    public static void setPropertySite()
    {
        FileInputStream fis;
        Properties property = new Properties();
        final Logger log = Logger.getLogger(PropertySite.class);

        try {
            fis = new FileInputStream("src/main/resources/settings.properties");
            property.load(fis);

            URL = property.getProperty("url");
            Login = property.getProperty("login");
            Password = property.getProperty("password");

            driverPathChrome = property.getProperty("driverChrome");
            driverPathMozila = property.getProperty("driverMozila");

           // System.out.println("HOST: " + URL + ", LOGIN: " + Login + ", PASSWORD: " + Password);
            log.info("Adress Mozila driver: " + driverPathMozila);

        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }


    }














}
