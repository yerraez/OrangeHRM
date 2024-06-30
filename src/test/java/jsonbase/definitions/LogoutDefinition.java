package jsonbase.definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jsonbase.steps.LogoutFinders;
import net.serenitybdd.annotations.Steps;

public class LogoutDefinition {

        @Steps(shared = true)
        LogoutFinders logoutFinders;

        @Given("the user click in user options")
        public void the_user_click_in_user_options(){
            logoutFinders.selectUsername();
        }

        @Then("select logout option")
        public void select_logout_option(){
            logoutFinders.logoutOption();
        }

}
