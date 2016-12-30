package MainPage;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

/**
 * Created by spirit on 03.12.16.
 */
public class MainPage {

    SelenideElement cartButton = $(".elem_nav.cart");
    ElementsCollection menuNavButtons = $$(".elem_nav.dropdown_opener");
    ElementsCollection menuButtons = $$(".elem_menu.dropdown_opener");
    SelenideElement allSearchButton = $(".btn_all");
    SelenideElement searchField = $("#top_search_input");
    SelenideElement searchButton = $(".btn_search");

    public void clickOnCartButton(){
        cartButton.click();
    }
    public void clickOnYourAccount(){
        menuNavButtons.get(0).click();
    }
    public void clickOnCustomerService(){
        menuNavButtons.get(1).click();
    }
    public void clickOnWishList(){
        menuNavButtons.get(2).click();
    }
    public void clickOnGiftCards(){
        menuButtons.get(0).click();
    }
    public void clickOnShippingDiscount(){ menuButtons.get(1).click(); }
    public void clickOnCuponsAndDeals(){
        menuButtons.get(2).click();
    }
    public void clickOnSearchButton(){
        searchButton.click();
    }
    public void fillSearchRequest(String word) {
        searchField.val(word);
    }

}
