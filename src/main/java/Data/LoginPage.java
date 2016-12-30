package Data;

import MainPage.MainPage;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by spirit on 03.12.16.
 */
public class LoginPage extends MainPage {

    SelenideElement loginButton = $(".btn.login_btn");
    ElementsCollection inputFields = $$(".input_wrapper > input");



    private void clickOnLoginButton() {
        loginButton.click();
    }

    private void fillUsername(String username) {
        inputFields.get(0).val(username);
    }

    private void fillPassword(String password) {
        inputFields.get(1).val(password);
    }



    public void loginToAccount(String username, String password) {

        fillUsername(username);
        fillPassword(password);
        clickOnLoginButton();
    }
}
