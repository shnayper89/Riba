package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by spirit on 1/6/17.
 */
public class LoginPage extends MainPage {
    @FindBy(name = "email") WebElement fieldLogin;
    @FindBy(name = "password") WebElement fieldPassword;
    @FindBy(className = "login_btn") WebElement buttonLogin;

    public LoginPage (WebDriver driver) {
        super(driver);
    }

    public void fillLogin(String login) {fieldLogin.sendKeys(login);}
    public void fillPassword(String password) {fieldPassword.sendKeys(password);}
    public void pressLoginButton() {buttonLogin.click();}

    public void signIn(String login, String password){
        fillLogin(login);
        fillPassword(password);
        pressLoginButton();
    }
}
