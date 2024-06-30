package jsonbase.pages.otherpagepackages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage extends PageObject {

    @FindBy(xpath ="//span[normalize-space()='Admin']")
    protected WebElementFacade adminOption;

    @FindBy(xpath ="//button[normalize-space()='Add']")
    protected WebElementFacade btnAdd;


    @FindBy(xpath="//label[contains(., 'User Role')]//following::div[1]//div[@class='oxd-select-text-input']")
    public WebElementFacade userRoleSelector;

    @FindBy(xpath="//input[@placeholder='Type for hints...']")
    protected WebElementFacade txtEmployeeName;

    @FindBy(xpath="//div[contains(@class, 'oxd-autocomplete-dropdown')]//div[contains(text(), 'Charlotte Smit')]")
    protected WebElementFacade optionEmployeeName;

    @FindBy(xpath="//label[contains(., 'Status')]//following::div[1]//div[@class='oxd-select-text-input']")
    protected WebElementFacade statusSelector;

    @FindBy(xpath="//div[@class='oxd-form-row']//div[@class='oxd-grid-2 orangehrm-full-width-grid']//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    protected WebElementFacade txtUserName;

    @FindBy(xpath="//div[@class='oxd-grid-item oxd-grid-item--gutters user-password-cell']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    protected WebElementFacade txtPassword;

    @FindBy(xpath="//div[@class='oxd-grid-item oxd-grid-item--gutters']//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@type='password']")
    protected WebElementFacade txtConfirmPassword;

    @FindBy(xpath="(//button[normalize-space()='Save'])[1]")
    protected WebElementFacade btnSave;


}