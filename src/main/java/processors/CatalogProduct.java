package processors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.*;

/**
 * Created by Dimas on 17.07.2017.
 */
public class CatalogProduct {

    List<WebElement> listOfProducts;
    List<WebElement> listOfNamesProducts;
    List<WebElement> listOfEmptyProducts;
    ArrayList<Integer> indexes = new ArrayList<Integer>();


    List<WebElement> checkBoxesTocheck;




    public CatalogProduct(WebDriver driver){


        listOfProducts = driver.findElements(By.xpath("(//table[1]/tbody/tr/td[2])"));
        listOfNamesProducts = driver.findElements(By.xpath("(//table[1]/tbody/tr/td[1])"));
        listOfEmptyProducts = listOfNamesProducts.subList(0,0);
        System.out.println("Empty: " + listOfEmptyProducts);

        for (int i = 0; i < listOfProducts.size(); i++){
            System.out.println("Element: "+ listOfProducts.get(i) +"  with text: " + listOfProducts.get(i).getText());
            if (listOfProducts.get(i).getText().equals("0")){
                indexes.add(i);
              //  System.out.println(listOfNamesProducts.get(i).getText());
                listOfEmptyProducts.add(listOfNamesProducts.get(i));
            }
        }
        System.out.println(indexes);

        for (WebElement k:listOfEmptyProducts) {
            System.out.println("Element: "+ k.getLocation() +"  with text: " + k.getText());
        }


       listOfEmptyProducts.get(2).findElement(By.tagName("a")).click();

        checkBoxesTocheck = driver.findElements(By.xpath("//table[1]/tbody/tr/td[2]/input"));

        for (WebElement k:checkBoxesTocheck) {
            System.out.println("Element: "+ k.getLocation() +"  with text: " + k.getText());
            k.click();
        }

        driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();


    }

}
