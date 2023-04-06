package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewCustomerPage {
    WebDriver driver = null;

    By customerName = By.xpath("//input[@name='name']");
    By radioMale = By.xpath("//input[@value='m']");
    By radioFemale = By.xpath("//input[@value='f']");
    By date = By.xpath("//input[@name='dob']");
    By address = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea");
    By city = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input");
    By state = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input");
    By pin = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input");
    By mobileNumber = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input");
    By email = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input");
    By password = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input");
    By invalidPin = By.xpath("//*[@id=\"message6\"]");
    By invalidNumber = By.xpath("//*[@id=\"message7\"]");
    By emptyCustomerName = By.xpath("//*[@id=\"message\"]");
    By submit = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]");
    By reset = By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[2]");


    public NewCustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void addCustomerName (String text) {
        driver.findElement(customerName).sendKeys(text);
    }

    public void selectMale () {
        driver.findElement(radioMale).click();
    }

    public void selectFemale () {
        driver.findElement(radioFemale).click();
    }

    public void dateOfBirth (String text) {
        driver.findElement(date).sendKeys(text);
    }

    public void setAddress (String text) {
        driver.findElement(address).sendKeys(text);
    }

    public void setCity (String text) {
        driver.findElement(city).sendKeys(text);
    }

    public void setState (String text) {
        driver.findElement(state).sendKeys(text);
    }

    public void setPin (String text) {
        driver.findElement(pin).sendKeys(text);
    }

    public void setMobileNumber (String text) {
        driver.findElement(mobileNumber).sendKeys(text);
    }

    public void setEmail (String text) {
        driver.findElement(email).sendKeys(text);
    }

    public void setPassword (String text) {
        driver.findElement(password).sendKeys(text);
    }

    public String invalidPIN () {
        String errorMsg = driver.findElement(invalidPin).getText();
        return errorMsg;
    }

    public String invalidNumber () {
        String errorMsg = driver.findElement(invalidNumber).getText();
        return errorMsg;
    }

    public String emptyCustomerName () {
        String errorMsg = driver.findElement(emptyCustomerName).getText();
        return errorMsg;
    }

    public void addNewCustomerSucess () {
        driver.findElement(submit).click();
    }

    public void reset () {
        driver.findElement(reset).click();
    }

}
