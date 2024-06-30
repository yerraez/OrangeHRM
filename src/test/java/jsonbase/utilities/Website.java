package jsonbase.utilities;

import net.serenitybdd.annotations.Step;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.annotations.Steps;
public class Website {
    @Steps(shared = true)
    PageObject swag;

    @Step("Login into the website")
    public void navigateTo(String url){
        swag.setDefaultBaseUrl(url);
        swag.open();

    }
}