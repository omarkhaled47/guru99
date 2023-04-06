package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver = null;

    By userID = By.name("uid");
    By userPassword = By.name("password");
    By login = By.name("btnLogin");
    By reset = By.name("btnReset");

    By welcomeMess = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td/marquee");



    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterID (String text) {
        driver.findElement(userID).sendKeys(text);
    }

    public void enterPass (String text) {
        driver.findElement(userPassword).sendKeys(text);
    }

    public void login () {
        driver.findElement(login).click();
    }

    public void reset () {
        driver.findElement(reset).click();
    }

    public void handleAlert () {
        Alert simpleAlert = driver.switchTo().alert();
        simpleAlert.accept();
    }

    public String alertMessage () {
        Alert simpleAlert = driver.switchTo().alert();
        String msg = simpleAlert.getText();
        return msg;
    }


    public String welcomeMessage (){
        String welcome = driver.findElement(welcomeMess).getText();
        return welcome;
    }
}
