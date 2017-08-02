package processors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by DMLA0416 on 13.07.2017.
 */
public class Login {

    private String LoginURL = "/users/login";
    private String Capcha = "null";

    private String tagNameLogin = "email";
    private String tagNamePassword = "password";
    private String tagNameCapcha = "confirmationcode";

public Login(WebDriver driver, String URL, String Login, String Password){

    driver.get(URL + LoginURL);


    driver.findElement(By.name(tagNameLogin)).clear();
    driver.findElement(By.name(tagNameLogin)).sendKeys(Login);

    driver.findElement(By.name(tagNamePassword)).clear();
    driver.findElement(By.name(tagNamePassword)).sendKeys(Password);

    driver.findElement(By.name(tagNameCapcha)).clear();
    driver.findElement(By.name(tagNameCapcha)).sendKeys(Capcha);

    driver.findElement(By.id("submit")).click();


}





}
