package jsonbase.pages.otherpagepackages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {

    @FindBy(xpath = "//input[@placeholder='Username']")
    protected WebElementFacade txtUserName;

    @FindBy(xpath ="//input[@placeholder='Password']")
    protected WebElementFacade txtPassword;

    @FindBy(xpath="(//button[normalize-space()='Login'])[1]")
    protected WebElementFacade btnLogin;
}