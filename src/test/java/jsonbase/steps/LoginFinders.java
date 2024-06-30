package jsonbase.steps;
import jsonbase.pages.otherpagepackages.LoginPage;
import net.serenitybdd.annotations.Step;

public class LoginFinders extends LoginPage{

    @Step("Enter username")
    public void enterUsername(String username){txtUserName.sendKeys(username);}
    @Step("Enter password")
    public void enterPassword(String password){
        txtPassword.sendKeys(password);
    }
    @Step("Enter to the login button")
    public void clickBtnLogin(){
        btnLogin.click();
    }

}