package jsonbase.pages.validations;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class ValidationLogin extends PageObject {

    @FindBy(xpath = "//p[@class='oxd-userdropdown-name']")
    protected WebElementFacade userName;
}