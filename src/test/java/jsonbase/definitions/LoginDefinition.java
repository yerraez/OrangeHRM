package jsonbase.definitions;

import jsonbase.steps.LoginFinders;
import jsonbase.steps.SuccessfulLoginPage;
import jsonbase.utilities.Website;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import net.serenitybdd.annotations.Steps;

public class LoginDefinition {
    @Steps(shared = true)
    Website url;

   @Steps(shared = true)
   LoginFinders loginFinders;

    @Steps(shared = true)
    SuccessfulLoginPage sucessLoginPage;

    @Given("the user go to the website")
    public void the_user_go_to_the_website(){
        url.navigateTo("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @When("the user enter a valid username and password")
    public void the_user_enter_a_valid_username_and_password(){
       loginFinders.enterUsername("Admin");
        loginFinders.enterPassword("admin123");
        loginFinders.clickBtnLogin();
    }

    @Then("the user enter to the website")
    public void the_user_enter_to_the_website(){
        Assert.assertTrue(sucessLoginPage.userNameVisible());
    }

}