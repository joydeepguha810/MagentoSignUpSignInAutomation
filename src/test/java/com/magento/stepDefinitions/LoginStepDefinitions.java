package com.magento.stepDefinitions;

import com.magento.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinitions {
    WebDriver driver = new ChromeDriver();
    LoginPage loginPage = new LoginPage(driver);

    @When("I log in with email {string} and password {string}")
    public void i_log_in_with_email_and_password(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("I should be logged in successfully")
    public void i_should_be_logged_in_successfully() {
        // Add validation logic to verify login was successful
    }
}
