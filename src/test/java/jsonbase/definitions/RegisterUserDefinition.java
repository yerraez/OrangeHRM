package jsonbase.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jsonbase.steps.RegisterUserFinders;
import jsonbase.pages.otherpagepackages.AdminPage;


import net.serenitybdd.annotations.Steps;

public class RegisterUserDefinition {

        @Steps(shared = true)
        RegisterUserFinders registerUser;


    AdminPage admin;


    @Given("the user click in the add button")
        public void the_user_click_in_the_add_button(){
            registerUser.clickAdminOption();
            registerUser.clickAddButton();
        }

        @When("the user fill the form")
        public void the_user_fill_the_form(){

            registerUser.enterUserName("timothylewis");
            registerUser.enterPassword("timothylewis12");
            registerUser.confirmPassword("timothylewis12");
            registerUser.selectUserRole();
            registerUser.selectStatusOption();
            registerUser.enterEmployeeName();
        }

        @Then("the user click in the save button")
        public void the_user_click_in_the_save_button(){
            registerUser.clickSaveButton();
        }


}
