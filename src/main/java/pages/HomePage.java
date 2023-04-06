package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver = null;

    By newCustomer = By.xpath("/html/body/div[3]/div/ul/li[2]/a");



    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void addNewCustomer () {
        driver.findElement(newCustomer).click();
    }



}

