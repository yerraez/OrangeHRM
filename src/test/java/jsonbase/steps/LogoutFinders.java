package jsonbase.steps;

import net.serenitybdd.annotations.Step;
import jsonbase.pages.otherpagepackages.LogoutPage;

public class LogoutFinders extends LogoutPage {
    @Step("Click in the username")
    public void selectUsername(){userOptions.click();}
    @Step("Select logout option")
    public void logoutOption(){logoutOption.click();}


}
