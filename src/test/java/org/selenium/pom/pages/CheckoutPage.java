package org.selenium.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.selenium.pom.base.BasePage;

public class CheckoutPage extends BasePage {
    private final By firstnameFld = By.id("billing_first_name");
    private final By lastNameFld = By.id("billing_last_name");
    private final By addressLineOneFld = By.id("billing_address_1");
    private final By billingCityFld = By.id("billing_city");
    private final By billingPostCodeFld = By.id("billing_postcode");
    private final By billingEmailFld = By.id("billing_email");
    private final By placeOrderBtn = By.id("place_order");
    private final By successNotice = By.cssSelector(".woocommerce-notice");


    private final By clickHereToLoginLink = By.className("showlogin");
    private final By usernameFld = By.id("username");
    private final By passwordFld = By.id("password");
    private final By loginBtn = By.name("login");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage enterFirstName(String firstName){
        driver.findElement(firstnameFld).clear();
        driver.findElement(firstnameFld).sendKeys(firstName);
        return this;
    }
    public CheckoutPage enterLastName(String lastName){
        driver.findElement(lastNameFld).clear();
        driver.findElement(lastNameFld).sendKeys(lastName);
        return this;
    }
    public CheckoutPage enterAddressLineOne(String addressLineOne){
        driver.findElement(addressLineOneFld).clear();
        driver.findElement(addressLineOneFld).sendKeys(addressLineOne);
        return this;
    }
    public CheckoutPage enterCity(String city){
        driver.findElement(billingCityFld).clear();
        driver.findElement(billingCityFld).sendKeys(city);
        return this;
    }
    public CheckoutPage enterPostCode(String postCode){
        driver.findElement(billingPostCodeFld).clear();
        driver.findElement(billingPostCodeFld).sendKeys(postCode);
        return this;
    }
    public CheckoutPage enterEmail(String email){
        driver.findElement(billingEmailFld).clear();
        driver.findElement(billingEmailFld).sendKeys(email);
        return this;
    }
    public CheckoutPage placeOrder(){
        driver.findElement(placeOrderBtn).click();
        return this;
    }
    public String getNotice(){
        return driver.findElement(successNotice).getText();
    }

    //
    public CheckoutPage clickHereToLoginLink(){
        driver.findElement(clickHereToLoginLink).click();
        return this;
    }

    public CheckoutPage enterUserName(String username){
        driver.findElement(usernameFld).clear();
        driver.findElement(usernameFld).sendKeys(username);
        return this;
    }

    public CheckoutPage enterPassword(String password){
        driver.findElement(passwordFld).clear();
        driver.findElement(passwordFld).sendKeys(password);
        return this;
    }

    public CheckoutPage clickLoginBtn(){
        driver.findElement(loginBtn).click();
        return this;
    }

    public CheckoutPage logged(String username, String password){
        return enterUserName(username).enterPassword(password).clickLoginBtn();
    }


}
