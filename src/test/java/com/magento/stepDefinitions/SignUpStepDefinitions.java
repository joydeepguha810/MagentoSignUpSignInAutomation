package com.magento.stepDefinitions;

import com.magento.pages.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpStepDefinitions {
    WebDriver driver = new ChromeDriver();
    SignUpPage signUpPage = new SignUpPage(driver);

    @Given("I navigate to the sign up page")
    public void i_navigate_to_the_sign_up_page() {
        driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
    }

    @When("I fill in the sign up form with {string}, {string}, {string}, and {string}")
    public void i_fill_in_the_sign_up_form(String firstName, String lastName, String email, String password) {
        signUpPage.signUp(firstName, lastName, email, password);
    }
}
