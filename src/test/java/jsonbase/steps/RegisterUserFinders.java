package jsonbase.steps;

import jsonbase.pages.otherpagepackages.AdminPage;
import net.serenitybdd.annotations.Step;
import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;


import org.openqa.selenium.By;

public class RegisterUserFinders extends AdminPage{

    @Step("Select Admin option")
    public void clickAdminOption(){adminOption.click();}
    @Step("Click in the Add button")
    public void clickAddButton(){btnAdd.click();}
    @Step("Enter username")
    public void enterUserName(String userName){txtUserName.sendKeys(userName);}
    @Step("Enter password")
    public void enterPassword(String password){txtPassword.sendKeys(password);}
    @Step("Confirm password")
    public void confirmPassword(String confirmPassword){txtConfirmPassword.sendKeys(confirmPassword);}
    @Step("Select User Role option")
    public void selectUserRole(){
        userRoleSelector.sendKeys(Keys.DOWN);
        userRoleSelector.sendKeys(Keys.DOWN);
        userRoleSelector.sendKeys(Keys.ENTER);
    }
    @Step("Select Status option")
    public void selectStatusOption(){
        statusSelector.sendKeys(Keys.DOWN);
        statusSelector.sendKeys(Keys.DOWN);
        statusSelector.sendKeys(Keys.ENTER);
    }

    @Step("Select Employee name")
    public void enterEmployeeName(){
        txtEmployeeName.sendKeys("charlo");
        txtEmployeeName.sendKeys(Keys.DOWN);
        txtEmployeeName.sendKeys(Keys.ENTER);

    }
    @Step("Click in the Save Button")
    public void clickSaveButton(){btnSave.click();}


}


