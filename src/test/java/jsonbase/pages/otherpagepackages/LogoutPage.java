package jsonbase.pages.otherpagepackages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LogoutPage extends PageObject {

    @FindBy(xpath ="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
    protected WebElementFacade userOptions;

    @FindBy(xpath ="//a[normalize-space()='Logout']")
    protected WebElementFacade logoutOption;

}
