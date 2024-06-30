package jsonbase.steps;

import jsonbase.pages.validations.ValidationLogin;
import net.serenitybdd.annotations.Step;

public class SuccessfulLoginPage extends ValidationLogin{

        @Step("Validate username authenticated")
        public Boolean userNameVisible(){
            return userName.isDisplayed();
        }

}
