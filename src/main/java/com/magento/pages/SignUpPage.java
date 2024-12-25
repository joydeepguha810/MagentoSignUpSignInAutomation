package com.magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPage {
    WebDriver driver;

    // Locators
    By createAccountButton = By.xpath("//div[@class='panel header']//a[contains(text(),'Create an Account')]");
    By firstNameField = By.id("firstname");
    By lastNameField = By.id("lastname");
    By emailField = By.id("email_address");
    By passwordField = By.id("password");
    By confirmPasswordField = By.id("password-confirmation");
    By signUpSubmitButton = By.xpath("//button[@title='Create an Account']");

    // Constructor
    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    // Actions
    public WebElement getCreateAccountButton() {
        return driver.findElement(createAccountButton);
    }

    public WebElement getFirstNameField() {
        return driver.findElement(firstNameField);
    }

    public WebElement getLastNameField() {
        return driver.findElement(lastNameField);
    }

    public WebElement getEmailField() {
        return driver.findElement(emailField);
    }

    public WebElement getPasswordField() {
        return driver.findElement(passwordField);
    }

    public WebElement getConfirmPasswordField() {
        return driver.findElement(confirmPasswordField);
    }

    public WebElement getSignUpSubmitButton() {
        return driver.findElement(signUpSubmitButton);
    }

    // Method to fill out sign-up form
    public void signUp(String firstName, String lastName, String email, String password) {
        getFirstNameField().sendKeys(firstName);
        getLastNameField().sendKeys(lastName);
        getEmailField().sendKeys(email);
        getPasswordField().sendKeys(password);
        getConfirmPasswordField().sendKeys(password);
        getSignUpSubmitButton().click();
    }
}
